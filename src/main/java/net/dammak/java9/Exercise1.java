package net.dammak.java9;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise1 {

    @Builder
    @Getter
    static class Family {
        private String name ;
        private List<String> firstNames ;
    }

    Map<String,List<String>> getMembersBySameName(List<Family> families) {
        return families.stream().
                collect(Collectors.groupingBy(Family::getName,
                Collectors.flatMapping(family -> family.getFirstNames().stream(),Collectors.toList())));
    }

}
