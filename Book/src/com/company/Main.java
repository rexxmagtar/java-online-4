package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


      book book1=new book("War an peace",new String[]{"Tolstoy L.N"},"ComPrint",
              1869,1275,50, book.type_of_pereplet.hard);
      book book2=new book("while I'm alive",new String[]{"Janny Daunhaen"},"NetBook",
                2007,380,10, book.type_of_pereplet.light);
      book book3=new book("Brain traps",new String[]{"Janny Daunhaen","Denis Nikelson"},"ComPrint",
                2015,900,93, book.type_of_pereplet.light);



      book_container container=new book_container(new book[]{book1,book2,book3});

      container.show_of_author("Tolstoy L.N");
      System.out.println("--------------------------------------------------------------------------------");
      container.show_of_corporation("ComPrint");
        System.out.println("--------------------------------------------------------------------------------");
      container.show_of_year(2000);
    }
}
