package com.example.demo.moduls.Systerm.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@TableName("user_manager")
@Data
@ApiModel(value = "SystemUser",description = "对应user_manager表，用户的信息")
public class SystemUser implements Serializable {
    @Serial
    private static final long serialVersionUID = 4467142000287072643L;
    @Id
    @TableId
    @ApiModelProperty(value = "唯一标识",name = "id",dataType = "String",notes = "自动生成uuid")
    private String id;
    @ApiModelProperty(value = "用户的名字",name = "name",dataType = "String")
    private String name;
    @ApiModelProperty(value = "用户密码",name = "password",dataType = "String")
    private String password;
    @ApiModelProperty(value = "用户角色",name = "role",dataType = "String")
    private String role;
    @ApiModelProperty(value = "创建时间",name = "createtime",dataType = "Date")
    private Date createtime;
}
