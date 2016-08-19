package com.jasper.ssm.service;

import com.jasper.ssm.pojo.Login;
import com.jasper.ssm.pojo.User;

/**
 * Created by JasperWong on 2016/8/18.
 */
public interface LoginService {
    public Login checkLogin(String username, String password);
    public void insert(User user);
    public void update(User user);
}
