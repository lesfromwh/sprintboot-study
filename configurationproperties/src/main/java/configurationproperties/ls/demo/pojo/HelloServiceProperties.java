package configurationproperties.ls.demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author liushuang 2017/9/1
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private String msg = "world";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
