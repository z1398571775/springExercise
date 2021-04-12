package com.example.demo.modules.test.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Usertable {
    @Id
    private String id;
    private String username;
    private String password;
}
