package com.ivan.horniichuk.testmvvm.model;

public class ModelImpl implements Model {

    private final Book[] books = new Book[]{
            new Book("DogHeart", "Bulgakov", 150),
            new Book("HP and Philosophy Stone", "Rowling", 450),
            new Book("1984", "Orwell", 250)
    };

    private int currentPos = -1;

    @Override
    public Book getNextBook() {
        currentPos++;
        return books[currentPos % books.length];
    }
}
