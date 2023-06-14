package com.restapi.services;

import com.restapi.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    private static List<Book> list = new ArrayList<Book>();

    static {
        list.add(new Book(12, "Java Complete Reference", "Yash Tailor"));
        list.add(new Book(36, "Head first Java", "Arpit"));
        list.add(new Book(155, "Thing in java", "Shailesh"));
    }

    public List<Book> getAllBooks() {
        return list;
    }

    public Book getBookById(int id) {
        Book book;
        book = list.stream().filter(e -> e.getId() == id).findFirst().get();
        return book;
    }

    public Book addBook(Book book) {
        list.add(book);
        return book;
    }

    public void deleteBook(int bookId) {
        list = list.stream().filter(book ->
                            book.getId() != bookId).
                collect(Collectors.toList());
    }

    public void updateBook(Book book, int bookId) {
        list = list.stream().map(b->{
            if(b.getId() == bookId){
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
            }
            return b;
        }).collect(Collectors.toList());
    }
}
