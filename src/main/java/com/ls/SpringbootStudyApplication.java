package com.ls;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//定时任务
@EnableScheduling
@MapperScan(basePackages = "com.ls")
public class SpringbootStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStudyApplication.class, args);
	}
}
