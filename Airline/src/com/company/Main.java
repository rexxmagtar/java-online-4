package com.company;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Airline_class airline1=new Airline_class("Minsk",227, Airline_class.plane_type.light,
                LocalTime.of(22,30), Airline_class.days_of_week.mn);

        Airline_class airline2=new Airline_class("Gomel",130, Airline_class.plane_type.heavy,
                LocalTime.of(8,0), Airline_class.days_of_week.th);

        Airline_class airline3=new Airline_class("Moscow",97, Airline_class.plane_type.mid,
                LocalTime.of(4,20), Airline_class.days_of_week.mn);

        Airline_container container=new Airline_container(new Airline_class[]{airline1,airline2,airline3});

        container.show_of_arrive_point("Gomel");
        System.out.println("-------------------------------------------------------");
        container.show_of_day(Airline_class.days_of_week.mn);
        System.out.println("-------------------------------------------------------");
        container.show_of_day_time(Airline_class.days_of_week.mn,LocalTime.of(5,0));
    }
}
