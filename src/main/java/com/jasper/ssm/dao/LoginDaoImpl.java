package com.jasper.ssm.dao;

import com.jasper.ssm.mapper.LoginMapper;
import com.jasper.ssm.pojo.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by JasperWong on 2016/8/18.
 */
@Repository("LoginDao")
public class LoginDaoImpl implements LoginDao {
    //注解引用Mapper类资源
   // @Resource
    private LoginMapper userMapper;

    /* 根据用户名查找用户对象 */
    public Login findUserByName(String username) {
        //调用Mapper类从数据库中得到User对象
        return userMapper.getUserByName(username);
    }
}
