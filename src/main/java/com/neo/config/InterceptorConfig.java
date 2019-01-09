package com.neo.config;

/**
 * Created by liudong on 2018/6/8.
 */

import com.alibaba.fastjson.JSON;
import com.neo.entity.Result;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;


public class InterceptorConfig extends HandlerInterceptorAdapter {

    /**
     * 进入controller层之前拦截请求
     *
     * @param request
     * @param response
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

//        log.info("---------------------开始进入请求地址拦截----------------------------");
        HttpSession session = request.getSession();
        if (!StringUtils.isEmpty(session.getAttribute("username"))) {
            return true;
        } else {
            // 跳转登录
//            String url = "/login";
//            response.sendRedirect(url);
            PrintWriter printWriter = response.getWriter();
            printWriter.write(JSON.toJSONString(new Result(-1, "please login")));
            response.setContentType("application/json;charset=UTF-8");
            return false;
        }
    }

}