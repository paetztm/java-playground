package lambdas;

/**
 * Created by paetztm on 3/1/2017.
 */
public class RunnableDemo {

    public static void main(String[] args)
    {
        new Thread(() -> System.out.println("hello world")).start();
    }
}
