package com.company;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        Predicate<String> predicate = (s) -> s.length() > 6;
        System.out.println("Predicate :" + predicate.test("helloWorld!"));
        System.out.println("Predicate :" + predicate.test("hello!"));

        Consumer<String> consumer = (s) -> System.out.println("Consumer " + s);
        consumer.accept("Accept a value and return nothing ");

        Supplier<String> supplier = () -> "This text gets from supplier";
        System.out.println(supplier.get());

        Function<String, Integer> function = (s) -> s.length();
        System.out.println("Function :" + function.apply("testString"));
    }

}
