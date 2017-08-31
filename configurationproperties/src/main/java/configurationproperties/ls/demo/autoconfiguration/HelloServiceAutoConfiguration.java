package configurationproperties.ls.demo.autoconfiguration;

import configurationproperties.ls.demo.pojo.HelloServiceProperties;
import configurationproperties.ls.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liushuang 2017/9/1
 */
@Configuration
@ConditionalOnClass(HelloService.class)//是否存在
@ConditionalOnProperty(prefix = "hello",value = "enable",matchIfMissing = true)
@EnableConfigurationProperties(HelloServiceProperties.class) //开启注入
public class HelloServiceAutoConfiguration {
    @Autowired
    private HelloServiceProperties helloServiceProperties;

    @Bean
    @ConditionalOnMissingBean//如果容器不没有这个类.
    public HelloService setHelloService() {
        HelloService helloService = new HelloService();
        System.out.println("执行了吗?");
        helloService.setMsg(helloServiceProperties.getMsg());
        return helloService;
    }
}
