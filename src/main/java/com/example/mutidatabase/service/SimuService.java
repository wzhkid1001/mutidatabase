package com.example.mutidatabase.service;

import com.example.mutidatabase.mapper.master.tcBrokerWhiteLabelImageMapper;
import com.example.mutidatabase.mapper.slave.tcBrokerWhiteLabelImageSimuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SimuService {

    @Autowired
    tcBrokerWhiteLabelImageSimuMapper tcBrokerWhiteLabelImageSimuMapper;

    @Autowired
    tcBrokerWhiteLabelImageMapper tcBrokerWhiteLabelImageMapper;

    public void insert(String url) {
        System.out.println(1);
        tcBrokerWhiteLabelImageSimuMapper.insert(url);
    }
@Transactional
    public void ins() {
        tcBrokerWhiteLabelImageSimuMapper.insert("url72");
        tcBrokerWhiteLabelImageMapper.insert("url73");
        ins2();
        int i = 1 / 0;
    }
    public void ins2() {
        tcBrokerWhiteLabelImageSimuMapper.insert("url74");
    }
}
