package com.jasper.ssm.service;

import com.jasper.ssm.mapper.BicycleMapper;
import com.jasper.ssm.pojo.Bicycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by JasperWong on 2017-02-17.
 */
@Service
public class BicycleServiceImpl implements BicycleService{
    @Autowired
    public BicycleMapper bicycleMapper;

    public void updateBicycle(Bicycle bicycle) {
        bicycleMapper.updateBicycle(bicycle);
    }

    public void updateBicycleStatus(Bicycle bicycle) {
        bicycleMapper.updateBicycleStatus(bicycle);
    }

    public Bicycle SelectById(Integer id) {
        Bicycle bicycle=bicycleMapper.selectById(id);
        return bicycle;
    }

    public Bicycle SelectStatusById(Integer id) {
        Bicycle bicycle=bicycleMapper.selectStatusById(id);
        return bicycle;
    }

}
