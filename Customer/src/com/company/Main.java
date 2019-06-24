package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Customer_class customer1=new Customer_class("Ivan","Shishlyannikov","Victorovich",
                "Kirova 2/4",12345678,435264);
        Customer_class customer2=new Customer_class("Dmitri","Kishenko","Olegovich",
                "Richeva 28",878482,100234);
        Customer_class customer3=new Customer_class("Jungo","Karavazov","Ikhulovochidov",
                "Hermanova 10",323673,451234);

        Customer_class[] mass=new Customer_class[]{customer1,customer2,customer3};

        customer_container container=new customer_container(mass);
        container.show_in_alphabetic_order();


        System.out.println("---------------------------------------"+'\n'+"Введите левую  и правую границу");

        Scanner scan=new Scanner(System.in);
        container.show_on_interval(scan.nextInt(),scan.nextInt());
    }
}
