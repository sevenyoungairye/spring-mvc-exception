package cn.bitqian.controller;

import cn.bitqian.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author echo lovely
 * @date 2020/9/8 15:09
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping (value = "/show")
    @ResponseBody
    public void show() {
        System.out.println(userService);
        userService.numberFormatException();
    }

}
