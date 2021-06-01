package com.example.demo.moduls.Systerm.service.serviceImpl;

import com.example.demo.moduls.Systerm.entity.SystemUser;
import com.example.demo.moduls.Systerm.mapper.SystemUserMapper;
import com.example.demo.moduls.Systerm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    SystemUserMapper userMapper;
    @Override
    public boolean checkUserNeme(String userName) {
        return false;
    }

    @Override
    public boolean addUser(SystemUser systemUser) {
        return userMapper.insert(systemUser) == 1;
    }
}
