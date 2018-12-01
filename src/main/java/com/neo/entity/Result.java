package com.neo.entity;

import com.neo.enums.EResultType;

/**
 * Created by liudong on 2018/6/11.
 */
public class Result {
    /*返回码*/
    private Integer code;
    /*返回信息提示*/
    private String msg;
    /*返回的数据*/
    private Object data;

    public Result() {
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(EResultType type,Object data) {
        this.code = type.getCode();
        this.msg = type.getMsg();
        this.data = data;
    }

    public Result(EResultType type) {
        this.code = type.getCode();
        this.msg = type.getMsg();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
