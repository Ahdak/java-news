package net.dammak.java9;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class TakeWhile {

    public static void main(String[] args) {
        Stream.of("a","b","").takeWhile(Predicate.not(String::isEmpty)).forEach(System.out::print);
    }
}
