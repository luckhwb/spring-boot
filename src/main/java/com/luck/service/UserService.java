package com.luck.service;


import com.luck.api.UserManager;
import com.luck.dao.UserMapper;
import com.luck.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Hua wb on 2018/3/14.
 */
@Service
public class UserService implements UserManager {
    @Autowired
    private UserMapper usersMapper;
    @Override
    public int insert(Users users) {
        return usersMapper.insert(users);
    }

    @Override
    public Users getUsers(int id) {
        return usersMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delUser(int id) {
        return usersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Users> getUserList(Users users) {
        return usersMapper.getUsers(users);
    }

    @Override
    public Users checkUser(String name, int age) {
        return usersMapper.checkUser(name, age);
    }
}
