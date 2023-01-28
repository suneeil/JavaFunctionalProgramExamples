package primitiveExamples;

import java.util.stream.IntStream;

public class StreamOfPrimitiveNumbers {
    public static void main(String[] args) {
        IntStream.range(1, 10);
        IntStream.range(1, 10).sum();

        IntStream.rangeClosed(1, 10).sum();

        IntStream.iterate(1, e -> e + 2); //Infinite
        IntStream.iterate(1, e -> e + 2).limit(10).sum();
        IntStream.iterate(1, e -> e + 2).limit(10).peek(System.out::println).sum();

        System.out.println("------------");

        //Print 1st 10 even numbers using peek
        IntStream.iterate(2, e -> e + 2).limit(10).peek(System.out::println).sum();

        System.out.println("------------");

        // Want to calculate 1st 10 powers of 2, i.e. 2^1 2^2 2^3 2^4,..2^10
        IntStream.iterate(2, e -> e * 2).limit(10).peek(System.out::println).sum();

        //Convert to list

    }
}
