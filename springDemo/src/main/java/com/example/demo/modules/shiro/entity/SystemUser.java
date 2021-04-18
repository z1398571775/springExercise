package com.example.demo.modules.shiro.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "user_manager")
public class SystemUser {
    @Id
    private String id;
    private String name;
    private String password;
    private Date createtime;
}
