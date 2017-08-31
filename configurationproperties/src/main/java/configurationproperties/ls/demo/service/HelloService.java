package configurationproperties.ls.demo.service;

import org.springframework.stereotype.Service;

/**
 * @author liushuang 2017/9/1
 */
public class HelloService {
    private String msg;

    public String sayHello() {
        return "hello" + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
