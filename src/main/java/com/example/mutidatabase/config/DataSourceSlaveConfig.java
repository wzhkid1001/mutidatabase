package com.example.mutidatabase.config;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties
@EnableAutoConfiguration
@MapperScan(basePackages = DataSourceSlaveConfig.PACKAGE, sqlSessionTemplateRef = "slaveSqlSessionTemplate")
public class DataSourceSlaveConfig {

    // 精确到 master 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.example.mutidatabase.mapper.slave";
    static final String MAPPER_LOCATION = "classpath:mapper/slave/*.xml";

    @Bean
    @ConfigurationProperties(prefix = "spring.jta.atomikos.datasource.slave")
    public DataSource dataSourceSlave() {
        return new AtomikosDataSourceBean();
    }

    @Bean
    public SqlSessionFactory slaveSqlSessionFactory(@Qualifier("dataSourceSlave") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION));
        bean.setTypeAliasesPackage(DataSourceSlaveConfig.PACKAGE);
        return bean.getObject();
    }

    @Bean
    public SqlSessionTemplate slaveSqlSessionTemplate(
            @Qualifier("slaveSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}