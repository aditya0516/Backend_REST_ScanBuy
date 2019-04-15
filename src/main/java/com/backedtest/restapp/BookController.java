package com.backedtest.restapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //Specifies the Spring Application that this is a RestController
public class BookController {

    @Autowired
    private BookService bookService; //Creates an instance of the BookService

    @RequestMapping("/books")
    public List<Book> getAllBooks() {
        return this.bookService.getAllBooks();
    } //Makes a call to the getAllBooks method in the BookService class and executes the function.

    @RequestMapping("/books/{barcode}")
    public Optional<Book> getBook(@PathVariable String barcode){
    return bookService.getBook(barcode);
    }//Makes a call to the getBook method in the BookService class and executes the function passing the barcode as the parameter.

    @RequestMapping(method = RequestMethod.POST,value = "/books")
    public String addBook(@RequestBody Book book){
        bookService.addBook(new Book(book.getBarcode(),book.getTitle(),book.getAuthor(),book.getNumofpages(),book.isRead()));
        return "Added a new Book";
    }//Makes a call to the addBook method in the BookService class and executes the function passing the parameters


    @RequestMapping(method = RequestMethod.DELETE,value="/books/{barcode}")
    public void deleteBook(@PathVariable String barcode){
         bookService.deleteBook(barcode);
    }//Makes a call to the deleteBook method in the BookService class and deletes the book according to the parameter.

}
