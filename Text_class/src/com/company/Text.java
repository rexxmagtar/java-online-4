package com.company;

public class Text {

    private  String headline;
    private sentence[] sentences;
    private String text="";
    public Text(String headline, sentence[] text) {
        this.headline = headline;
        this.sentences = text.clone();
        for (int i = 0; i <sentences.length ; i++) {
        this.text+=sentences[i].toString();

        }
    }

    @Override
    public String toString() {
        return headline+"\n"+ text;
    }
}
