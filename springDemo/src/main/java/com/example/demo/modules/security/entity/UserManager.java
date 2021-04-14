package com.example.demo.modules.security.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("user_manager")
public class UserManager {
    /***
     * 主键id
     */
    @TableId(value = "id",type = IdType.ASSIGN_UUID)
    private String id;
    /***
     * 用户名称
     */
    @TableField("name")
    private String name;
    /***
     * 用户密码
     */
    @TableField("password")
    private String password;
    /***
     * 用户规则
     */
    @TableField("role")
    private String role;
}
