package com.coolsen.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.coolsen.pojo.Users;
import com.coolsen.service.UsersService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author 吴雨森
 * @data 2019/9/23 22:19
 */
@RestController
public class UsersController {

    @Reference
    private UsersService usersService;

    @RequestMapping("/")
    public List<Users> queryUsers(){
        return this.usersService.queryUsers();
    }
}
