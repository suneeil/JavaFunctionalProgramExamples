package stream;

import java.util.Comparator;
import java.util.List;

public class ComparatorSort {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        courses.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

        System.out.println("--------");

        courses.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("--------");

        courses.stream()
                .sorted(Comparator.comparing(str -> str.length()))
                .forEach(System.out::println);
    }
}
