package com.restapi.services;

import com.restapi.dao.*;
import com.restapi.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

    //    private static List<Book> list = new ArrayList<Book>();
//
//    static {
//        list.add(new Book(12, "Java Complete Reference", "Yash Tailor"));
//        list.add(new Book(36, "Head first Java", "Arpit"));
//        list.add(new Book(155, "Thing in java", "Shailesh"));
//    }
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        List<Book> list = (List<Book>) bookRepository.findAll();
        return list;
    }

    public Book getBookById(int id) {
        Book book = null;
//        try {
//            book = list.stream().filter(e -> e.getId() == id).findFirst().get();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try{
           book =  bookRepository.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return book;
    }

    public Book addBook(Book book) {
//        list.add(book);
//        return book;
        Book res = bookRepository.save(book);
        return res;
    }

    public void deleteBook(int bookId) {
//        list = list.stream().filter(book ->
//                        book.getId() != bookId).
//                collect(Collectors.toList());
        bookRepository.deleteById(bookId);
    }

    public void updateBook(Book book, int bookId) {
//        list = list.stream().map(b -> {
//            if (b.getId() == bookId) {
//                b.setTitle(book.getTitle());
//                b.setAuthor(book.getAuthor());
//            }
//            return b;
//        }).collect(Collectors.toList());
        book.setId(bookId);
        bookRepository.save(book);
    }
}
