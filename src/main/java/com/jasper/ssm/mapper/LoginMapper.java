package com.jasper.ssm.mapper;

import com.jasper.ssm.pojo.Login;
import com.jasper.ssm.pojo.User;

/**
 * Created by JasperWong on 2016/8/18.
 */
public interface LoginMapper {
    public Login getUserByName(String username);
    int insertUser(User record);
    int updateUser(User record);
}
