package com.miras.design.patterns.structural.facade;

public class Example {
    public static void main(String... args) {
        ReadingFacade readingFacade = new ReadingFacade();

        readingFacade.readBook();
        readingFacade.readMagazine();
        readingFacade.readNewspaper();
    }

}
