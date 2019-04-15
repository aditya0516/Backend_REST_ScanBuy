package com.backedtest.restapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

   // private List<Book> books = new ArrayList<>(Arrays.asList(
     //       new Book("Barcode1", "Title1", "Author1", 20, true),
       //     new Book("Barcode2", "Title2", "Author2", 40, false),
           // new Book("Barcode3", "Title3", "Author3", 30, true)
    //));

    public List<Book> getAllBooks() {
        //return books;
        List<Book> books = new ArrayList<>();
        this.bookRepository.findAll().forEach(books::add);
        return books;
    }

    public Optional<Book> getBook(String barcode) {
       // return books.stream().filter(t -> t.getBarcode().equals(barcode)).findFirst().get();
        return bookRepository.findById(barcode);
    }

    public void addBook(Book book) {
        //books.add(book);
        this.bookRepository.save(book);
    }
/*
    public void updateBook(String barcode, Book book) {
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b.getBarcode().equals(barcode)) {
                books.set(i, book);
                return;
            }
        }
    }

    public void deleteBook(String barcode) {
        books.removeIf(t -> t.getBarcode().equals(barcode));
    }
*/
}
