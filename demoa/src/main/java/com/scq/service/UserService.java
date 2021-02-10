package com.scq.service;

import com.scq.bean.T_dt_user;
import com.scq.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    /**
     * 查询所有User表中的数据
     * @return
     */
    public T_dt_user findUser(){
        return  userMapper.findUser();
    }
}
