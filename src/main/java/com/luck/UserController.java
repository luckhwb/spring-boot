package com.luck;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.luck.api.UserManager;
import com.luck.pojo.Users;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Hua wb on 2018/6/14.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserManager userManager;

    @RequestMapping("/")
    public ModelAndView getUsers(Users users){
        ModelAndView modelAndView = new ModelAndView();
        List<Users> userList = userManager.getUserList(users);
        modelAndView.setViewName("usersInfo");
        modelAndView.addObject("users", userList);
        return modelAndView;
    }

    @RequestMapping("/testAjaxHTML")
    public ModelAndView testAjaxHTML(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("testAjax");
        return modelAndView;
    }

    @RequestMapping("/testAjax")
    @ResponseBody  //必须要有
    public String testAjax(){
        Users users = userManager.getUsers(1);
        return JSON.toJSONString(users);
    }
    @RequestMapping("/{id}")
    public ModelAndView getUser(@PathVariable("id") int id){
        ModelAndView modelAndView = new ModelAndView();
        Users users = userManager.getUsers(id);
        modelAndView.setViewName("userInfo");
        modelAndView.addObject("users", users);
        return modelAndView;
    }

    @RequestMapping("/loginCheck")
    public String loginCheck(Users users, HttpSession httpSession){
        Users users1 = userManager.checkUser(users.getName(), users.getAge());
        if (users1 != null) {
            //success
            System.out.println("ok");
            httpSession.setAttribute("user", users1.getName());
        } else {
            // fail
            System.out.println("no");
        }
        return "redirect:/index";
    }

    @RequestMapping("/add")
    public String addUser(Users users){
        userManager.insert(users);
        return "redirect:/bottom";
    }

    @RequestMapping("/del/")
    @ResponseBody
    public String delUser(HttpServletRequest request){
        String id = request.getParameter("id");
        userManager.delUser(Integer.parseInt(id));
        return "success";
        //return "redirect:/user/";
    }
}
