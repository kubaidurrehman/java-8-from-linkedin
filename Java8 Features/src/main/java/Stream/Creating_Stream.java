package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*ways of creating Stream Objects*/

public class Creating_Stream {

    public static void main(String[] args) {
        String nameList [] = {"Ubaid", "Hafizur","Adnan","Aftab","Aksher","Shoeb"};
        List<String>list = new ArrayList<>(Arrays.asList(nameList));

        //create Stream based on array
        java.util.stream.Stream<String> arrayStream = Arrays.stream(nameList);
        System.out.println(arrayStream);

        //Create Stream based on collection
        java.util.stream.Stream<String> collectionStream = list.stream();
        System.out.println(collectionStream);

        //create Stream by using genrate method

        //Creates a stream: This stream will keep generating the number 5.
        //
        //Infinite Generation: Since it’s using generate,
        // it will produce 5 infinitely until you decide to limit or collect the elements.
        java.util.stream.Stream<Integer> generateMethod = java.util.stream.Stream.generate(() -> 5);
        System.out.println(generateMethod);

        generateMethod.limit(4).forEach(System.out::println);

        //Creating Stream using Iterator method
        java.util.stream.Stream<Integer> iterate = java.util.stream.Stream.iterate(1, x -> x + 2);

    }

}
