package com.zhang.boot2.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponseVO<T> {
    private int code;
    private String msg;
    private T data;

    public static <T> ResponseVO success(T data) {
        ResponseVO result = new ResponseVO();
        result.code = 200;
        result.msg = "成功";
        result.data = data;
        return result;
    }

    public static <T> ResponseVO errot(T data) {
        ResponseVO result = new ResponseVO();
        result.code = 401;
        result.msg = "失败";
        result.data = data;
        return result;
    }
}
