package com.test.maven.user.server.service;

import com.test.common.entity.User;

import java.util.List;

public interface UserService {
    void insert(User user);
    List<User> list();
}
