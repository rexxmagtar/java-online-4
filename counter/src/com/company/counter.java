package com.company;

public class counter {

   private int current_count=0;


    public void setCurrent_count(int current_count_) {

        if(current_count_>10)
            current_count_=10;

        if(current_count_<0)
            current_count_=0;

        this.current_count = current_count_;
    }

    public counter(){


    }

    public  counter(int state){
setCurrent_count(state);
    }

    public  void plus_counter(){
        setCurrent_count(++current_count);
    }
    public void  minus_counter(){
        setCurrent_count(--current_count);

    }

    public int getCurrent_count() {
        return current_count;
    }
}
