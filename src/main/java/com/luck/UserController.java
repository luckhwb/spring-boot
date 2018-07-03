package com.luck;

import com.luck.api.UserManager;
import com.luck.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Hua wb on 2018/6/14.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserManager userManager;

    @RequestMapping("/")
    public ModelAndView getUsers(){
        ModelAndView modelAndView = new ModelAndView();
        List<Users> userList = userManager.getUserList();
        modelAndView.setViewName("usersInfo");
        modelAndView.addObject("users", userList);
        return modelAndView;
    }

    @RequestMapping("/{id}")
    public ModelAndView getUser(@PathVariable("id") int id){
        ModelAndView modelAndView = new ModelAndView();
        Users users = userManager.getUsers(id);
        modelAndView.setViewName("userInfo");
        modelAndView.addObject("users", users);
        return modelAndView;
    }

    @RequestMapping("/add")
    public ModelAndView addUser(Users users, ModelAndView modelAndView){
        userManager.insert(users);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/del/{id}")
    public String delUser(@PathVariable("id") int id){
        userManager.delUser(id);
        return "redirect:/user/";
    }
}
