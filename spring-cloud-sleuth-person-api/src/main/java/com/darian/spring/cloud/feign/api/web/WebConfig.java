package com.darian.spring.cloud.feign.api.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * <br>通用增加日志
 * <br>Darian
 **/
public class WebConfig extends WebMvcConfigurerAdapter {

    private final Logger logger = LoggerFactory.getLogger(WebConfig.class);

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HandlerInterceptorAdapter() {
            @Override
            public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
                super.postHandle(request, response, handler, modelAndView);
                logger.info("Request URI： {}" + request.getRequestURI());
            }
        });
    }
}
