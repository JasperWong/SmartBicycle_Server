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
    private Integer id;
    private Integer locker;
    private Integer camera;
    private float  longitude;
    private float  latitude;

    public String execute(){
        if(id!=0){
            bicycle=bicycleService.SelectById(id);
            locker=bicycle.getLocker();
            camera=bicycle.getCamera();
            longitude=bicycle.getLongitude();
            latitude=bicycle.getLatitude();
        }
        return "success";
    }

    public Integer getLocker() {
        return locker;
    }

    public void setLocker(Integer locker) {
        this.locker = locker;
    }

    public Integer getCamera() {
        return camera;
    }

    public void setCamera(Integer camera) {
        this.camera = camera;
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
}
