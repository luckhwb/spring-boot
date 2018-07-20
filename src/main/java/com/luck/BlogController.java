package com.luck;

import com.luck.api.BlogManager;
import com.luck.pojo.Blog;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Hua wb on 2018/6/14.
 */
@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    BlogManager blogManager;

    @RequestMapping(value = "/addBlogInfo", produces = "text/html;charset=UTF-8")
    public String addBlogInfo(Blog blog){
        blogManager.addBlog(blog);
        // 重定向访问： localhost:8080/index
        return "redirect:/bottom";
    }
}
