package com.luck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Hua wb on 2018/8/27.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/thymeleaf")
    public ModelAndView mb(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("hello","hello thymeleaf.");
        mv.setViewName("testThymeleaf");
        return mv;
    }

}
