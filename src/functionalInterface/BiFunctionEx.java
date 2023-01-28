package functionalInterface;

import java.util.function.BiFunction;

public class BiFunctionEx {
    /**
     * BiFunction --> Takes in two input and return one output back, but the out put can be of any type
     */

    public static void main(String[] args) {
      //  List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        BiFunction<Integer, String, String> biFunctionEx = (num, str) -> {
            return num + " "  + str;
        };
        System.out.println(biFunctionEx.apply(07, "Sunil"));
    }
}
