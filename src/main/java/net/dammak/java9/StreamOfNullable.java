package net.dammak.java9;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Stream.ofNullable;

public class StreamOfNullable {

    public static void main(String[] args) {
        var dictionary = Map.of("1","1","2","2") ;
        var elements = List.of("1" , "2","3") ;
        var nonNullValue = elements.stream()
                .map(dictionary::get)
                .filter(Objects::nonNull)
                .collect(toList()) ;
        var nonNullValue2 = elements.stream().
                flatMap(s -> ofNullable(dictionary.get(s)))
                .collect(toList());
        System.out.println(nonNullValue);
        System.out.println(nonNullValue2);
    }
}
