package com.ls;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置文件详解
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationPropertiesDemoTest {

    @Value("${first.name}")
    private String firstString;
    @Value("${first.age}")
    private String age;
    @Value("${first.name.age}")
    private String nameAge;
    @Value("${first.value}")
    private String randomString;
    @Test
    public void demo() {
        System.out.println(firstString);//结果:ls-study
        System.out.println(age);
        System.out.println(nameAge);
        System.out.println(randomString);
    }
}
