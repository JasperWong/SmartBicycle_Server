package com.jasper.ssm.action;

import com.jasper.ssm.pojo.User;
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

    private Integer id;

    private String username;

    private String date;

    private float distanceTotal;

    private float distanceDay;

    private float hourTotal;

    private int timesTotal;
    private User user=new User();

    public String execute(){
        if(username!=null) {
            user.setId(id);
            user.setUsername(username);
            user.setDate(date);
            user.setDistanceDay(distanceDay);
            user.setDistanceTotal(distanceTotal);
            user.setHourTotal(hourTotal);
            user.setTimesTotal(timesTotal);
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
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getDistanceTotal() {
        return distanceTotal;
    }

    public void setDistanceTotal(float distanceTotal) {
        this.distanceTotal = distanceTotal;
    }

    public float getDistanceDay() {
        return distanceDay;
    }

    public void setDistanceDay(float distanceDay) {
        this.distanceDay = distanceDay;
    }

    public float getHourTotal() {
        return hourTotal;
    }

    public void setHourTotal(float hourTotal) {
        this.hourTotal = hourTotal;
    }

    public int getTimesTotal() {
        return timesTotal;
    }

    public void setTimesTotal(int timesTotal) {
        this.timesTotal = timesTotal;
    }
}
