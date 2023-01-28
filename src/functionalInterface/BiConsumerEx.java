package functionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerEx {
    /**
     * BiConsumer --> Takes in two inputs and does not return anything
     */
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (str, num) -> {
            System.out.println(num + " " + str);
        };

        biConsumer.accept("Sunil", 07);
    }
}
