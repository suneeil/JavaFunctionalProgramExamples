package methodReferences;

import java.util.List;

public class MethodReferencesEx1 {

    private static void printStr(String str) {
        System.out.println(str);
    }
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        System.out.println("==========Without Method Reference===============");
        courses.stream()
                .map(str -> str.toUpperCase())
                .forEach(str -> System.out.println(str));

        System.out.println("==========With Method Reference===============");
        courses.stream()
                .map(str -> str.toUpperCase())
                .forEach(MethodReferencesEx1::printStr);
        System.out.println("==========With Method Reference===============");courses.stream()
                .map(str -> str.toUpperCase())
                .forEach(System.out::println);

    }
}
