package com.luck.service;

import com.luck.api.BlogManager;
import com.luck.dao.BlogMapper;
import com.luck.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Hua wb on 2018/5/16.
 */
@Service
public class BlogService implements BlogManager{
    @Autowired
    private BlogMapper blogMapper;
    @Override
    public Integer addBlog(Blog blog) {
        return blogMapper.insertSelective(blog);
    }

    @Override
    public Blog getBlog(Integer blogId) {
        return blogMapper.selectByPrimaryKey(blogId);
    }

    @Override
    public List<Blog> getBlogs() {
        return blogMapper.getBlogs();
    }
}
