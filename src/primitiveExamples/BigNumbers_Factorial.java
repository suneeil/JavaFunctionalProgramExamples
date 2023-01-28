package primitiveExamples;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class BigNumbers_Factorial {
    public static void main(String[] args) {
        //First 50 factorial
        System.out.println(IntStream.rangeClosed(1, 5).reduce(1, (x, y) -> x * y));

        //To get the Factorial of 1st 50 the above line will give zero as the result
        //To avoid this we need to use BigIntStream

        System.out.println(LongStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply));
    }
}
