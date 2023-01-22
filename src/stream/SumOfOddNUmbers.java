package stream;

import java.util.List;
import java.util.Optional;


public class SumOfOddNUmbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        Integer reduce = numbers.stream()
                .filter(num -> num % 2 == 1)
                .reduce(0, Integer::sum);
        System.out.println(reduce);
    }


}

