package com.miras.design.patterns.builder;

public class Example {

    public static void main(String... args) {
        Person person = new Person.PersonBuilder("Piotr", "Mirek")
                .age(27)
                .dateOfBirth("13.01.1991")
                .city("Cracov")
                .countryCode("PL")
                .build();

        System.out.println("Built person: \n" + person);
    }

}
