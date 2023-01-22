package stream;

import java.util.List;
import java.util.Optional;


public class SquareEveryNumAndSumOfAll {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        Integer reduce = numbers.stream()
                .map(num -> num * num)
                .reduce(0, Integer::sum);
        System.out.println(reduce);

        System.out.println("----- without giving 0 in reduce ");

        Optional<Integer> reduce1 = numbers.stream()
                .map(num -> num * num)
                .reduce(Integer::sum);
        System.out.println(reduce1.get());
    }


}

