package com.example.demo.modules.test.mapper;

import com.example.demo.modules.test.entity.Usertable;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TestMapper {

    Usertable getData(String id);
}
