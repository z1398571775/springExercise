package com.example.demo.modules.shiro.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "user_manager")
public class SystemUser {
    @Id
    private String id;
}
