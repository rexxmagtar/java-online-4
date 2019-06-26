package com.company;

public class country {



    private final String name;
    private zone[] zones;
    private  int square=0;
    private  city capital;

    public country(String name, zone[] zones,int center_zone_index) {
        this.name = name;
        this.zones = zones;
        square=0;
        capital=zones[center_zone_index].getZone_center();
        for (int i = 0; i <zones.length ; i++) {
            square+=zones[i].getSquare();
        }

    }

    public String getName() {
        return name;
    }

    public zone[] getZones() {
        return zones;
    }

    public int getSquare() {
        return square;
    }

    public city getCapital() {
        return capital;
    }


    @Override
    public String toString() {

        return
                "name=" + name +
                ", square=" + square +
                ", capital=" + capital+
                ", zones count="+ zones.length+
                        ", zones_centers:\n"+getCenters();


    }

    public int getCoutnZones(){
        return zones.length;
    }

    public String getCenters(){
        String zones_centers="";
        for (var token:zones) {
            zones_centers+=token.getName()+":"+token.getZone_center()+"\n";

        }
        return zones_centers;
    }
}
