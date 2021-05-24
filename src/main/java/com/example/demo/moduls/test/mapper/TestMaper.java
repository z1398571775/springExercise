package com.example.demo.moduls.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.moduls.Systerm.entity.SystemUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMaper extends BaseMapper<SystemUser> {
}
