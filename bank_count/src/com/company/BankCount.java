package com.company;

import java.util.ArrayList;
import java.util.Comparator;


class BankCounts {
Comparator<BankCount> countComparator=new Comparator<BankCount>() {
    @Override
    public int compare(BankCount o1, BankCount o2) {
        if(o1.getCount()>o2.getCount())
            return 1;
        if(o1.getCount()<o2.getCount())
            return -1;

            return 0;
    }
};



    private String name;
    private ArrayList<BankCount> counts;
    private static int id=0;


    public BankCounts(String  name_){
        this.name=name_;
        counts=new ArrayList<BankCount>();

    }

    public void addCount(int sum){

        counts.add(new BankCount(sum,false));
    }


     public void changeBalance(int delta,int index){

        if(!counts.get(index).isLocked)
        counts.get(index).setCount(counts.get(index).getCount()+delta);

     }

     public int getBalance(int index){

        return counts.get(index).getCount();
     }

     public int getAllBalance(){

        int sum=0;
         for (var token:counts) {
             sum+=token.getCount();

         }

         return sum;

     }

     public int getPositiveCountsBalance(){

         int sum=0;
         for (var token:counts) {
             if(token.getCount()>0)
             sum+=token.getCount();

         }

         return sum;

     }




    public int getNegativeCountsBalance(){

        int sum=0;
        for (var token:counts) {
            if(token.getCount()<0)
                sum+=token.getCount();

        }

        return sum;


    }

    public void sort(){

        counts.sort(countComparator);
    }



  private  class BankCount  {


        private int ID;
        private int count = 0;
        private boolean isLocked = false;

        public BankCount(int count, boolean isLocked) {
            ID=id++;
            this.count = count;
            this.isLocked = isLocked;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public boolean isLocked() {
            return isLocked;
        }

        public void setLocked(boolean locked) {
            isLocked = locked;
        }
    }









}


