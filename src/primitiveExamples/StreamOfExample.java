package primitiveExamples;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * If we use Stream.of we have to Autobox the int to Integer
 *  Autoboxing refers to the conversion of a primitive value into an object of the corresponding
 *  wrapper class is called autoboxing. For example, converting int to Integer class
 */
public class StreamOfExample {
    public static void main(String[] args) {
        System.out.println(Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15)
                .max(Comparator.comparing(Integer::intValue)));
        Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).mapToInt(Integer::intValue).min();
        //=================================================
        System.out.println(Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15)
                .min(Comparator.comparing(Integer::intValue)));
        Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).mapToInt(Integer::intValue).min();
        //=================================================
        System.out.println(Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).mapToInt(Integer::intValue).average());
        //=================================================
        System.out.println(Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).mapToInt(Integer::intValue).sum());

    }
}
