package com.ls.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author liushuang 2017/8/28
 */
@Configuration
/**
 * @Configuration
 * 替换xml配置, 定义一个配置类.
 */
public class MyWebConfig extends WebMvcConfigurerAdapter {
    /**
     * 注册拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new LoginInterceptor()).excludePathPatterns("/login");
        /**
         * addPathPatterns("/login") 只会拦截   /login  不会拦截 /login/condition
         * addPathPatterns("/login/**") 拦截 /login 和 /login/condition
         * addPathPatterns("/**") 拦截所有.什么都不加是默认拦截所有.
         * excludePathPatterns("/login") 排除该路径.
         */
    }
}
