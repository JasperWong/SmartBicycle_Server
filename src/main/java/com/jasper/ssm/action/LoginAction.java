package com.jasper.ssm.action;

import com.jasper.ssm.pojo.Login;
import com.jasper.ssm.pojo.User;
import com.jasper.ssm.service.LoginService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by JasperWong on 2016/8/18.
 */
@Controller
@Scope(value="prototype")
//@RequestMapping("/user")
public class LoginAction {
    @Resource
    private LoginService loginService;
    private String username;
    private String password;
    private User user;

//    public String getSex() {
//        user.setSex(sex);
//        user.setUsername(username);
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
//
//    private String sex;
//    @RequestMapping(value="/login",method= RequestMethod.POST)
    public String execute(){
        System.out.print(username);
        return "success";
    }

    public String login(Login user, Model model) throws Exception {
        user= loginService.checkLogin(user.getUsername(), user.getPassword());
        if(user!=null){
            model.addAttribute(user);
            return "welcome";// 路径 WEB-INF/pages/welcome.jsp
        }
        return "fail";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        loginService.insert(user);
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
