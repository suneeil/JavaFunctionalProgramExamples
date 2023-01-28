package functionalInterface.primitiveFunctional;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorEx {
    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (x, y) -> x + y;
        System.out.println(intBinaryOperator.applyAsInt(10, 20));
    }
}
