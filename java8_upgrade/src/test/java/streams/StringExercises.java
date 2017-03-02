package streams;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringExercises {
    private List<String> strings = new ArrayList<>();

    @Before
    public void setUp() {
        strings.add("this");
        strings.add("is");
        strings.add("a");
        strings.add("list");
        strings.add("of");
        strings.add("strings");
    }

    @Test
    public void stringLengthSort_InnerClass() {
        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
    }

    @Test
    public void stringLengthSort_lambda() {
    }

    @Test
    public void stringLengthSort_methodCall() {
    }

    @Test
    public void stringLengthSort_methodRef() {
    }

    @Test
    public void stringLengthSort_comparingInt() {
    }


    private static int compareStrings(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
