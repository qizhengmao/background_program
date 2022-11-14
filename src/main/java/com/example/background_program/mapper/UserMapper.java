package com.example.background_program.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.background_program.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> listAll();
}
