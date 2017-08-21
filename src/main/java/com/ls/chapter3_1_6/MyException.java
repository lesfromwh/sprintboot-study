package com.ls.chapter3_1_6;

/**
 * create by liushuang Date:2017/8/21 Time:11:30
 * 自定义异常
 */
public class MyException extends  Exception{
    public MyException(String message) {
        super(message);
    }
}
