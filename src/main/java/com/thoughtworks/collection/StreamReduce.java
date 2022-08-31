package com.thoughtworks.collection;

import java.util.List;


public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream()
                .reduce((number1, number2) -> number2)
                .get();
    }

    public String getLongest(List<String> words) {
        return words.stream()
                .reduce((word1, word2) -> word1.length() >= word2.length() ? word1 : word2)
                .get();
    }

    public int getTotalLength(List<String> words) {
        return words.stream().mapToInt(String::length).reduce(0, Integer::sum);
    }
}
