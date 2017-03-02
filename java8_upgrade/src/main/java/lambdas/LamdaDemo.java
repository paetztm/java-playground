package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by paetztm on 3/1/2017.
 */
public class LamdaDemo {

    public static void main(String... args)
    {
        List<String> strings = Arrays.asList("a", "b", "c", "d");

        // java 7 syntax
        strings.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // full form java 8 - block lambda
        strings.forEach((String s) -> {
            System.out.println(s);
        });

        // one liner - expression lambda
        strings.forEach(s -> System.out.println(s));

        // method reference
        strings.forEach(System.out::println);

        Consumer<Integer> printer = System.out::println;
        Predicate<Integer> mod3 = n -> n%3 == 0;
        Stream.of(1, 3, 4, 5, 9, 11, 15).filter(mod3).forEach(printer);

        Function<Integer, Integer> doubler = n -> n*3;
        Stream.of(1, 3, 4, 5, 9, 11, 15).filter(mod3).map(doubler).forEach(printer);

        List<Integer> vals = new ArrayList<>(1000000);
        for (int i = 0; i < 1000000; i++) {
            vals.add(i);
        }

    }
}
