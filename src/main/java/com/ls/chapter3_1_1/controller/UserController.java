package com.ls.chapter3_1_1.controller;

import com.ls.chapter3_1_1.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    /**
     * TODO
     * @PathVariable
     * @ModelAttribute
     * @RequestParam
     */

    //创建线程安全的map
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> findUserList() {
        List<User> r = new ArrayList<User>(users.values());
        return r;// []
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String createUser(@ModelAttribute User user) {
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        users.put(user.getId(), user);
        return "success";
    }

    @RequestMapping(value = "/{sid}", method = RequestMethod.GET)
    public User  findUserById(@PathVariable("sid") Long id) {
        //sid=sid=id 3者一样的时候 ("sid")可以省略
        return users.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateUserById(@PathVariable Long id, @ModelAttribute User user) {
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        return "success";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUserById(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }
}
