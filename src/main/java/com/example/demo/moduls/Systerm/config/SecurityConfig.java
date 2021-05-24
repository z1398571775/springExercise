package com.example.demo.moduls.Systerm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);

        //转到登录页面
        http
                .formLogin()
                .loginPage("/login/goLogin");
        //拦截请求
        http
                .authorizeRequests()
                .antMatchers("/login/goLogin").permitAll()
                .anyRequest().authenticated();



    }
}
