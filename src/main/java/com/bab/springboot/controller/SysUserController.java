package com.bab.springboot.controller;

import com.bab.springboot.model.SysUser;
import com.bab.springboot.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: wzj
 * @CreateDate: 2019/12/4 13:37
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/test")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;
   @RequestMapping("/test")
    public SysUser test(int id){
       SysUser sysUser=sysUserService.findUser(id);
       return sysUser;
   }

}
