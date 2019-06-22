package com.company;

import java.time.LocalTime;
import java.util.Date;

public class Train {



   private   String arrive_point;
   private   int number;
   private LocalTime departure;

public Train(String arrive_point_,int number_,LocalTime data){


    arrive_point=arrive_point_;
    number=number_;
    departure=data;


}

    public LocalTime getDeparture() {
        return departure;
    }

    public int getNumber() {
        return number;
    }

    public String getArrive_point() {
        return arrive_point;
    }

    public void setArrive_point(String arrive_point) {
        this.arrive_point = arrive_point;
    }

    public void setDeparture(LocalTime departure) {
        this.departure = departure;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public  void show(){


            System.out.println(this.getArrive_point()+" № "+this.getNumber()+" departure start: "+
                    this.getDeparture());

    }
}

