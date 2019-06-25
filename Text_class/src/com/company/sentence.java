package com.company;

public class sentence {

   private word[] words;
   private String sentence_="";

    public sentence(word[] mass){
        words=mass.clone();
        for (int i = 0; i <mass.length ; i++) {

            sentence_+=words[i].toString()+" ";
        }
        sentence_=sentence_.substring(0,sentence_.length()-1);
        sentence_+=".";


    }

    @Override
    public String toString() {
        return sentence_;
    }



}
