package com.zhc.test.demo.service;

import com.zhc.test.demo.entity.UserEntity;

import java.util.List;

public interface UserService {

    /**
     * 查询全部数据
     * @return
     */
    List<UserEntity> findAllList();

    /**
     * 保存数据
     * @param userEntity
     */
    void insertUser(UserEntity userEntity);

}
