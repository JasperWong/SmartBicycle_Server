package com.jasper.ssm.service;

import com.jasper.ssm.pojo.UserDay;

import java.util.List;

/**
 * Created by lulee007 on 16/1/19.
 */
public interface UserDayService {
    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    List<UserDay> findUser()throws Exception;
    void insertUser(UserDay user);
    void updateUser(UserDay user);
    Boolean saveUser(UserDay user) throws  Exception;
}
