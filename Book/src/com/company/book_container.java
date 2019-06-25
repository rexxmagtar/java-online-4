package com.company;

public class book_container {

    private book[] books;


    public book_container(book[] mass){
    books=mass.clone();

    }

    public  void show_of_author(String auther){

        for (var token:books) {

            for(int i=0;i<token.getAuthors().length;i++){

                if(token.getAuthors()[i].compareTo(auther)==0){

                    System.out.println(token);
                    break;
                }
            }
        }

    }

    public  void show_of_corporation(String corporation){

        for (var token:books) {

            if(token.getCorporation().compareTo(corporation)==0){


                System.out.println(token);
            }
        }

    }

    public  void show_of_year(int year){

        for (var token:books) {

            if(token.getPublish_year()>year){


                System.out.println(token);
            }
        }

    }

}
