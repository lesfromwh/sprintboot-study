package com.ls.chapter4_4_1;

import com.ls.SpringbootStudyApplication;
import com.ls.chapter3_2_7.mapper.UserMapper;
import com.ls.chapter3_2_7.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.Assert;

/**
 * create by liushuang Date:2017/8/24 Time:15:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootStudyApplication.class)
public class EhCacheTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void demo () {
        User ls = userMapper.findByName("ls");
        System.out.println("查询了");
        Assert.assertEquals("ls",ls.getName());
    }

}
