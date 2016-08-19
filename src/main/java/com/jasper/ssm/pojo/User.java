package com.jasper.ssm.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private float distance;

    private float hour;

    private int times;

    private int select;

    private String date;

    private float distance_day;

    private float distance_hour;

    public float getDistance_day() {
        return distance_day;
    }

    public void setDistance_day(float distance_day) {
        this.distance_day = distance_day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getDistance_hour() {
        return distance_hour;
    }

    public void setDistance_hour(float distance_hour) {
        this.distance_hour = distance_hour;
    }

    public int getSelect() {
        return select;
    }

    public void setSelect(int select) {
        this.select = select;
    }

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
    public float getHour() {
        return hour;
    }

    public void setHour(float hour) {
        this.hour = hour;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }
//
//    public Date getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(Date birthday) {
//        this.birthday = birthday;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex == null ? null : sex.trim();
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address == null ? null : address.trim();
//    }
}