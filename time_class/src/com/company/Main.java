package com.company;

import java.sql.Time;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Time_class time1=new Time_class(12,10,22);
        time1.time_change_(1,70,80);

        System.out.println(time1.getHours()+":"+time1.getMin()+":"+time1.getSec());
    }
}
