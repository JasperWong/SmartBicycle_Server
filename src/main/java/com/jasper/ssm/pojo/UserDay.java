package com.jasper.ssm.pojo;

/**
 * Created by JasperWong on 2016/8/20.
 */
public class UserDay {
    private Integer id;

    private String username;

    private String date;

    private float distanceDay;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getDistanceDay() {
        return distanceDay;

    }

    public void setDistanceDay(float distanceDay) {
        this.distanceDay = distanceDay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
