package com.zkz.service.impl;

import com.zkz.dao.BaseMapper;
import com.zkz.mapper.UserMapper;
import com.zkz.entity.User;
import com.zkz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public BaseMapper<User> getMapper() {
        return userMapper;
    }
}
