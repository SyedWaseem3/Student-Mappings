package com.geekster.StudentMappingsProject.service;

import com.geekster.StudentMappingsProject.model.Book;
import com.geekster.StudentMappingsProject.repo.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    IBookRepo bookRepo;

    public String addBook(Book newBook) {
        bookRepo.save(newBook);
        return "Book added!";
    }

    public List<Book> getBooks() {
        return bookRepo.findAll();
    }

    public String updateBookPriceById(Long id, Integer price) {
        Book book = bookRepo.findById(id).orElseThrow();
        book.setBookPrice(price);
        bookRepo.save(book);
        return "Book's price updated!";
    }

    public String deleteBookById(Long id) {
        bookRepo.deleteById(id);
        return "Book deleted!";
    }
}
