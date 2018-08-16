package com.luck.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Admire {
    private Integer id;

    private Integer uId;

    private Integer status;

    private BigDecimal money;

    private Date createDate;

    private String note;

    public Admire(Integer id, Integer uId, Integer status, BigDecimal money, Date createDate, String note) {
        this.id = id;
        this.uId = uId;
        this.status = status;
        this.money = money;
        this.createDate = createDate;
        this.note = note;
    }

    public Admire() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}