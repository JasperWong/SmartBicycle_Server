package com.jasper.ssm.service;

import com.jasper.ssm.pojo.Trash;


/**
 * Created by JasperWong on 2016/8/18.
 */
public interface TrashService {
    void updateTrash(Trash trash);
    Trash SelectById1(Integer id);
}
