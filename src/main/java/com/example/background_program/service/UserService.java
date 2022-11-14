package com.example.background_program.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.background_program.entity.User;

import java.util.List;

public interface UserService extends IService<User> {
    List<User> listAll();
}
