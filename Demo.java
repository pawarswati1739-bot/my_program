package com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;


public class Demo {
	public static void main(String[] args) {

        //  Create List of Students
        List<String> students = Arrays.asList("Swati", "Amit", "Rohan", "Priya", "Anjali");

        System.out.println("Original List:");
        students.forEach(name -> System.out.println(name));

        //  Using Stream API - Filter names starting with 'A'
        System.out.println("\nNames Starting With A:");
        List<String> filteredList = students.stream()
                                            .filter(name -> name.startsWith("A"))
                                            .collect(Collectors.toList());

        filteredList.forEach(System.out::println);

        //  Using Stream API - Convert names to Uppercase
        System.out.println("\nUppercase Names:");
        List<String> upperList = students.stream()
                                         .map(String::toUpperCase)
                                         .collect(Collectors.toList());

        upperList.forEach(System.out::println);

        //  Using StringJoiner
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        students.forEach(joiner::add);

        System.out.println("\nJoined Names:");
        System.out.println(joiner);

        //  Date and Time Methods
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);

        System.out.println("\nCurrent Date: " + today);
        System.out.println("Current Time: " + time);
        System.out.println("Formatted Date & Time: " + formattedDateTime);

        // Using Stream with Date
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2026, 3, 1),
                LocalDate.of(2026, 3, 5),
                LocalDate.of(2026, 2, 28)
        );

        System.out.println("\nFuture Dates:");
        dates.stream()
             .filter(d -> d.isAfter(today))
             .forEach(System.out::println);
    }
}
