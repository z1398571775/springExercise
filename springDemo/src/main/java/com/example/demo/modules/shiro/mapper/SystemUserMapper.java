package com.example.demo.modules.shiro.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SystemUserMapper {
    @Select("select count(id) from user_manager where name = #{username} and password = #{password}")
    int checkUser(String username,String password);
}
