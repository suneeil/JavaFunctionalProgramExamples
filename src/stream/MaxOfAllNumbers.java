package stream;

import java.util.List;


public class MaxOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 4, 2, 6, 13, 14, 15, 16, 17);
        Integer reduce = numbers.stream()
                .reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println(reduce);
    }

}

