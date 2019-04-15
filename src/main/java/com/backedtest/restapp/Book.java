package com.backedtest.restapp;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    private String barcode;
    private String title;
    private String author;
    private int numofpages;
    @Column(name = "read1")
    private boolean read;


    //No Argument Constructor
    public Book() {
    }


    //All argument Constructor
    public Book(String barcode, String title, String author, int numofpages, boolean read) {
        this.barcode = barcode;
        this.title = title;
        this.author = author;
        this.numofpages = numofpages;
        this.read = read;
    }


    // Created Getters and Setters

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumofpages() {
        return numofpages;
    }

    public void setNumofpages(int numofpages) {
        this.numofpages = numofpages;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
}
