package com.zhc.test.demo.controller;

import com.zhc.test.demo.entity.UserEntity;
import com.zhc.test.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询list
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<UserEntity> findAllList(){
        return userService.findAllList();
    }

    /**
     * 新增user
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Boolean insertUser(@RequestParam(value = "userName") String userName, @RequestParam(value = "password")String password) {
        UserEntity userEntity = new UserEntity();
        if (!StringUtils.hasText(userName)) {
            return Boolean.FALSE;
        }
        if (!StringUtils.hasText(password)) {
            return Boolean.FALSE;
        }
        userEntity.setUserName(userName);
        userEntity.setPassword(password);
        userService.insertUser(userEntity);
        return Boolean.TRUE;
    }
}
