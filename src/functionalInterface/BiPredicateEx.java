package functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateEx {

    /**
     * BiPredicate --> will take two inputs and the returns a boolean
     */
    public static void main(String[] args) {
        BiPredicate<Integer, String> biPredicate = (number, string) -> true;
        BiPredicate<Integer, String> biPredicate_2 = (number, string) -> {
            return number > 10 && string.length() > 5;
        };
        System.out.println(biPredicate.test(10,"A"));
        System.out.println(biPredicate.negate().test(10,"A"));
        System.out.println("=====================");
        System.out.println(biPredicate_2.test(11, "Sai Ram"));
    }
}
