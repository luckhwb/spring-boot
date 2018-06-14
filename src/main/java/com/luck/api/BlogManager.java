package com.luck.api;

import com.luck.pojo.Blog;

import java.util.List;

/**
 * Created by Hua wb on 2018/5/16.
 */
public interface BlogManager {
    Integer addBlog(Blog blog);
    Blog getBlog(Integer blogId);
    List<Blog> getBlogs();
}
