package com.jasper.ssm.action;

import com.jasper.ssm.pojo.Bicycle;
import com.jasper.ssm.service.BicycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by JasperWong on 2017/2/17.
 */
@Controller
public class BicycleIndexAction {
    @Autowired
    private BicycleService bicycleService;
    private Bicycle bicycle=new Bicycle();
    private Bicycle bicycleStatus=new Bicycle();
    private Integer id;
    private Integer locker;
    private Integer alarm;
    private Integer status;
    private float  longitude;
    private float  latitude;
    private Integer select=0;

    public String execute(){
        if(select==1){




        }
        else if(id!=0){
            bicycle=bicycleService.SelectById(id);
            bicycleStatus=bicycleService.SelectStatusById(id);
            locker=bicycleStatus.getLocker();
            alarm=bicycleStatus.getAlarm();
            longitude=bicycle.getLongitude();
            latitude=bicycle.getLatitude();
            status=bicycle.getStatus();
        }
        if(select==1) return "photo";
        else return "success";
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
        this.alarm = alarm;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSelect() {
        return select;
    }

    public void setSelect(Integer select) {
        this.select = select;
    }
}
