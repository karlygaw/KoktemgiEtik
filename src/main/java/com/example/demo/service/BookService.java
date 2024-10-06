package com.example.demo.service;

import com.example.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class BookService {
    private List<Book> bookList = new LinkedList<>();

    public BookService(){
        bookList.add(new Book("Spring", "education"));
        bookList.add(new Book("Spring Book", "education"));
        bookList.add(new Book("Harry Potter", "fantasy"));

    }

    public List<Book> getBooks(String genre){
        if(genre == null){
            return  bookList;
        }
        List<Book> result = new LinkedList<>();
        for (Book b : bookList){
            if (genre.equals(b.genre)){
                result.add(b);
            }
        }
        return  result;
    }

    public List<Book> addBook(String name, String genre){
        bookList.add(new Book(name, genre));
        return bookList;
    }
}
