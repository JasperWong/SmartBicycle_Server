package com.jasper.ssm.action;

import com.jasper.ssm.pojo.User;
import com.jasper.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by jasper on 16/8/13.
 */
//将这个UserAction 注解为Controller
@Controller
public class UserAction {

    //自动注解UserService
    @Autowired
    private UserService userService;
    private String title;
    private User user1;
    private List<User> users;
    private Integer id=0;

    //action 默认执行的入口
    public String execute(){
        if(id!=0){
            userService.delete(id);
        }
        try {
            //取出所有user
            users=userService.findUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        user.setUsername("123");
//        user.setSex("女");
//        user.setAddress("3421");
        //设置标题
//        title="当前时间:"+new Date();
        title=""+ DateFormat.getDateTimeInstance(2, 2, Locale.CHINESE).format(new java.util.Date());
// user1=new User();
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getUser() {
        return user1;
    }

    public void setUser(User user) {
        this.user1 = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
