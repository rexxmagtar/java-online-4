package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here



        city city1=new city("Mikulov",200);
        city city2=new city("Minsk",300);
        city city3=new city("Mogilev",100);
        city city4=new city("Brest",140);
        city city5=new city("Grodno",500);
        city city6=new city("Kiev",320);


        region region1=new region("region1",new city[]{city1,city2});
        region region2=new region("region2",new city[]{city3,city4});
        region region3=new region("region3",new city[]{city5,city6});

        zone zone1= new zone("Miskaya",new region[]{region1,region2},1,2);
        zone zone2= new zone("Grodnenskaya",new region[]{region3},1,1);

        country country1=new country("Belarus",new zone[]{zone1,zone2},1);

        System.out.println(country1);






    }
}
