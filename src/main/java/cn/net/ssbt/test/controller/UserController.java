package cn.net.ssbt.test.controller;

import cn.net.ssbt.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/test")
    public String userTest(){
        String name = service.getUserName("4B7A5CD338F44569B0291EB5B0482EEC");
        System.out.println(name);
        return "test/test";
    }
}
