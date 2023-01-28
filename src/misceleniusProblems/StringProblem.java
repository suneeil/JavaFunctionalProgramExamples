package misceleniusProblems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringProblem {
    public static void main(String[] args) {
        //Say you have a list of Strings having course names
        //Combine all of them separated by comma
        String courses = Stream.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes")
                .collect(Collectors.joining(" "));
        System.out.println(courses);

        String collect = Stream.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes")
                .collect(Collectors.joining("##"));
        System.out.println(collect);

        System.out.println("=======================");


    }
}
