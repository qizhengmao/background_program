package com.example.background_program.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.background_program.entity.User;
import com.example.background_program.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2022-11-16
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;
    @RequestMapping("/list")
    public List<User> list(){
        return iUserService.list();
    }
    //新增
    @PostMapping("/save")
    public boolean save(@RequestBody User user){
        return iUserService.save(user);
    }
    //修改
    @PostMapping("/mod")
    public boolean mod(@RequestBody User user){
        return iUserService.updateById(user);
    }
    //新增或修改
    @PostMapping("/saveorMod")
    public boolean saveorMod(@RequestBody User user){
        return iUserService.saveOrUpdate(user);
    }
    //删除
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return iUserService.removeById(id);
    }
    //查询（模糊，匹配）
    @PostMapping("/listp")
    public List<User> listp(@RequestBody User user){
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(User::getName,user.getName());
        return iUserService.list(lambdaQueryWrapper);
    }



}
