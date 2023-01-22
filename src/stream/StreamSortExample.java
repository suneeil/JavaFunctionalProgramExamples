package stream;

import java.util.List;


public class StreamSortExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("-----");

        numbers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("-----");

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        courses.stream()
                .sorted()
                .forEach(System.out::println);
    }

}

