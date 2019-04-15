package com.backedtest.restapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public List<Book> getAllBooks() {
        return this.bookService.getAllBooks();
    }

    @RequestMapping("/books/{barcode}")
    public Optional<Book> getBook(@PathVariable String barcode){
    return bookService.getBook(barcode);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/books")
    public String addBook(@RequestBody Book book){
        bookService.addBook(new Book(book.getBarcode(),book.getTitle(),book.getAuthor(),book.getNumofpages(),book.isRead()));
        return "Added a new Book";
    }


    @RequestMapping(method = RequestMethod.DELETE,value="/books/{barcode}")
    public void deleteBook(@PathVariable String barcode){
         bookService.deleteBook(barcode);
    }

}
