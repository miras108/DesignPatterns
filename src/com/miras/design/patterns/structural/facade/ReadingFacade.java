package com.miras.design.patterns.structural.facade;

public class ReadingFacade {
    private Book book;
    private Magazine magazine;
    private Newspaper newspaper;

    public ReadingFacade() {
        this.book = new Book();
        this.magazine = new Magazine();
        this.newspaper = new Newspaper();
    }

    public void readBook() {
        book.read();
    }

    public void readMagazine() {
        magazine.read();
    }

    public void readNewspaper() {
        newspaper.read();
    }
}
