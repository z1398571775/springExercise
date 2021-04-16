package com.example.demo.modules.shiro.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "user_manager")
public class SystemUser implements Serializable {
    @Serial
    private static final long serialVersionUID = -1617222008249887968L;

    /***
     * 唯一主键
     */
    @Id
    @GenericGenerator(name = "id",strategy = "uuid")
    @GeneratedValue(generator = "id")
    @Column(updatable = false)
    private String id;
    /***
     * 用户名称
     */
    private String name;
    /***
     * 用户密码
     */
    private String password;
    /***
     * 权限规则
     */
    private String role;
    /***
     * 创建时间
     */
    private Date createtime;
}
