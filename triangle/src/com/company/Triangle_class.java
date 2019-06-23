package com.company;

import java.security.KeyPair;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Map;





public class Triangle_class {

   private Pair<Integer,Integer> point1;
   private Pair<Integer,Integer> point2;
   private Pair<Integer,Integer> point3;
   private Pair<Double,Double> point_center;

   private double length_1_2;///Длины
   private double length_2_3;
   private double length_1_3;
   private double perimetr;
   private  double square;


    public Pair<Integer, Integer> getPoint1() {
        return point1;
    }

    public void setPoint1(Pair<Integer, Integer> point1) {
        this.point1 = point1;
    }

    public Pair<Integer, Integer> getPoint2() {
        return point2;
    }

    public void setPoint2(Pair<Integer, Integer> point2) {
        this.point2 = point2;
    }

    public Pair<Integer, Integer> getPoint3() {
        return point3;
    }

    public void setPoint3(Pair<Integer, Integer> point3) {
        this.point3 = point3;
    }

    public  Triangle_class(Integer p1_x,Integer p1_y,Integer p2_x,Integer p2_y,Integer p3_x,Integer p3_y)
    {

        this(new Pair<Integer,Integer>(p1_x,p1_y),new Pair<Integer,Integer>(p2_x,p2_y),
                new Pair<Integer,Integer>(p3_x,p3_y));
    }
    public Triangle_class(Pair<Integer, Integer> point1,
                          Pair<Integer, Integer> point2,
                          Pair<Integer, Integer> point3) {

        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;

        length_1_2=get_length(point1,point2);
        length_2_3=get_length(point2,point3);
        length_1_3=get_length(point1,point3);

        perimetr=length_1_2+length_1_3+length_2_3;

        square=Math.sqrt(perimetr/2*(perimetr/2-length_1_2)*(perimetr/2-length_2_3)*(perimetr/2-length_1_3));


        double x_center=(length_2_3*point1.first+length_1_2*point3.first+length_1_3*point2.first)/perimetr;
        double y_center=(length_2_3*point1.second+length_1_2*point3.second+length_1_3*point2.second)/perimetr;

        point_center=new Pair<Double, Double>(x_center,y_center);




    }

    private double get_length(Pair<Integer,Integer> point1, Pair<Integer,Integer> point2){

        return Math.sqrt( Math.pow(point1.first-point2.first,2)+Math.pow(point1.second-point2.second,2));

    }


    public Pair<Double,Double> getPoint_center() {
        return point_center;
    }

    public double getPerimetr() {
        return perimetr;
    }

    public double getSquare() {
        return square;
    }
}
