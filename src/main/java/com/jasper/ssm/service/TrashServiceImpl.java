package com.jasper.ssm.service;

import com.jasper.ssm.mapper.BicycleMapper;
import com.jasper.ssm.mapper.TrashMapper;
import com.jasper.ssm.pojo.Bicycle;
import com.jasper.ssm.pojo.Trash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by JasperWong on 2017-02-17.
 */
@Service
public class TrashServiceImpl implements TrashService{
    @Autowired
    public TrashMapper trashMapper;

    public void updateTrash(Trash trash) {
        trashMapper.updateTrash(trash);
    }

    public Trash SelectById1(Integer id) {
        Trash trash=trashMapper.selectById1(id);
        return trash;
    }

}
