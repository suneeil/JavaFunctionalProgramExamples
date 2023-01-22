package stream;

import java.util.List;
import java.util.stream.Collectors;

public class CollectingStreamToList {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 4, 2, 6, 13, 14, 15, 16, 17);

        List<Integer> sqrList = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        List<String> courseLength = courses.stream()
                .map(course -> course + ": " + course.length())
                .collect(Collectors.toList());
        System.out.println(courseLength);

        System.out.println("------");

        courses.stream()
                .filter(course -> course.length() >=4 )
                .forEach(System.out::println);

    }
}
