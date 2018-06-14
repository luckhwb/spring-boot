package com.luck;

import com.luck.api.BlogManager;
import com.luck.api.UserManager;
import com.luck.dao.UserMapper;
import com.luck.pojo.Blog;
import com.luck.pojo.Users;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Hua wb on 2018/6/13.
 */
@Controller
@Service
public class HelloController {
    @Autowired
    private UserManager userManager;
    @Autowired
    private BlogManager blogManager;

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        List<Blog> blogs = blogManager.getBlogs();
        modelAndView.addObject("list", blogs);
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @RequestMapping("/addBlog")
    public String addBlog() {
        return "addBlog";
    }
    @RequestMapping("/register")
    public String register() {
        return "register";
    }

}