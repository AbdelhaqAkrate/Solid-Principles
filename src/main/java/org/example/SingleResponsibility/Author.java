package org.example.SingleResponsibility;

import java.util.*;

public class Author {
     private String name;
    private String email;
    private List<Book> books;
    public Author(String name, String email, List<Book> books) {
        this.name = name;
        this.email = email;
        this.books = books;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void Details(){
        System.out.println("Author name : " + name + " Email : " + email);
        for (Book b : books) {
            System.out.println(" Book: " + b.getTitle());
        }
    }
    public int getAuthorBooks(){
        return books.size();
    }

public static void main(String[] args) {
        //normal 
        Book b1 = new Book("Mistborn");
        Book b2 = new Book("the first law");
        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        Author a = new Author("Ken", "email@gmail.com", books);
        a.Details();  
        System.out.println("Number of books is : " + a.getAuthorBooks());
    }
}
