package com.example.demo.modules.test.service.impl;

import com.example.demo.modules.test.entity.Usertable;
import com.example.demo.modules.test.mapper.TestMapper;
import com.example.demo.modules.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServicelImpl implements TestService {
    @Autowired
    TestMapper testMapper;
    @Override
    public Usertable getData(String id) {
        return testMapper.getData(id);
    }
}
