package com.zhc.test.demo.Dao;

import com.zhc.test.demo.entity.UserEntity;

import java.util.List;

public interface UserDao {

    List<UserEntity> getList();

    void insertUser(UserEntity userEntity);
}
