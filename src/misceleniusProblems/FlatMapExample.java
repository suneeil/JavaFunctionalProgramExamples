package misceleniusProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        //============================================================================================
        //Pick the list of Strings and look all the characters which are present in each one of strings
        //Say I have "Spring" --> {"S", "p", "r", "i", "n", "g"}
        List<String[]> collect1 = Stream.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes")
                .map(course -> course.split(""))
                .collect(Collectors.toList());

        System.out.println(collect1);   //But this gives output as
        //[[Ljava.lang.String;@6debcae2, [Ljava.lang.String;@5ba23b66, [Ljava.lang.String;@2ff4f00f, [Ljava.lang.String;@c818063,
        // [Ljava.lang.String;@3f0ee7cb, [Ljava.lang.String;@75bd9247, [Ljava.lang.String;@7d417077, [Ljava.lang.String;@7dc36524,
        // [Ljava.lang.String;@35bbe5e8]

        Stream<String[]> stream = Stream.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes")
                .map(course -> course.split(""));
        System.out.println(stream);   //But this gives output as
        //java.util.stream.ReferencePipeline$3@5a39699c


        //====== ======= Using FlatMap ====== ======
        List<String> collect = Stream.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes")
                .map(course -> course.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(collect); //Output
        //[S, p, r, i, n, g, S, p, r, i, n, g,  , B, o, o, t, A, P, I, M, i, c, r, o, s, e, r, v, i, c, e, s, A, W, S, P, C, F, A, z, u, r, e, D, o, c, k, e, r, K, u, b, e, r, n, e, t, e, s]
        System.out.println("===================");
        //Print distinct characters
        List<String> collect2 = Stream.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes")
                .map(course -> course.split(""))
                .flatMap(Arrays::stream)
                .distinct().collect(Collectors.toList());
        System.out.println(collect2);


    }
}
