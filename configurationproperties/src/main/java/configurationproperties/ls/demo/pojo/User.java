package configurationproperties.ls.demo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * create by liushuang Date:2017/8/24 Time:15:51
 * 读取配置文件.  可以用这种方式替换@Value这样的注入.简洁代码.是一种安全的配置.
 */
@ConfigurationProperties(prefix = "ls")
public class User {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
