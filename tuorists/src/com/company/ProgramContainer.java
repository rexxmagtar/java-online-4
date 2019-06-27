package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class ProgramContainer {

    Comparator<programm> comparatorDuration=new Comparator<programm>() {
        @Override
        public int compare(programm o1, programm o2) {
            if(o1.getDurationDays()>o2.getDurationDays())
                return 1;

            if(o1.getDurationDays()<o2.getDurationDays())
                return -1;

            return 0;

        }
    };

    Comparator<programm> comporatorTransport=new Comparator<programm>() {
        @Override
        public int compare(programm o1, programm o2) {
            return o1.getTransport().compareTo(o2.getTransport());
        }
    };

    Comparator<programm> comporatortType=new Comparator<programm>() {
        @Override
        public int compare(programm o1, programm o2) {
            return o1.getType().compareTo(o2.getType());
        }
    };

    Comparator<programm> comporatortMeal=new Comparator<programm>() {
        @Override
        public int compare(programm o1, programm o2) {
            return o1.getMeals().compareTo(o2.getMeals());
        }
    };





    private ArrayList<programm> programms;

    public  ProgramContainer(){

        programms=new ArrayList<programm>();
    }



    public void add(programm pr){

        programms.add(pr);
    }

    public void sortDuration(){

        programms.sort(comparatorDuration);
    }


    public void sortTransport(){

        programms.sort(comporatorTransport);

    }

    public void  sortType(){

        programms.sort(comporatortType);
    }

    public void  sortMeal(){

        programms.sort(comporatortMeal);

    }

    @Override
    public String toString() {

        String sum="";
        for (int i = 0; i <programms.size() ; i++) {

            sum+=programms.get(i)+"\n";
        }
        return sum;
    }

    public programm getProgrammAt(int index){

        return programms.get(index);
    }
}
