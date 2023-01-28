package methodReferences;

import java.util.List;

/**
 * String::toUpperCase --> is method reference
 */
public class MethodReferenceOnSpecificObject {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        courses.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
