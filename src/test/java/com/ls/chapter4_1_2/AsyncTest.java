package com.ls.chapter4_1_2;

import com.ls.SpringbootStudyApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * create by liushuang Date:2017/8/24 Time:11:16
 */
//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootStudyApplication.class)
/**
 * springbootTest后面的括号可以不加东西.但是要注入bean的时候就不能注入了.
 * @SpringBootTest(classes = SpringbootStudyApplication.class)classes=启动类.class 这样就可以了.
 */
public class AsyncTest {

    @Autowired
    private Task task;

    @Test
    public void demo() throws Exception {
        task.doTaskOne();
        task.doTaskTwo();
    }
}
