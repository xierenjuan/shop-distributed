package com.test.maven.user.controller.api;

import com.test.maven.api.UserApi;
import com.test.maven.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@RestController
public class UserApiController implements UserApi {

    @Autowired
    private UserService userService;

    @Override
    public Object get(Long id) {
        return userService.list();
    }
}
