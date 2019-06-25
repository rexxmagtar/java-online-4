package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        word word1=new word("Hello");
        word word2=new word("java");
        word word3=new word("This");
        word word4=new word("is");
        word word5=new word("test");
        word word6=new word("sentence");

        sentence sentence1=new sentence(new word[]{word1,word2});
        sentence sentence2=new sentence(new word[]{word3,word4,word5,word6});

        Text tex1=new Text("MY HEADLINE",new sentence[]{sentence1,sentence2});

        System.out.println(tex1);


    }
}
