package com.example.demo.moduls.Systerm.service;

import com.example.demo.moduls.Systerm.entity.Result;
import com.example.demo.moduls.Systerm.entity.SystemUser;

public interface LoginService {
    /***
     * 检查用户名是否重复
     * @param userName
     * @return
     */
    boolean checkUserNeme(String userName);

    /***
     * 添加用户
     * @param systemUser
     * @return
     */
    boolean addUser(SystemUser systemUser);
}
