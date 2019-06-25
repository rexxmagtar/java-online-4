package com.company;


import java.time.LocalTime;

public class Airline_class {
enum plane_type{light,mid,heavy};

enum  days_of_week{mn,tu,wd,th,fr,st,sn}

    private  String arrive_point;
    private int race_number;
    private plane_type plane_type_;
    private LocalTime time_depart;
    private days_of_week day_of_week;


    public Airline_class(String arrive_point, int race_number,
                         plane_type plane_type_, LocalTime time_depart,
                         days_of_week day_of_week) {
        this.arrive_point = arrive_point;
        this.race_number = race_number;
        this.plane_type_ = plane_type_;
        this.time_depart = time_depart;
        this.day_of_week = day_of_week;
    }

    public String getArrive_point() {
        return arrive_point;
    }

    public void setArrive_point(String arrive_point) {
        this.arrive_point = arrive_point;
    }

    public int getRace_number() {
        return race_number;
    }

    public void setRace_number(int race_number) {
        this.race_number = race_number;
    }

    public plane_type getPlane_type_() {
        return plane_type_;
    }

    public void setPlane_type_(plane_type plane_type_) {
        this.plane_type_ = plane_type_;
    }

    public LocalTime getTime_depart() {
        return time_depart;
    }

    public void setTime_depart(LocalTime time_depart) {
        this.time_depart = time_depart;
    }

    public days_of_week getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(days_of_week day_of_week) {
        this.day_of_week = day_of_week;
    }

    @Override
    public String toString() {
        return
                "arrive_point='" + arrive_point + '\'' +
                ", race_number=" + race_number +
                ", plane_type_=" + plane_type_ +
                ", time_depart=" + time_depart +
                ", day_of_week='" + day_of_week + '\'';
    }
}
