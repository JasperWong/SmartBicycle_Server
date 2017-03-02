package com.jasper.ssm.action;

import com.jasper.ssm.pojo.Bicycle;
import com.jasper.ssm.service.BicycleService;
import javafx.scene.transform.MatrixType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by JasperWong on 2017/2/17.
 */
@Controller
public class BicycleInsertAction {
    @Autowired
    private BicycleService bicycleService;
    private Bicycle bicycle=new Bicycle();
    private Integer id;
    private Integer locker;
    private Integer alarm;
    private Integer status;
    private float  longitude;
    private float  latitude;
    public String execute(){
        if(id!=null)
            bicycle.setId(id);
        if(locker!=null)
            bicycle.setLocker(locker);
        if(alarm!=null)
            bicycle.setAlarm(alarm);
        if(latitude!=0)
            bicycle.setLatitude(latitude);
        if(longitude!=0)
            bicycle.setLongitude(longitude);
        if(status!=0){
            bicycle.setStatus(status);
        }
        bicycleService.updateBicycle(bicycle);
        return "success";
    }

    public Integer getLocker() {
        return locker;
    }

    public void setLocker(Integer locker) {
        this.locker = locker;
    }

    public Integer getAlarm() {
        return alarm;
    }

    public void setAlarm(Integer alarm) {
        this.alarm =alarm;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Bicycle getBicycle() {
        return bicycle;
    }

    public void setBicycle(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public BicycleService getBicycleService() {
        return bicycleService;
    }

    public void setBicycleService(BicycleService bicycleService) {
        this.bicycleService = bicycleService;
    }
}
