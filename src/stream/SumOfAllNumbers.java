package stream;

import java.util.List;


public class SumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 4, 2, 6, 13, 14, 15, 16, 17);
        System.out.println(addListFunctional(numbers));

        System.out.println("---------Approach 2---------");
        Integer sum1 = numbers.stream()
                .reduce(0, (num1, num2) -> num1 + num2);
        System.out.println(sum1);

        System.out.println("---------Approach 2---------");
        Integer sum2 = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum2);
    }

    /**
     * reduce(initialValue, operation)
     * @param numbers
     * @return
     */
    private static int addListFunctional(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, SumOfAllNumbers::sum);
    }

    private static Integer sum(Integer num1, Integer num2) {
        return num1 + num2;
    }
}

