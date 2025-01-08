package com.zutjmx.curso.springboot.app.interceptor.springbootinterceptor.interceptors;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class TiempoDeCargaInterceptor implements HandlerInterceptor {

    @SuppressWarnings("null")
    @Override
    public void postHandle(
        HttpServletRequest request, 
        HttpServletResponse response, 
        Object handler,
        @Nullable ModelAndView modelAndView
    ) throws Exception {
        
        
    }

    @SuppressWarnings("null")
    @Override
    public boolean preHandle(
        HttpServletRequest request, 
        HttpServletResponse response, 
        Object handler
    ) throws Exception {
        return true;
    }

}
