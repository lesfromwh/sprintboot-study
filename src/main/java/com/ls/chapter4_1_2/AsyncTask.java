package com.ls.chapter4_1_2;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

/**
 * create by liushuang Date:2017/8/24 Time:13:51
 * 什么是“异步调用”？
 * “异步调用”对应的是“同步调用”，同步调用指程序按照定义顺序依次执行，
 * 每一行程序都必须等待上一行程序执行完成之后才能执行；异步调用指程序在顺序执行时，
 * 不等待异步调用的语句返回结果就执行后面的程序。
 */
@Component
public class AsyncTask {
    private static Random random = new Random();

    /**
     * @Async所修饰的函数不要定义为static类型，这样异步调用不会生效
     */
    @Async
    public Future<String> doTaskOne() throws Exception {
        System.out.println("开始任务一");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务一完成");
    }

    @Async
    public Future<String> doTaskTwo() throws Exception {
        System.out.println("开始任务二");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务二，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务二完成");
    }

    @Async
    public Future<String> doTaskThree() throws Exception {
        System.out.println("开始任务三");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务三，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务三完成");
    }
}
