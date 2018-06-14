package com.luck.pojo;

public class Blog {
    private Integer blogId;

    private Integer userId;

    private String blogName;

    private String blogTitle;

    private String blogKeyword;

    private String blogDescription;


    public Blog(Integer blogId, Integer userId, String blogKeyword, String blogDescription, String blogName, String blogTitle) {
        this.blogId = blogId;
        this.userId = userId;
        this.blogKeyword = blogKeyword;
        this.blogDescription = blogDescription;
        this.blogName = blogName;
        this.blogTitle = blogTitle;
    }

    public Blog() {
        super();
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBlogKeyword() {
        return blogKeyword;
    }

    public void setBlogKeyword(String blogKeyword) {
        this.blogKeyword = blogKeyword == null ? null : blogKeyword.trim();
    }

    public String getBlogDescription() {
        return blogDescription;
    }

    public void setBlogDescription(String blogDescription) {
        this.blogDescription = blogDescription == null ? null : blogDescription.trim();
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName == null ? null : blogName.trim();
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId=" + blogId +
                ", userId=" + userId +
                ", blogName='" + blogName + '\'' +
                ", blogTitle='" + blogTitle + '\'' +
                ", blogKeyword='" + blogKeyword + '\'' +
                ", blogDescription='" + blogDescription + '\'' +
                '}';
    }
}