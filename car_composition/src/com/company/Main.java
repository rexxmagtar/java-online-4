package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        wheel[] wheels=new wheel[]{new wheel(),new wheel(),new wheel(),new wheel()};
        engine engine1=new engine();

        car car1=new car(engine1,wheels,"Toyota");


        car1.change_wheel(1,new wheel());

        car1.add_fuel();

        car1.getMark();

        car1.go();
    }
}
