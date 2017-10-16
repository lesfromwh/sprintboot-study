package com.ls;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.Resource;

@SpringBootApplication //@SpringBootApplication(exclude = "可以排除某个自动配置")
@EnableScheduling//定时任务
@EnableCaching
//@MapperScan(basePackages = "com.ls")
/**
 * @MapperScan和@Mapper 二选一
 * <p>@SpringBootApplication</p>中的注解.
 * @Target(ElementType.TYPE)
 * @Retention(RetentionPolicy.RUNTIME)
 * @Documented
 * @Inherited
 * @SpringBootConfiguration
 * @EnableAutoConfiguration  //根据类路径的jar包依赖为当前项目进行自动配置. 会扫描@SpringBootApplication类所在的同级目录下的所有包.
 */
public class SpringbootStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudyApplication.class, args);
    }
}
