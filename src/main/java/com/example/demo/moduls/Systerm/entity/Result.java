package com.example.demo.moduls.Systerm.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@ApiModel(value = "Result",description = "请求返回通用类")
public class Result<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = -4998400090545719026L;
    @ApiModelProperty(value = "状态码")
    private Integer code;
    @ApiModelProperty(value = "返回的消息")
    private String msg;
    @ApiModelProperty(value = "返回的数据")
    private T data;
    @ApiModelProperty(value = "是否成功")
    private boolean isSuccess;

    public Result<T> success(String message){
        Result<T> result = new Result<>();
        result.setSuccess(true);
        result.setMsg(message);
        result.setCode(200);
        return result;
    }

    public Result<T> error(String message){
        Result<T> result = new Result<>();
        result.setSuccess(false);
        result.setMsg(message);
        result.setCode(500);
        return result;
    }
}
