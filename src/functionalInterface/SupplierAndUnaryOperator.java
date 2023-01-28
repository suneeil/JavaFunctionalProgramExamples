package functionalInterface;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SupplierAndUnaryOperator {
    //Supplier >> Takes in no input but return somethingBack
    //e.g. of a supplier is a FactoryPattern where you want to create a new object of Something
    //say I want a supplier that gives a random number
//================================================================================
    //UnaryOperator --> One parameter as Input and return the result of the same type
    //BinaryOperator --> A Binary operator operates on two parameters of same type and returns the value of same type
    public static void main(String[] args) {
        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();

            return random.nextInt(1000);
        };
        System.out.println(randomIntegerSupplier.get());

        //================================================================================

        UnaryOperator<Integer> unaryOperator = (x) -> 3 * x;
        System.out.println(unaryOperator.apply(10));
    }
}
