package stream;

import java.util.List;


public class MinOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 4, 2, 6, 13, 14, 15, 16, 17, -17);
        Integer min = numbers.stream()
                .reduce(Integer.MAX_VALUE, Integer::min);

        System.out.println(min);
    }

}

