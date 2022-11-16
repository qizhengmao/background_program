package com.example.background_program.mapper;

import com.example.background_program.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2022-11-16
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
