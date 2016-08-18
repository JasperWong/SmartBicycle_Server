package com.jasper.ssm.service;

import com.jasper.ssm.pojo.Login;

/**
 * Created by JasperWong on 2016/8/18.
 */
public interface LoginService {
    public Login checkLogin(String username, String password);
}
