package com.company;

public class zone {

    private final String name;
    private int square=0;
    private region[] regions;
    private city zone_center;
    public zone(String name_,region[] regions,int center_index_region,int center_index_city){

        name=name_;
        square=0;
        this.regions=regions.clone();
        this.zone_center=regions[center_index_region-1].getCities()[center_index_city-1];

        for (int i = 0; i <regions.length ; i++) {
            square+=regions[i].getSquare();
        }


    }

    public String getName() {
        return name;
    }

    public int getSquare() {
        return square;
    }


    public city getZone_center() {
        return zone_center;
    }

    public void setZone_center(city zone_center) {
        this.zone_center = zone_center;
    }
}
