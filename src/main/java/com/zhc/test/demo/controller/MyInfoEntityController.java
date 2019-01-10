package com.zhc.test.demo.controller;

import com.zhc.test.demo.entity.TestEntity;
import com.zhc.test.demo.entity.TestProEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({TestEntity.class})
public class MyInfoEntityController {

    @Autowired
    TestEntity testEntity;
    @Autowired
    TestProEntity testProEntity;

    /**
     * yml配置映射实体类
     * @return
     */
    @RequestMapping(value="/myInfoEntity")
    public String myInfoEntity(){
        return "实体映射配置获取数据：" + testEntity.getName()+" "+testEntity.getSex()+" "+testEntity.getAge();
    }

    /**
     * 新加配置文件
     * @return
     */
    @RequestMapping(value="/myInfoProEntity")
    public String myInfoProEntity(){
        return "新添加配置文件获取数据："+testProEntity.getName1() + " of color is " + testProEntity.getColor1() + ", and " + testProEntity.getName2() + " of color is " + testProEntity.getColor2();
    }

}
