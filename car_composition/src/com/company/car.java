package com.company;

public class car {

  private engine engine;
  private wheel[] wheels=new wheel[4];

  private String mark;

    public car(com.company.engine engine, wheel w1, wheel w2, wheel w3, wheel w4,String mark_) {
        this.engine = engine;
        mark=mark_;
      wheels=new wheel[]{w1,w2,w3,w4};
    }

    public car(com.company.engine engine, wheel[] wheels, String mark) {
        this.engine = engine;
        this.wheels = wheels;
        this.mark = mark;
    }

    public void go(){

        System.out.println("Car is moving");
    }

    public void  add_fuel(){

        System.out.println("Fuel added");
    }
    public  void change_wheel(int number,wheel wheel){

        wheels[number-1]=wheel;

    }

    public String getMark() {
        return mark;
    }
}

