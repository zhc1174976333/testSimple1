package com.zhc.test.demo.service.Impl;

import com.zhc.test.demo.Dao.UserDao;
import com.zhc.test.demo.entity.UserEntity;
import com.zhc.test.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserEntity> findAllList() {
        return userDao.getList();
    }

    @Override
    public void insertUser(UserEntity userEntity) {
        userDao.insertUser(userEntity);
    }
}
