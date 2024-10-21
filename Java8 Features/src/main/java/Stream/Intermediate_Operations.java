package Stream;

/*
filter
map
flatMap
peek
limit
skip
distinct
sorted
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Intermediate_Operations {
    public static void main(String[] args) {
        String nameList[] = {"Ubaid", "Hafizur", "Adnan", "Aftab", "Aksher", "Shoeb"};

        //filter
        Arrays.stream(nameList).filter(name -> name.startsWith("A")).forEach(System.out::println);

        //map
        /*Purpose: map() is used to transform the data in a stream by applying a function.
                Common Use Cases:
        Modifying elements in a collection (e.g., converting to uppercase).
                Extracting fields from objects (e.g., extracting names from a list of people).
                Performing operations on each element of a collection (e.g., squaring numbers).*/

        Arrays.stream(nameList).map((name) -> name.toUpperCase(Locale.ROOT)).forEach(System.out::println);

        //flatMap
/*
        If the function you provide in map() returns a collection or another stream (like List<Stream<T>> or List<List<T>>),
         map() will result in a stream of streams or lists of lists, which can be cumbersome to work with.
         To avoid this "nested structure", flatMap() is used to flatten the result into a single stream.
*/
        List<List<String>> listOfList = Arrays.asList(Arrays.asList("a", "b", "c")
                , Arrays.asList("d", "e", "f")
                , Arrays.asList("g", "h", "i"));

        listOfList.stream().map(List::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        //return the object of list

        listOfList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //peek

        /*In Java 8, the peek() method is a part of the Streams API and is used to observe the elements
        of a stream without modifying them. It is often used for debugging or logging purposes
        to see the values as they flow through the pipeline, but it doesn’t change the stream or its elements.

        Key Characteristics of peek():
        Non-interfering: It does not modify the elements in the stream.
        Intermediate operation: It is an intermediate operation, meaning it doesn’t terminate the stream;
        instead, it allows further operations to be performed.
        Lazy: Like other stream operations, peek() is lazy, meaning it only executes when a terminal operation
        (like collect(), forEach(), reduce(), etc.) is invoked.*/

        Arrays.stream(nameList)
                .filter(name -> name.startsWith("A"))
                .peek(name -> System.out.println("check name " + name))
                .map(name -> name.toUpperCase())
                .peek(name -> System.out.println("After Uppercase " + name))
                .collect(Collectors.toList());

        //skip
        Arrays.stream(nameList).skip(1).forEach(name -> System.out.println("skip " + name));

        //limit
        Arrays.stream(nameList).limit(1).forEach(name -> System.out.println("limit " + name));

        //Distinct

        //return only unique values or remove duplicates
        String nameList2[] = {"Ubaid", "Hafizur", "Adnan", "Aftab", "Aksher", "Shoeb", "Ubaid", "Hafizur", "Adnan", "Aftab", "Aksher", "Shoeb"};
        System.out.println("Distint values");
        Arrays.stream(nameList2).distinct().forEach(System.out::println);

        //sorted

        /*give result in natural sorting ordered*/
        System.out.println("Natural sorting order.");
        Arrays.stream(nameList2).sorted().forEach(System.out::println);

        System.out.println("for reverse order");
        Arrays.stream(nameList2).sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }


}
