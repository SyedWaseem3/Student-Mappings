package com.geekster.StudentMappingsProject.controller;

import com.geekster.StudentMappingsProject.model.Book;
import com.geekster.StudentMappingsProject.model.Student;
import com.geekster.StudentMappingsProject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("book")
    public String addBook(@RequestBody Book newBook){
        return bookService.addBook(newBook);
    }

    @GetMapping("books")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @PutMapping("updateBookPriceById/{id}/price/{price}")
    public String updateBookPriceById(@PathVariable Long id, @PathVariable Integer price){
        return bookService.updateBookPriceById(id,price);
    }

    @DeleteMapping("deleteBookById/{id}")
    public String deleteBookById(@PathVariable Long id){
        return bookService.deleteBookById(id);
    }
}
