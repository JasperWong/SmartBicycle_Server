package com.jasper.ssm.dao;

import com.jasper.ssm.pojo.Login;

/**
 * Created by JasperWong on 2016/8/18.
 */
public interface LoginDao {
    public Login findUserByName(String username);
}
