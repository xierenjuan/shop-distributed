package com.test.maven.user.service.Impl;

import com.test.common.entity.User;
import com.test.maven.user.dao.UserMapper;
import com.test.maven.user.exception.custom.DataException;
import com.test.maven.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public void insert(User user) {
        userMapper.insert(user);
//        throw new DataException("跑出异常");
    }

    @Override
    public List<User> list() {
        return userMapper.selectByExample(null);
    }

}
