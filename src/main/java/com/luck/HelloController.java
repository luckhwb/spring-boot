package com.luck;

import com.luck.api.BlogManager;
import com.luck.api.UserManager;
import com.luck.pojo.Blog;
import com.luck.redis.StringRedis;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
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
    @Autowired
    private StringRedis stringRedis;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(HttpServletRequest request) {
        String id = request.getParameter("num");
        String value;
        switch (id){
            case "1": value = "别这样啊！";
                break;
            case "2": value = "2";
                break;
            default:
                value = "不可以拒绝了！";
        }
        return value;
    }
    @RequestMapping("/")
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        return modelAndView;
    }
    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        List<Blog> blogs = blogManager.getBlogs();
        modelAndView.addObject("list", blogs);
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @RequestMapping("/top")
    public String top() {
        return "top";
    }
    @RequestMapping("/bottom")
    public ModelAndView bottom() {
        ModelAndView modelAndView = new ModelAndView();
        List<Blog> blogs = blogManager.getBlogs();
        modelAndView.addObject("list", blogs);
        modelAndView.setViewName("bottom");
        return modelAndView;
    }
    @RequestMapping("/ok")
    public String ok() {
        return "ok";
    }
    @RequestMapping("/addBlog")
    public String addBlog() {
        return "addBlog";
    }
    @RequestMapping("/register")
    public String register() {
        return "register";
    }
    @RequestMapping("/returnLogin")
    public String returnLogin(HttpSession httpSession) {
        httpSession.removeAttribute("user");
        return "redirect:/index";
    }
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    @RequestMapping("/session")
    @ResponseBody
    public String session(HttpSession httpSession) {
        Object user = httpSession.getAttribute("user");
        if (user == null) {
            return null;
        }
        return user.toString();
    }

    @RequestMapping("/redis")
    @ResponseBody
    public String redisTest() {
        stringRedis.add("redis", "hello redis ..");
        String s = stringRedis.get("redis");
        System.out.println(s);
        return s;
    }

}