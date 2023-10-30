package HackerRank;

import java.util.Scanner;

public class SolutionAbstract {
    Scanner sc = new Scanner(System.in);
    String title = sc.nextLine();
    String author = sc.nextLine();
    int price = sc.nextInt();
    
    Book b = new MyBook(title,author, price);
    b.display();
    
}
abstract class Book {
    String title;
    String author;

    Book(String title, String author){
            this.title = title;
            this.author = author;
    }
        abstract void display();
}
class MyBook extends Book {
    int price;

    MyBook(String title, String auhor, int price){
        super(title, auhor);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: "+title+"\n"+"Author: "+author+"\n"+"Price: "+price);
    }

}
