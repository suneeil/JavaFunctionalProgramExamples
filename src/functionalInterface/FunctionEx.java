package functionalInterface;

import java.util.List;
import java.util.function.Function;

public class FunctionEx {
    /**
     * Function --> will have two inputs of same type and returns output of the same type
     *
     */
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        Function<Integer, Integer> sqrNum = x -> x * x;
    }
}
