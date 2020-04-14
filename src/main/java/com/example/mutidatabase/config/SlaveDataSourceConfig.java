//package com.example.mutidatabase.config;
//import javax.sql.DataSource;
//
//import com.alibaba.druid.pool.xa.DruidXADataSource;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//
//import com.alibaba.druid.pool.DruidDataSource;
//
//@Configuration
//// 扫描 Mapper 接口并容器管理
//@MapperScan(basePackages = SlaveDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "slaveSqlSessionFactory")
//public class SlaveDataSourceConfig {
//
//    // 精确到 slave 目录，以便跟其他数据源隔离
//    static final String PACKAGE = "com.example.mutidatabase.mapper.slave";
//    static final String MAPPER_LOCATION = "classpath:mapper/slave/*.xml";
//
//    @Value("${slave.datasource.url}")
//    private String url;
//
//    @Value("${slave.datasource.username}")
//    private String user;
//
//    @Value("${slave.datasource.password}")
//    private String password;
//
//    @Value("${slave.datasource.driverClassName}")
//    private String driverClass;
//
//    @Bean(name = "slaveDataSource")
//    public DataSource slaveDataSource() {
//        DruidXADataSource dataSource = new DruidXADataSource();
//        dataSource.setDriverClassName(driverClass);
//        dataSource.setUrl(url);
//        dataSource.setUsername(user);
//        dataSource.setPassword(password);
//
//        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
//        xaDataSource.setXaDataSource(dataSource);
//        xaDataSource.setUniqueResourceName("slaveDataSource");
//        return dataSource;
//    }
//
////    @Bean(name = "slaveTransactionManager")
////    public DataSourceTransactionManager slaveTransactionManager() {
////        return new DataSourceTransactionManager(slaveDataSource());
////    }
//
//    @Bean(name = "slaveSqlSessionFactory")
//    public SqlSessionFactory slaveSqlSessionFactory(@Qualifier("slaveDataSource") DataSource slaveDataSource)
//            throws Exception {
//        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(slaveDataSource);
//        sessionFactory.setMapperLocations(
//                new PathMatchingResourcePatternResolver().getResources(SlaveDataSourceConfig.MAPPER_LOCATION));
//        return sessionFactory.getObject();
//    }
//}