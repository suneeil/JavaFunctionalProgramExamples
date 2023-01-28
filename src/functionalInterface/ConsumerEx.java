package functionalInterface;

import java.util.function.Consumer;

public class ConsumerEx {
    /**
     * Consumer --> Will take one input but does not return any output
     */
    public static void main(String[] args) {
        Consumer<Integer> outPut = System.out::println;
        outPut.accept(10);

    }
}
