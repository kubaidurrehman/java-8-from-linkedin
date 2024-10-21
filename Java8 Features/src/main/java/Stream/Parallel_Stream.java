package Stream;

//can be use with either parallel() or paralelStream()

/*steps
splitup
merged
memory management*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Parallel_Stream {

    public static void main(String[] args) {

        String nameList2[] = {"Ubaid", "Hafizur", "Adnan", "Aftab", "Aksher", "Shoeb", "Ubaid", "Hafizur", "Adnan", "Aftab", "Aksher", "Shoeb"};

        Long startTime = System.currentTimeMillis();
        System.out.println("using parallel stream");
        Arrays.stream(nameList2)
                .parallel()
                .sorted(Comparator.reverseOrder())
                .map(name-> name.toUpperCase())
                .forEach(System.out::println);

        Long endTime = System.currentTimeMillis();
        System.out.println("Time taken : "+ (endTime-startTime));

        Long startTime1 = System.currentTimeMillis();
        System.out.println("using without parallel stream");
        Arrays.stream(nameList2)
                .sorted(Comparator.reverseOrder())
                .map(name-> name.toUpperCase())
                .forEach(System.out::println);

        Long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken : "+ (endTime1 - startTime1));

        //which one is faster depends on the task and situations

        System.out.println("Sequential stream");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Sequential stream converted to parallel stream
        numbers.stream()  // Sequential stream
                .parallel()  // Convert to parallel stream
                .filter(num -> num % 2 == 0)  // Filter even numbers
                .forEach(System.out::println);  // Print each even number

        System.out.println("non-Sequential stream");


// parallel stream
        numbers.parallelStream()  // non-Sequential stream
                .filter(num -> num % 2 == 0)  // Filter even numbers
                .forEach(System.out::println);  // Print each even number


        numbers.parallelStream()  // non-Sequential stream
                .filter(num -> num % 2 == 0)  // Filter even numbers
                .forEachOrdered(System.out::println);   // Maintains the original order

    }
}
