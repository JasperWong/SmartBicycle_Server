package com.jasper.ssm.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String date;

    private float distanceTotal;

    private float distanceDay;

    private float hourTotal;

    private int timesTotal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getDistanceTotal() {
        return distanceTotal;
    }

    public void setDistanceTotal(float distanceTotal) {
        this.distanceTotal = distanceTotal;
    }

    public float getDistanceDay() {
        return distanceDay;
    }

    public void setDistanceDay(float distanceDay) {
        this.distanceDay = distanceDay;
    }

    public float getHourTotal() {
        return hourTotal;
    }

    public void setHourTotal(float hourTotal) {
        this.hourTotal = hourTotal;
    }

    public int getTimesTotal() {
        return timesTotal;
    }

    public void setTimesTotal(int timesTotal) {
        this.timesTotal = timesTotal;
    }

 }