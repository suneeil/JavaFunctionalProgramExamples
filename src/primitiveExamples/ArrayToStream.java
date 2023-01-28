package primitiveExamples;

import java.util.Arrays;

/**
 * Primitive Streams
 *
 */
public class ArrayToStream {
    public static void main(String[] args) {
        int[] numArray = {12, 9, 13, 4, 6, 2, 4, 12, 15};
        System.out.println("Average: " + Arrays.stream(numArray).average());
        System.out.println("Max: " + Arrays.stream(numArray).max());
        System.out.println("Min: " + Arrays.stream(numArray).min());
        System.out.println("Sum " + Arrays.stream(numArray).reduce(0, Integer::sum));

    }
}
