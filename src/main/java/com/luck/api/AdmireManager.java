package com.luck.api;

import com.luck.pojo.Admire;

/**
 * Created by Hua wb on 2018/8/16.
 */
public interface AdmireManager {

    int addAdmire(Admire admire);

    int updateStatus(String note);
}
