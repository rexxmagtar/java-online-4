package com.company;

import java.util.Arrays;

public class book {
    enum type_of_pereplet{light,hard};

    private   int ID;
    private static int id_;
    private  String name;
    private  String[] authors;
    private  String corporation;
    private  int publish_year;
    private int number_of_pages;
    private int prize;
    private type_of_pereplet type_of_pereplet_;

    public book(String name, String[] authors, String corporation,
                int publish_year, int number_of_pages,
                int prize, type_of_pereplet type_of_pereplet_)
    {
        ID=id_++;
        this.name = name;
        this.authors = authors;
        this.corporation = corporation;
        this.publish_year = publish_year;
        this.number_of_pages = number_of_pages;
        this.prize = prize;
        this.type_of_pereplet_ = type_of_pereplet_;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getCorporation() {
        return corporation;
    }

    public void setCorporation(String corporation) {
        this.corporation = corporation;
    }

    public int getPublish_year() {
        return publish_year;
    }

    public void setPublish_year(int publish_year) {
        this.publish_year = publish_year;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public type_of_pereplet getType_of_pereplet_() {
        return type_of_pereplet_;
    }

    public void setType_of_pereplet_(type_of_pereplet type_of_pereplet_) {
        this.type_of_pereplet_ = type_of_pereplet_;
    }

    @Override
    public String toString() {
        return
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", corporation='" + corporation + '\'' +
                ", publish_year=" + publish_year +
                ", number_of_pages=" + number_of_pages +
                ", prize=" + prize +
                ", type_of_pereplet_=" + type_of_pereplet_ ;

    }
}
