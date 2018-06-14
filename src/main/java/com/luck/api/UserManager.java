package com.luck.api;

import com.luck.pojo.Users;

/**
 * Created by Hua wb on 2018/3/14.
 */
public interface UserManager {
    int insert(Users users);
    Users getUsers(int id);
}
