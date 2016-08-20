package com.jasper.ssm.action;

import com.jasper.ssm.pojo.User;
import com.jasper.ssm.pojo.UserDay;
import com.jasper.ssm.service.UserDayService;
import com.jasper.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

/**
 * Created by jasper on 16/8/13.
 */
//将这个UserAction 注解为Controller
@Controller
public class UserDayAction {

    //自动注解UserService
    @Autowired
    private UserDayService userDayService;
    private String title;
    private User user1;
    private List<UserDay> userDays;
    private int id;
    //action 默认执行的入口
    public String execute(){
        try {
            //取出所有user
//            userService.insertUser(user);
            userDays=userDayService.findUser();

        } catch (Exception e) {
            e.printStackTrace();
        }
        //设置标题
        title=""+new Date();
        return "success";
    }

    /***
     * 以下是 getter setter 在jsp里要调用我们的 title 和 users 就必须写setter getter方法,不然
     * 没法取到或设置其值.
     * ****/
    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<UserDay> getUserDays() {
        return userDays;
    }

    public void setUsers(List<UserDay> userDays) {
        this.userDays = userDays;
    }

    public User getUser() {
        return user1;
    }

    public void setUser(User user) {
        this.user1 = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
