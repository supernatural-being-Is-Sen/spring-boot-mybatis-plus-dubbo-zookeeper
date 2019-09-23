package com.coolsen.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.coolsen.mapper.UsersMapper;
import com.coolsen.pojo.Users;
import com.coolsen.service.UsersService;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author 吴雨森
 * @data 2019/9/23 22:07
 */
@Service
public class UersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public List<Users> queryUsers() {
        return this.usersMapper.selectList(null);
    }
}
