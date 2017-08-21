package com.ls.chapter3_1_6.advice;

import com.ls.chapter3_1_6.ErrorInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常处理类
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    public static String DEFAULT_ERROR_VIEW = "error";

    /**
     * 返回的是页面
     */
//    @ExceptionHandler(value = Exception.class)
//    public ModelAndView defaultErrorHander(HttpServletRequest req,Exception e) {
//        ModelAndView model = new ModelAndView();
//        model.addObject("exception",e);
//        model.addObject("url",req.getRequestURL());// url
//        model.setViewName(DEFAULT_ERROR_VIEW);
//        return model;
//    }

    /**
     * 返回json
     */
    @ExceptionHandler
    @ResponseBody
    public ErrorInfo<String> defaultErrorHander_json(HttpServletRequest req,Exception e) {
        ErrorInfo<String> info = new ErrorInfo<>();
        info.setMessage(e.getMessage());
        info.setCode(info.getCode());
        info.setData("data xxx");
        info.setUrl(req.getRequestURL().toString());
        return info;
    }
}
