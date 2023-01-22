package functionalProgramIntro;

import java.util.List;

public class SquaresOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 3, 14, 2, 16, 17);

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }

}
