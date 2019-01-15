package com.zhc.test.demo.Dao.Impl;

import com.zhc.test.demo.Dao.UserDao;
import com.zhc.test.demo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<UserEntity> getList() {
        return jdbcTemplate.query("select * from t_user where 1=1", new BeanPropertyRowMapper(UserEntity.class));
    }

    @Override
    public void insertUser(UserEntity userEntity) {
        jdbcTemplate.update("insert into t_user (user_name,password) values (?,?)",userEntity.getUserName(),userEntity.getPassword());
    }
}
