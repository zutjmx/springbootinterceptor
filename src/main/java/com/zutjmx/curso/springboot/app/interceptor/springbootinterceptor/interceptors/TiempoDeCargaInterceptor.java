package com.zutjmx.curso.springboot.app.interceptor.springbootinterceptor.interceptors;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("tiempoInterceptor")
public class TiempoDeCargaInterceptor implements HandlerInterceptor {

    private static final Logger Logger = LoggerFactory.getLogger(TiempoDeCargaInterceptor.class);

    @SuppressWarnings("null")
    @Override
    public void postHandle(
        HttpServletRequest request, 
        HttpServletResponse response, 
        Object handler,
        @Nullable ModelAndView modelAndView
    ) throws Exception {
        //Para medir tiempo transcurrido ini
        long tiempoFinal = System.currentTimeMillis();
        long tiempoInicio = (long) request.getAttribute("tiempoInicio");
        long tiempoTranscurrido = tiempoFinal - tiempoInicio;
        if (handler instanceof HandlerMethod) {
            Logger.info("tiempoTranscurrido: " + tiempoTranscurrido + " en milisegundos");
        }
        //Para medir tiempo transcurrido fin

        Logger.info("Controlador: " + ((HandlerMethod) handler).getMethod().getName());
        Logger.info("TiempoDeCargaInterceptor: postHandle() llamado");        
    }

    @SuppressWarnings("null")
    @Override
    public boolean preHandle(
        HttpServletRequest request, 
        HttpServletResponse response, 
        Object handler
    ) throws Exception {
        HandlerMethod controlador = (HandlerMethod) handler;
        Logger.info("Controlador: " + controlador.getMethod().getName());
        Logger.info("TiempoDeCargaInterceptor: preHandle() llamado");
        
        //Simular demora ini
        long tiempoInicio = System.currentTimeMillis();
        request.setAttribute("tiempoInicio", tiempoInicio);
        Random random = new Random();
        Integer demora = random.nextInt(2000);
        Thread.sleep(demora);
        //Simular demora fin
        
        return true;
    }

}
