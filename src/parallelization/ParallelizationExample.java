package parallelization;

import java.util.stream.LongStream;

public class ParallelizationExample {

    public static void main(String[] args) {
       /* long time1 = System.currentTimeMillis();
        System.out.println(LongStream.rangeClosed(0, 1000000000).sum());
        System.out.println(System.currentTimeMillis() - time1);

        System.out.println("===========================");
*/
        long time2 = System.currentTimeMillis();
        System.out.println(LongStream.rangeClosed(0, 1000000000).parallel().sum());
        System.out.println(System.currentTimeMillis() - time2);
    }
}
