package com.company;

public class region {


    private city[] cities;
    private final String name;
    private int square;

    public region(String name_,city[] cities_){

        name=name_;
        cities=cities_.clone();
        square=0;

        for (int i = 0; i <cities.length ; i++) {
            square+=cities_[i].getSquare();
        }
    }

    public int getSquare() {
        return square;
    }

    public String getName() {
        return name;
    }

    public city[] getCities() {
        return cities;
    }
}
