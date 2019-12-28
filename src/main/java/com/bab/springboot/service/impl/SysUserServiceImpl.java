package com.bab.springboot.service.impl;

import com.bab.springboot.mapper.SysUserMapper;
import com.bab.springboot.model.SysUser;
import com.bab.springboot.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: wzj
 * @CreateDate: 2019/12/4 13:40
 * @Version: 1.0
 **/
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Cacheable(value="redisCache",key="#root.targetClass+#root.methodName+#id")
    @Override
    public SysUser findUser(int id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }
}
