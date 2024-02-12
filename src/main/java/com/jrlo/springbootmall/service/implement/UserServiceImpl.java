package com.jrlo.springbootmall.service.implement;

import com.jrlo.springbootmall.dao.UserDao;
import com.jrlo.springbootmall.dto.UserRegisterRequest;
import com.jrlo.springbootmall.model.User;
import com.jrlo.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
