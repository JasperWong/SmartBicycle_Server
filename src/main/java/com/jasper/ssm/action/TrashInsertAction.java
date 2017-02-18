package com.jasper.ssm.action;

import com.jasper.ssm.pojo.Trash;
import com.jasper.ssm.service.TrashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by JasperWong on 2017/2/17.
 */
@Controller
public class TrashInsertAction {
    @Autowired
    private TrashService trashService;
    private Trash trash=new Trash();
    private Integer id;
    private Integer able1;
    private Integer disable1;
    private Integer backup1;
    private Integer others1;
    private float longitude;
    private float latitude;

    public String execute(){
        if(id!=null)
            trash.setId(id);
        if(able1!=null)
            trash.setAble1(able1);
        if(disable1!=null)
            trash.setDisable1(disable1);
        if(backup1!=null)
            trash.setBackup1(backup1);
        if(others1!=null)
            trash.setOthers1(others1);
        if(latitude!=0)
            trash.setLatitude(latitude);
        if(longitude!=0)
            trash.setLongitude(longitude);
        trashService.updateTrash(trash);
        return "success";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAble1() {
        return able1;
    }

    public void setAble1(Integer able1) {
        this.able1 = able1;
    }

    public Integer getDisable1() {
        return disable1;
    }

    public void setDisable1(Integer disable1) {
        this.disable1 = disable1;
    }

    public Integer getBackup1() {
        return backup1;
    }

    public void setBackup1(Integer backup1) {
        this.backup1 = backup1;
    }

    public Integer getOthers1() {
        return others1;
    }

    public void setOthers1(Integer others1) {
        this.others1 = others1;
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
