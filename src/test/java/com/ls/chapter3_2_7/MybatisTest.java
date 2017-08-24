package com.ls.chapter3_2_7;

import com.ls.SpringbootStudyApplication;
import com.ls.chapter3_2_7.mapper.UserMapper;
import com.ls.chapter3_2_7.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


/**
 * create by liushuang Date:2017/8/24 Time:10:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootStudyApplication.class)
@Transactional
public class MybatisTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    @Rollback
    public void findByName() {
        userMapper.insert("ls",23);
        User ls = userMapper.findByName("ls");
        Assert.assertEquals("ls",ls.getName());
    }

}
