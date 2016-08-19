package com.jasper.ssm.mapper;

import com.jasper.ssm.pojo.User;
import com.jasper.ssm.pojo.UserDay;
import com.jasper.ssm.pojo.UserDayExample;
import com.jasper.ssm.pojo.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDayMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDay record);

    int update(UserDay record);

    int insertSelective(UserDay record);

    List<UserDay> selectByExample(UserDayExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}