package com.example.demo.moduls.Systerm.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@ApiModel(value = "Result",description = "请求返回通用类")
public class Result<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = -4998400090545719026L;
    @ApiModelProperty(value = "状态码",name = "code",dataType = "Integer")
    private Integer code;
    @ApiModelProperty(value = "返回的消息",name = "msg",dataType = "String")
    private String msg;
    @ApiModelProperty(value = "返回的数据",name = "data",dataType = "T",notes = "一般为实体对象")
    private T data;
}
