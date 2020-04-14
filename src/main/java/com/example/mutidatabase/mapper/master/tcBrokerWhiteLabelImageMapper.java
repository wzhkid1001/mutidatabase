package com.example.mutidatabase.mapper.master;

import org.apache.ibatis.annotations.Param;

public interface tcBrokerWhiteLabelImageMapper {

    String selectTest();

    int insert(@Param("url") String url);
}