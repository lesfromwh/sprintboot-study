package com.ls.chapter3_1_1.controller;

import com.ls.chapter3_1_1.pojo.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
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
     * <p>
     * swagger注释
     * @ApiOperation
     * @ApiImplicitParam
     * <p/>
     */

    //创建线程安全的map
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    @ApiOperation(value = "获取用户列表",notes = "")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> findUserList() {
        List<User> r = new ArrayList<User>(users.values());
        return r;// []
    }

    @ApiOperation(value = "创建用户",notes = "根据user对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String createUser(@ModelAttribute User user) {
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        users.put(user.getId(), user);
        return "success";
    }

    @ApiOperation(value="获取用户详情")
    @ApiImplicitParam(name="id",value = "用户id",required = true,dataType = "Long")
    @RequestMapping(value = "/{sid}", method = RequestMethod.GET)
    public User  findUserById(@PathVariable("sid") Long id) {
        //sid=sid=id 3者一样的时候 ("sid")可以省略
        return users.get(id);
    }

    @ApiOperation(value = "修改用户信息")
    @ApiImplicitParams(
            {@ApiImplicitParam(name = "id",value = "用户id",required = true,dataType = "Long"),
             @ApiImplicitParam(name = "user",value = "用户实体",required = true,dataType = "User")
            }
    )
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateUserById(@PathVariable Long id, @ModelAttribute User user) {
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        return "success";
    }

    //假的post   http://localhost:8081/users/myDemo?id=1&name=ls&age=11
    @ApiOperation(value="我的demo1")
    @RequestMapping(value = "/myDemo1", method = RequestMethod.POST)
    public String demo1(@RequestParam User user) {
        System.out.println(user);
        return "success";
    }

//    curl -X POST --header "Content-Type: application/json" --header "Accept: */*" -d "{
//            \"age\": 0,
//            \"id\": 0,
//            \"name\": \"string\"
//}" "http://localhost:8081/users/myDemo2"
    @ApiOperation(value="我的demo2")
    @ApiImplicitParams(
            {@ApiImplicitParam(name = "user",value = "用户实体",required = true,dataType = "User")
            }
    )
    @RequestMapping(value = "/myDemo2", method = RequestMethod.POST)
    //@ModelAttribute 收不到参数.  用这个页面会有Model Schema
    //@RequestParam  报错 Required User parameter 'user' is not present
    //@RequestBody  正常.
    public String demo2(@RequestBody User user) {
        System.out.println(user);
        return "success";
    }


    @ApiOperation(value="我的demo3")
    @RequestMapping(value = "/myDemo3", method = RequestMethod.GET)
    public String demo3(@RequestParam User user) {
        System.out.println(user);
        return "success";
    }

    @ApiOperation(value="我的demo3")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "id",value = "id",required = true,dataType = "Long"),
                    @ApiImplicitParam(name = "name",value = "name",required = true,dataType = "String"),
                    @ApiImplicitParam(name = "age",value = "age",required = true,dataType = "Integer")
            }
    )
    @RequestMapping(value = "/myDemo4", method = RequestMethod.GET)
    public String demo4(@RequestParam User user) {
        System.out.println(user);
        return "success";
    }

    @ApiOperation(value="我的demo5")
    @ApiImplicitParams(
            {@ApiImplicitParam(name = "user",value = "用户实体",required = true,dataType = "User")
            }
    )
    @RequestMapping(value = "/myDemo5", method = RequestMethod.GET)
    //@ModelAttribute 收不到参数.  用这个页面会有Model Schema
    //@RequestParam  报错 Required User parameter 'user' is not present
    //@RequestBody  正常.
    public String demo5(@RequestBody User user) {
        System.out.println(user);
        return "success";
    }
}
