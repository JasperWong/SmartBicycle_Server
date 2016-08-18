package com.jasper.ssm.mapper;

import com.jasper.ssm.pojo.Login;

/**
 * Created by JasperWong on 2016/8/18.
 */
public interface LoginMapper {
    public Login getUserByName(String username);
}
