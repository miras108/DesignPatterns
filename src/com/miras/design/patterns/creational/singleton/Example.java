package com.miras.design.patterns.creational.singleton;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class Example {

    public static void main(String... args) {
        firstTest();
        secondTest();
        thirdTest();
    }

    private static void firstTest() {
        Singleton firstSingleton = Singleton.getInstance();
        Singleton secondSingleton = Singleton.getInstance();

        System.out.println("First singleton test: ");
        System.out.println("\tIs the same object? : " + (firstSingleton == secondSingleton ? "YES" : "NO"));
    }

    private static void secondTest() {
        System.out.println("\nSecond singleton test:");
        System.out.println("\tOther object references in iterations");
        IntStream.rangeClosed(0, 1000)
                .forEach(iterationNumber -> {
                    ExecutorService executorService = Executors.newFixedThreadPool(2);
                    Future<Singleton> firstFeatureSingleton = executorService.submit(Singleton::getInstance);
                    Future<Singleton> secondFeatureSingleton = executorService.submit(Singleton::getInstance);

                    try {
                        if (firstFeatureSingleton.get() != secondFeatureSingleton.get()) {
                            System.out.println("iteration: " + iterationNumber);
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }

                    executorService.shutdown();
                });
    }

    private static void thirdTest() {
        ThreadSafeSingleton firstSingleton = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton secondSingleton = ThreadSafeSingleton.getInstance();

        System.out.println("\nThird singleton test: ");
        System.out.println("\tIs the same object? : " + (firstSingleton == secondSingleton ? "YES" : "NO"));
    }
}
