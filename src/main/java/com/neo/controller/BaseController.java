package com.neo.controller;

import com.neo.entity.BaseEntity;
import com.neo.entity.Result;
import com.neo.entity.UserEntity;
import com.neo.enums.EResultType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

public class BaseController<T extends BaseEntity> {


    @Autowired
    HttpSession session;


    public UserEntity getSessionUser() {
        return (UserEntity) session.getAttribute("username");
    }

    protected Logger logger = LogManager.getLogger(getClass().getName());


    protected Result retResultData(EResultType type) {
        return new Result(type);
    }

    protected Result retResultData(EResultType type, Object data) {
        return new Result(type, data);
    }

    protected Result retResultData(Integer code, String message) {
        return new Result(code, message);
    }

    protected Result retResultData(Integer code, String message, Object data) {
        return new Result(code, message, data);
    }


}
