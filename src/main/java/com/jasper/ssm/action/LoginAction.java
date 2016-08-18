package com.jasper.ssm.action;

import com.jasper.ssm.pojo.Login;
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

//    @RequestMapping(value="/login",method= RequestMethod.POST)
    public String execute(){
        System.out.print(username);
        return "success";
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String login(Login user, Model model) throws Exception {
        user= loginService.checkLogin(user.getUsername(), user.getPassword());
        if(user!=null){
            model.addAttribute(user);
            return "welcome";// 路径 WEB-INF/pages/welcome.jsp
        }
        return "fail";
    }

}
