package org.example.SingleResponsibility;

import java.util.*;



 

public class AuthorDetails {
    //
    private Author author;
    public AuthorDetails(Author author) {
        this.author = author;
    }
    public void printAuthorDetails() {
        System.out.println("Author name : " + author.getName() + " Email : " + author.getEmail());
        for (Book b : author.getBooks()) {
            System.out.println(" Book: " + b.getTitle());
        }
        
    }
    public static void main(String[] args) {
        //normal 
        Book b1 = new Book("Mistborn");
        Book b2 = new Book("the first law");
        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        Author a = new Author("Ken", "email@gmail.com", books);
        AuthorDetails s = new AuthorDetails(a);
        s.printAuthorDetails();  
    }
}