package com.jasper.ssm.service;

import com.jasper.ssm.pojo.User;

import java.util.List;

/**
 * Created by lulee007 on 16/1/19.
 */
public interface UserService {
    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    List<User> findUser()throws Exception;
    void insertUser(User user);
    Boolean saveUser(User user) throws  Exception;
}
