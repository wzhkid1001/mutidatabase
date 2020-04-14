package com.example.mutidatabase.mapper.slave;

import org.apache.ibatis.annotations.Param;

public interface tcBrokerWhiteLabelImageSimuMapper {
    String selectTest1();

    int insert(@Param("url") String url);
}