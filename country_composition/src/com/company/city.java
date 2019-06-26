package com.company;

public class city {
    
    private  final String name;
    private int square;

    public city(String name, int square) {
        this.name = name;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public int getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return name;
    }
}
