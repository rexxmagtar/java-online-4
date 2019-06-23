package com.company;

public class Pair<T,E> {

   public T first=null;
   public E second=null;

   public Pair(){

   }

    public Pair(T first_,E second_){
        first=first_;
        second=second_;

    }

    @Override
    public String toString() {
        return (first+","+second);
    }
}
