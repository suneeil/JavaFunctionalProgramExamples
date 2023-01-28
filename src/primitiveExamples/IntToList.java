package primitiveExamples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntToList {
    public static void main(String[] args) {
        List<Integer> integerList = IntStream.iterate(2, e -> e * 2).limit(10).boxed().collect(Collectors.toList());
        System.out.println(integerList);
    }
}
