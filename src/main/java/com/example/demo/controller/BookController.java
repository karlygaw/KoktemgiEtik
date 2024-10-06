package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping( "/books")
    public String getBooks(@RequestParam(required = false) String genre, Model model){
        model.addAttribute("book", bookService.getBooks(genre));
        return "books.html";
    }

    @PostMapping( "/books")
    public String addBook(@RequestParam String name, @RequestParam String genre, Model model){
    List<Book> result = bookService.addBook(name, genre);
    model.addAttribute("book", result);
    return "books.html";
    }

}
