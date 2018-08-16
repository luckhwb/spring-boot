package com.luck.service;

import com.luck.api.AdmireManager;
import com.luck.dao.AdmireMapper;
import com.luck.pojo.Admire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Hua wb on 2018/8/16.
 */
@Service
public class AdmireService implements AdmireManager {
    @Autowired
    private AdmireMapper admireMapper;
    @Override
    public int addAdmire(Admire admire) {
        return admireMapper.insertSelective(admire);
    }

    @Override
    public int updateStatus(String note) {
        return admireMapper.updateStatus(note);
    }
}
