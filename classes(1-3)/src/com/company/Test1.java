package com.company;

public class Test1 {

   private int a;
   private int b;

    Test1(int a_,int b_){
        a=a_;
        b=b_;
    }

    public void show(){

        System.out.println("a= "+a+" b= "+b);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int sum(){
        return  a+b;
    }

    public  int max(){
        return Math.max(a,b);
    }
}
