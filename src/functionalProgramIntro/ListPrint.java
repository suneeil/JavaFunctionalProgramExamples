package functionalProgramIntro;

import java.util.List;


public class ListPrint {
    public static void main(String[] args) {
        printAllNumbersInAListApproach1(List.of(12, 13, 14, 15, 16, 17));
        System.out.println("------");
        printAllNumbersInAListApproach2(List.of(12, 13, 14, 15, 16, 17));
        System.out.println("-------");
        printAllNumbersInAListApproach3(List.of(12, 13, 14, 15, 16, 17));
    }

    private static void print(int number) {
        System.out.println(number);
    }

    /**
     * Print numbers using functional approach
     * @param numbers
     */
    private static void printAllNumbersInAListApproach1(List<Integer> numbers) {
        numbers.stream().forEach(ListPrint::print);
    }

    private static void printAllNumbersInAListApproach2(List<Integer> numbers) {
        numbers.stream().forEach(n -> print(n));
    }

    private static void printAllNumbersInAListApproach3(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }
}

