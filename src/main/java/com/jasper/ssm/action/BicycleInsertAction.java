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
    private int select=0;//1:经纬度和状态 2:锁,报警
    public String execute(){
        if(select==1){
            if(id!=null)    bicycle.setId(id);
            if(latitude!=0)     bicycle.setLatitude(latitude);
            if(longitude!=0)    bicycle.setLongitude(longitude);
            if(status!=0)   bicycle.setStatus(status);
            bicycleService.updateBicycle(bicycle);
        }else if(select==2){
            if(id!=null)    bicycle.setId(id);
            if(locker!=null)    bicycle.setLocker(locker);
            if(alarm!=null)     bicycle.setAlarm(alarm);
            bicycleService.updateBicycleStatus(bicycle);
        }
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

    public int getSelect() {
        return select;
    }

    public void setSelect(int select) {
        this.select = select;
    }

    public BicycleService getBicycleService() {
        return bicycleService;
    }

    public void setBicycleService(BicycleService bicycleService) {
        this.bicycleService = bicycleService;
    }
}
