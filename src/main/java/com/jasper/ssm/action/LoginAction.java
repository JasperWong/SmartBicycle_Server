package com.jasper.ssm.action;

import com.jasper.ssm.pojo.Login;
import com.jasper.ssm.pojo.User;
import com.jasper.ssm.service.LoginService;
import com.jasper.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Date;
import java.util.concurrent.ExecutionException;

/**
 * Created by JasperWong on 2016/8/18.
 */
@Controller
@Scope(value="prototype")
public class LoginAction {
    @Autowired
    private UserService userService;
    private String username;
    private float distance;
    private float hour;
    private int times;
    private int id;
    private User user=new User();

    public String execute(){
        if(username!=null) {
            user.setId(id);
            user.setUsername(username);
            user.setDistance(distance);
            user.setHour(hour);
            user.setTimes(times);
//            userService.insertUser(user);
            userService.updateUser(user);
        }
//        System.out.print(username);
        return "success";
    }

//    public String login(Login user, Model model) throws Exception {
//        user= loginService.checkLogin(user.getUsername(), user.getPassword());
//        if(user!=null){
//            model.addAttribute(user);
//            return "welcome";// 路径 WEB-INF/pages/welcome.jsp
//        }
//        return "fail";
//    }
    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }


    public float getHour() {
        return hour;
    }

    public void setHour(float hour) {
        this.hour = hour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
