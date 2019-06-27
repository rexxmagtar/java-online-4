package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        programm programm1=new programm(14, programm.type.shopping, programm.transport.ground,
                programm.meals.two_times);
        programm programm2=new programm(5, programm.type.sport, programm.transport.air,
                programm.meals.light);
        programm programm3=new programm(14, programm.type.shopping, programm.transport.ground,
                programm.meals.two_times);

        programm programm4=new programm(30, programm.type.recovery, programm.transport.water,
                programm.meals.whole_pack);

        programm programm5=new programm(7, programm.type.cruise, programm.transport.water,
                programm.meals.two_times);
        programm programm6=new programm(92, programm.type.relax, programm.transport.air,
                programm.meals.whole_pack);
        programm programm7=new programm(3, programm.type.shopping, programm.transport.ground,
                programm.meals.light);
        programm programm8=new programm(1001, programm.type.cruise, programm.transport.water,
                programm.meals.whole_pack);



        ProgramContainer container=new ProgramContainer();

        container.add(programm1);
        container.add(programm2);
        container.add(programm3);
        container.add(programm4);
        container.add(programm5);
        container.add(programm6);
        container.add(programm7);
        container.add(programm8);




        container.sortDuration();
        System.out.println(container);

        container.sortMeal();
        System.out.println(container);

        container.sortTransport();
        System.out.println(container);

        container.sortType();
        System.out.println(container);






    }
}
