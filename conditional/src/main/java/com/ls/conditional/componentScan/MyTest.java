package com.ls.conditional.componentScan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liushuang 2017/8/31
 */
public class MyTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Democonfig.class);
        DemoService bean = context.getBean(DemoService.class);
        bean.demo();
        context.close();
    }
}
