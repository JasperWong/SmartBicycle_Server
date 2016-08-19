package com.jasper.ssm.service;

import com.jasper.ssm.mapper.UserDayMapper;
import com.jasper.ssm.pojo.User;
import com.jasper.ssm.pojo.UserDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lulee007 on 16/1/19.
 */
@Service
public class UserDayServiceImpl implements UserDayService {
    //User接口
    @Autowired
    private UserDayMapper userDayMapper;

    public List<UserDay> findUser() throws Exception {
        //调用mapper类中的selectByExample方法，如果传入类型为null，则表示无条件查找
        List<UserDay> userDays = userDayMapper.selectByExample(null);
        return userDays;
    }

    public void insertUser(UserDay user) {
        userDayMapper.insert(user);
    }

    public void updateUser(UserDay user) {
        userDayMapper.update(user);
    }

    public Boolean saveUser(UserDay user) throws Exception {
        return userDayMapper.insertSelective(user)==1;
    }
}
