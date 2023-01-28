package functionalInterface;

import java.util.List;
import java.util.function.Predicate;

public class PredicatEx {
    /**
     * Predicate --> will have one inputs and the output will be boolean
     */
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        Predicate<Integer> isEven = x -> x % 2 == 0;
        numbers.stream().filter(isEven).forEach(System.out::println);
    }
}
