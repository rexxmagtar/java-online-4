package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankCounts counts1=new BankCounts("Alex_count");

        counts1.addCount(1000);
        counts1.addCount(-1000);
        counts1.changeBalance(200,1);

        System.out.println("Allbalance:"+counts1.getAllBalance()+" positive:"+counts1.getPositiveCountsBalance()+
                " negative:"+counts1.getNegativeCountsBalance());
    }
}
