package com.jasper.ssm.service;

import com.jasper.ssm.dao.LoginDao;
import com.jasper.ssm.mapper.LoginMapper;
import com.jasper.ssm.pojo.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by JasperWong on 2016/8/18.
 */
@Service("LoginService")
public class LoginServiceImpl implements LoginService {

    //@Autowired
    @Autowired
    private LoginMapper userMapper;


    public Login checkLogin(String username, String password) {
        Login user = userMapper.getUserByName(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
