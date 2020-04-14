package com.example.mutidatabase.controller;

import com.example.mutidatabase.mapper.master.tcBrokerWhiteLabelImageMapper;
import com.example.mutidatabase.mapper.slave.tcBrokerWhiteLabelImageSimuMapper;
import com.example.mutidatabase.service.SimuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private tcBrokerWhiteLabelImageMapper tcBrokerWhiteLabelImageMapper;
    @Autowired
    private tcBrokerWhiteLabelImageSimuMapper tcBrokerWhiteLabelImageSimuMapper;

    @Autowired
    private SimuService simuService;
    @GetMapping("/get")
    @Transactional
    public String get() throws InterruptedException {
        System.out.println(tcBrokerWhiteLabelImageMapper.selectTest());
        System.out.println(tcBrokerWhiteLabelImageSimuMapper.selectTest1());
        simuService.ins();
        return "get无参请求成功";
    }
}
