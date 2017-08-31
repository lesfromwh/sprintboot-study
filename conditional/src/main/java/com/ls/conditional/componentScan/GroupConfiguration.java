package com.ls.conditional.componentScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author liushuang 2017/8/31
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//@Documented
@Configuration
@ComponentScan
public @interface GroupConfiguration {
    String[] value() default {};
}
