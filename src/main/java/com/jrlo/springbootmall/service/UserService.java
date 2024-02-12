package com.jrlo.springbootmall.service;

import com.jrlo.springbootmall.dto.UserRegisterRequest;
import com.jrlo.springbootmall.model.User;

public interface UserService {

    User getUserById (Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

}
