package org.example;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotJava11 {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(3,4,5,67,89,88);
        Predicate<Integer> evenNumberPredicate=number->number%2==0;
        //numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);
        numbers.stream().filter(Predicate.not(PredicateNotJava11::isEven)).forEach(System.out::println);
    }
    public static boolean isEven(int number){
        return number%2==0;
    }
}
