package functionalInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class InterfaceExample1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        //Predicate --> will have one inputs and the output will be boolean
        Predicate<Integer> isEven = x -> x % 2 == 0;

        //Function --> will have two inputs of same type and returns output of the same type
        Function<Integer, Integer> sqrNum = x -> x * x;

        //Consumer --> Will take one input but does not return any output
        Consumer<Integer> sout = System.out::println;

        numbers.stream()
                .filter(isEven)
                .map(sqrNum)
                .forEach(sout);
    }
}
