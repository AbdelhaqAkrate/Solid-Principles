package org.example.SingleResponsibility;

import java.util.*;

public class AuthorBookSize {
    private Author author;
    public AuthorBookSize(Author author) {
        this.author = author;
    }
    public int getAuthorBooks(){
        return author.getBooks().size();
    }

    public static void main(String[] args) {
        Book b1 = new Book("Mistborn");
        Book b2 = new Book("the first law");
        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        Author a = new Author("Ken", "email@gmail.com", books);
        AuthorBookSize s = new AuthorBookSize(a);
        System.out.println("Number of books is : " + s.getAuthorBooks());
        
    }
}
