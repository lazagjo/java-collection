package com.thoughtworks.collection;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSupplement {

    public StreamSupplement() {
    }

    public List<Integer> sortFromMaxToMin(List<Integer> numbers) {
        return numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public double getAverage(List<Integer> numbers) {
        return numbers.stream().mapToInt(num -> num).average().orElse(0);
    }

    public int getMaxValue(List<Integer> numbers) {
        return numbers.stream().mapToInt(num -> num).max().orElse(0);
    }

}
