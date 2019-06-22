package com.company;

import java.security.KeyStore;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class Main {

   static Comparator<Train> comparator_by_number=new Comparator<Train>() {
        @Override
        public int compare(Train o1, Train o2) {

            if(o1.getNumber()>o2.getNumber())
            return 1;
            if(o1.getNumber()<o2.getNumber())
                return -1;
            return 0;
        }
    };

    static Comparator<Train> comparator_by_arrive_point=new Comparator<Train>() {
        @Override
        public int compare(Train o1, Train o2) {

            if ((o1.getArrive_point().compareTo( o2.getArrive_point())==1))
                return 1;
            if ((o1.getArrive_point().compareTo( o2.getArrive_point())==-1))
                return -1;

            if(o1.getDeparture().isAfter(o2.getDeparture()))
                return 1;
            if(o1.getDeparture().isBefore(o2.getDeparture()))
                return -1;

            return 0;
        }
    };



    public static void main(String[] args) {

        Train train1=new Train("Minsk",14,(LocalTime.of(22,40)));
        Train train2=new Train("Gomel",6,(LocalTime.of(5,35)));
        Train train3=new Train("Minsk",19,(LocalTime.of(10,40)));
        Train train4=new Train("Gomel",6,(LocalTime.of(8,35)));
        Train train5=new Train("Mogilev",5,(LocalTime.of(4,20)));


        Train[] trains=new Train[]{train1,train2,train3,train4,train5};


        while (true ){
            System.out.println("1-сортировка по номеру  поезда"+" 2-сортировка по пункту назначения "+"3- инфо по заданному номеру ");
       int command= new Scanner(System.in).nextInt();
       if(command==1){

           Arrays.sort(trains,comparator_by_number);


           for (var iterator:
                   trains
                ) {
               iterator.show();

           }
                  }

       if(command==2){


           Arrays.sort(trains,comparator_by_arrive_point);


           for (var iterator:
                   trains
           ) {
               iterator.show();

           }

       }
       if(command==3){
           System.out.println("Введите номер ");
           int number=new Scanner(System.in).nextInt();

           for(int i =0;i<trains.length;i++){

               if(trains[i].getNumber()==number){

                   trains[i].show();
                   break;
               }

           }
       }
        }



    }
}
