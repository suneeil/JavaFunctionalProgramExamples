package stream;

import java.util.List;


public class distinctExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }


}

