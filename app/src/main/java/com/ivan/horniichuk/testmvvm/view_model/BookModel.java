package com.ivan.horniichuk.testmvvm.view_model;

import com.ivan.horniichuk.testmvvm.model.Book;

public class BookModel {
    private String title;
    private String author;
    private String pages;

    public BookModel(Book book) {
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.pages = String.valueOf(book.getPages());
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

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

}
