package com.example.demo.modules.system.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 错误码
     */
    private int status;

    /**
     * 提示消息
     */
    private String msg;

    /**
     * 返回的数据体
     */
    private T data;

    /**
     * 失败时生成result的方法
     */
    public static <T> Result<T> error(String msg){
        Result<T> result = new Result<>();
        result.setStatus(500);
        result.setMsg(msg);
        return result;
    }
}
