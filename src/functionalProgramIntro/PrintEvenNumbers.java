package functionalProgramIntro;

import java.util.List;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 13, 14, 15, 16, 17);
        printAllEvenNumbersInAList_Old_Approach(numbers);
        System.out.println("------");
        printAllEvenNumbersInAList_New_Approach1(numbers);
    }

    /**
     * Old Approach
     * @param nummbers
     */
    private static void printAllEvenNumbersInAList_Old_Approach(List<Integer> nummbers) {
        for(int number : nummbers) {
            if(number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    private static boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    /**
     * New approach
     * @param numbers
     */
    private static void printAllEvenNumbersInAList_New_Approach1(List<Integer> numbers) {
        numbers.stream().filter(PrintEvenNumbers::isEven).forEach(System.out::println);
    }

    /**
     * Lambda Approach : number -> number % 2 == 0
     * @param numbers
     */
    private static void printAllEvenNumbersInAList_lambda_Approach(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }


}
