package com.ls.conditional.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liushuang 2017/8/31
 */
public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+
                "系统下的列表命令 : "
                + listService.showListCmd());
    }
}
