package com.example.demo.modules.shiro.service.impl;

import com.example.demo.modules.shiro.mapper.SystemUserMapper;
import com.example.demo.modules.shiro.service.SystemUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemUserServiceImpl implements SystemUserService {
    @Autowired
    SystemUserMapper userMapper;
    @Override
    public boolean deLogin(String username, String password) {
        boolean istrue = userMapper.checkUser(username,password) == 1;
        if(istrue){
            UsernamePasswordToken token = new UsernamePasswordToken(username,password);
            token.setRememberMe(true);
            Subject currentUser = SecurityUtils.getSubject();
            currentUser.login(token);
        }
        return istrue;
    }
}
