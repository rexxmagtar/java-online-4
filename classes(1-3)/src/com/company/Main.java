package com.company;

public class Main {

    public static void main(String[] args) {

///test1
        Test1 h=new Test1(1,2);
        h.show();
        System.out.println("сумма " +h.sum()+" наибольшее "+h.max());

///test2
        System.out.println("-----------------");
        Test2 p=new Test2();
        System.out.println("a= "+p.getA()+" b="+p.getB());

///student
        System.out.println("-----------------");

        Student s1=new Student("Shishlyannikov I.V",12,new int[]{1,2,3,4,5});
        Student s2=new Student("Bondarenko K.P",2,new int[]{4,5,3,9,10});
        Student s3=new Student("Kalinchuk J.H",13,new int[]{5,5,3,8,7});
        Student s4=new Student("Krivulets R.P",15,new int[]{1,2,3,4,5});
        Student s5=new Student("Hersanov K.P",7,new int[]{4,5,3,9,10});
        Student s6=new Student("Kalinchukova K.H",12,new int[]{5,5,3,8,7});
        Student s7=new Student("Kalinchuk J.H",13,new int[]{5,5,3,8,7});
        Student s8=new Student("Lihovets R.P",15,new int[]{1,2,3,4,5});
        Student s9=new Student("Hersanova K.P",7,new int[]{9,9,10,9,10});
        Student s10=new Student("Kajova K.H",12,new int[]{7,8,8,8,10});



        Student[] students=new Student[]{s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
        boolean flag;
        for (var iterator:students
             ) {
            flag=false;
            for(int i=0;i<iterator.grades.length;i++){

                if(iterator.grades[i]<9) {
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println(iterator.name+" "+iterator.group);
            }


        }

///Train
        System.out.println("-----------------");

    }
}
