package com.luck.dao;

import com.luck.pojo.Admire;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdmireMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admire record);

    int insertSelective(Admire record);

    Admire selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admire record);

    int updateByPrimaryKey(Admire record);

    int updateStatus(String note);
}