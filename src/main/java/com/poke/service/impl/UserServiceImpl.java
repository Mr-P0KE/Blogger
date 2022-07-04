package com.poke.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.poke.pojo.User;
import com.poke.service.UserService;
import com.poke.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 56207
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-07-02 17:41:07
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>implements UserService{

}




