package com.company;

import org.w3c.dom.css.Counter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        counter counter1=new counter(40);
        counter1.minus_counter();
        System.out.println(counter1.getCurrent_count());
    }
}
