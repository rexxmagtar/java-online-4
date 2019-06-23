package com.company;

import java.sql.Time;

public class Time_class {

    private   int hours=0;
    private   int min=0;
    private   int sec=0;

    public  Time_class(){



    }

    public void setHours(int hours) {
        if(hours<0)
            hours=0;
        else{
            hours=hours%24;
        }
        this.hours = hours;
    }

    public void setMin(int min) {


            setHours(getHours()+(min/60));
            min=(min%60);



        this.min = min;
    }

    public void setSec(int sec) {

        setMin(getMin()+sec/60);
        sec=sec%60;
        this.sec = sec;
    }

    public int getHours() {
        return hours;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public Time_class(int hours,int min,int sec){

        setHours(hours);
        setMin(min);
        setSec(sec);
    }
    public void time_change_(int hours,int min,int sec){

       setHours(getHours()+hours);
       setMin(getMin()+min);
       setSec(getSec()+sec);
    }

}
