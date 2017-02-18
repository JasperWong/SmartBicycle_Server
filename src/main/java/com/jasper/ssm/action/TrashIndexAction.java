package com.jasper.ssm.action;

import com.jasper.ssm.pojo.Bicycle;
import com.jasper.ssm.pojo.Trash;
import com.jasper.ssm.service.BicycleService;
import com.jasper.ssm.service.TrashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by JasperWong on 2017/2/17.
 */
@Controller
public class TrashIndexAction {
    @Autowired
    private TrashService trashService;
    private Trash trash=new Trash();
    private Integer id;
    private Integer able;
    private Integer disable;
    private Integer backup;
    private Integer others;
    private float longitude;
    private float latitude;

    public String execute(){
        if(id!=0){
            trash=trashService.SelectById1(id);
            able=trash.getAble1();
            disable=trash.getDisable1();
            backup=trash.getBackup1();
            others=trash.getOthers1();
            longitude=trash.getLongitude();
            latitude=trash.getLatitude();
        }
        return "success";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAble() {
        return able;
    }

    public void setAble(Integer able) {
        this.able = able;
    }

    public Integer getDisable() {
        return disable;
    }

    public void setDisable(Integer disable) {
        this.disable = disable;
    }

    public Integer getBackup() {
        return backup;
    }

    public void setBackup(Integer backup) {
        this.backup = backup;
    }

    public Integer getOthers() {
        return others;
    }

    public void setOthers(Integer others) {
        this.others = others;
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
}
