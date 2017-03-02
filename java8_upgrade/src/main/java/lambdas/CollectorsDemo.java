package lambdas;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by paetztm on 3/1/2017.
 */
public class CollectorsDemo {

    public static void main(String[] args)
    {
        List<Integer> nums = Stream.of("this", "is", "a", "collection", "of", "strings")
        .map(String::length)
        .filter(n->n%2==0)
                .peek(System.out::println)
        .collect(Collectors.toList());
        System.out.println(nums);



    }


}
