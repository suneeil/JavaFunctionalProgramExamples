package methodReferences;

import java.util.function.Supplier;

public class ConstructorReference {
    public static void main(String[] args) {
        //without Constructor reference
        Supplier<Test> supplier = () -> new Test();
        supplier.get();
        System.out.println("========== Constructor reference =========");
        //Constructor reference
        Supplier<Test> supplier1 = Test::new;
        supplier1.get();
        supplier1.get().testMethod();
    }
}

class Test {
    public Test() {
        System.out.println(">>>>>>>>>>> In Test class constructor");
    }

    public void testMethod() {
        System.out.println(">>>>>>>>>>>>>> Executing testMethod ");
    }
}