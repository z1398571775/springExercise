package com.example.demo.moduls.Systerm.entity;

import com.alibaba.fastjson.annotation.JSONField;
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
    @ApiModelProperty(value = "唯一标识")
    private String id;
    @ApiModelProperty(value = "用户的名字")
    private String name;
    @ApiModelProperty(value = "用户密码")
    private String password;
    @ApiModelProperty(value = "用户角色")
    private String role;
    @ApiModelProperty(value = "创建时间")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;
}
