package misceleniusProblems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap_FindPairsOFCourses {
    public static void main(String[] args) {
        //We have courses with same number of characters
        //What we want to do is identify pairs of these courses which have same number of character present in them
        //e.g. create Tuples
        //[API, AWS], [API, PCF], [AWS, PCF], [Docker, Spring], [PCF, API],....
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        List<String> courses2 = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");


        List<List<String>> collect = courses.stream()
                .flatMap(course -> courses2.stream().filter(course2 -> course2.length() == course.length()).map(course2 -> List.of(course, course2)))
                .filter(list -> !list.get(0).equals(list.get(1)))
                .collect(Collectors.toList());
        System.out.println(collect);  //output
        //[[Spring, Docker], [API, AWS], [API, PCF], [AWS, API], [AWS, PCF], [PCF, API], [PCF, AWS], [Docker, Spring]]

    }
}
