package com.company;

import java.time.LocalTime;

public class Airline_container {

    private Airline_class[] container;

    public Airline_container(Airline_class[] mass){

        container=mass.clone();
    }

    public  void show_of_arrive_point(String point){
        for (Airline_class token:container) {
            if(token.getArrive_point().compareTo(point)==0){
                System.out.println(token);
            }
        }

    }

    public  void show_of_day(Airline_class.days_of_week day){

        for (Airline_class token:container) {
            if(token.getDay_of_week()==day){
                System.out.println(token);
            }
        }

    }

    public  void show_of_day_time(Airline_class.days_of_week day, LocalTime time){

        for (Airline_class token:container) {
            if(token.getDay_of_week()==day && token.getTime_depart().isAfter(time)){
                System.out.println(token);
            }
        }

    }
}
