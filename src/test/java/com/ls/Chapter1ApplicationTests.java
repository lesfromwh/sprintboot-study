package com.ls;

import com.ls.first.helloWorld;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * 模拟http请求.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class Chapter1ApplicationTests {
    private MockMvc mvc;

    @Before
    public void setUp() {
        mvc = MockMvcBuilders.standaloneSetup(new helloWorld()).build();
    }

    @Test
    public void getHello() throws Exception {
        MockHttpServletRequestBuilder hello = MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON);
        ResultActions perform = mvc.perform(hello);
        perform.andExpect(status().isOk());
        perform.andExpect(content().string(equalTo("hello world")));

    }
}
