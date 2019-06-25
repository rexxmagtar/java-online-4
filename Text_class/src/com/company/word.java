package com.company;

public class word {

    private String word;


    public word(String word) {
        this.word = word;
    }


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }
}
