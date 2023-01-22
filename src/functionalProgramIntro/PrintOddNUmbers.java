package functionalProgramIntro;

import java.util.List;

public class PrintOddNUmbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 13, 14, 15, 16, 17);

        printAllOddNumbers(numbers);
    }


    private static void printAllOddNumbers(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
    }


}
