package com.example.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>(Arrays.asList(new Person(1, "June", 30), new Person(2, "June", 30)));
        List<String> names = list.stream().map(v -> v.getName()).collect(Collectors.toList());
    }
}
