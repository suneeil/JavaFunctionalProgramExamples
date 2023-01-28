package modifyingList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ToUpper {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        List<String> modifiableCourses = new ArrayList<>(courses);

        modifiableCourses.replaceAll(String::toUpperCase);
        System.out.println(modifiableCourses);
        modifiableCourses.removeIf(course -> course.length()<6);
        System.out.println(modifiableCourses);
    }
}
