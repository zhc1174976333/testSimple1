package com.zhc.test.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyInfoController {

    @Value("${my.name}")
    private String name;

    @Value("${my.sex}")
    private String sex;

    @Value("${my.age}")
    private int age;

    /**
     * 直接读取yml配置文件
     * @return
     */
    @RequestMapping("/myInfo")
    public String myInfo(){
        return "直接获取配置数据：" + name + " " + sex + " " + age;
    }
}
