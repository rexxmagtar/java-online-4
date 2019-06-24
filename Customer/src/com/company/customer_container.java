package com.company;


import java.util.Arrays;
import java.util.Comparator;

public class customer_container {


Comparator<Customer_class> comparator_alphabet=new Comparator<Customer_class>() {
    @Override
    public int compare(Customer_class o1, Customer_class o2) {

      return  o1.getLast_name().compareTo(o2.getLast_name());

    }
};
   private Customer_class[] container;


    public  customer_container(Customer_class[] mass){

container=mass.clone();

    }



    public void show_in_alphabetic_order(){

        Customer_class[] show_container=container.clone();

        Arrays.sort(show_container,comparator_alphabet);


        for (var token:show_container
             ) {
            System.out.println(token);

        }








    }

    public void show_on_interval(int left,int right){

        for (Customer_class iterator:container) {
            if(iterator.getCard_number()<=right && iterator.getCard_number()>=left)
                System.out.println(iterator);


        }

    }



}
