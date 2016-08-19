package com.jasper.ssm.action;

import com.jasper.ssm.pojo.User;
import com.jasper.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by JasperWong on 2016/8/18.
 */
@Controller
@Scope(value="prototype")
public class DayAction {
    @Autowired
    private UserService userService;
    private String username;
    private int id;
    private float distance_day;
    private String date;
    private User user=new User();

    public String execute(){
        if(username!=null) {
            user.setUsername(username);
            user.setDate(date);
            user.setDistance_day(distance_day);
            userService.updateUserDay(user);
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getDistance_day() {
        return distance_day;
    }

    public void setDistance_day(float distance_day) {
        this.distance_day = distance_day;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
