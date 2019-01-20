package com.zkz.controller.mysql;

import com.zkz.entity.User;
import com.zkz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: ZKZ
 * @Date: 2019/1/16
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("one")
    public String getUser() {
        User user = new User();
        user.setUser("root");
        user = userService.get(user);
        return user.getUser();
//        return "success";
    }

}
