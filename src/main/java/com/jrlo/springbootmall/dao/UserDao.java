package com.jrlo.springbootmall.dao;

import com.jrlo.springbootmall.dto.UserRegisterRequest;
import com.jrlo.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
