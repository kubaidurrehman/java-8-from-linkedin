package Stream;

/*
Stream common terminal Operations
forEach
min
count
max
allMatch
anyMatch
collect
nonMatch
*/

/*
* Streams are typically used in combination with a pipeline of operations:
* 1 source
* 2 Intermediate : map,filter,sorted,distinct
* 3 Terminal : collect, forEach, reduce, count, min, max
* */

import java.util.*;
import java.util.stream.Collectors;

public class Stream_Terminal_Operations {

    public static void main(String[] args) {
        int num[] = {5,6,4,2,3,1,7,9};
        String nameList[] = {"Ubaid", "Hafizur", "Adnan", "Aftab", "Aksher", "Shoeb"};
        List<String> list = new ArrayList<>(Arrays.asList(nameList));

        //using forEach
        Arrays.stream(nameList).forEach(System.out::println);
        list.stream().forEach(System.out::println);

        //min
        Optional<String> min = Arrays.stream(nameList)
                .min((a, b) -> a.compareTo(b));
        System.out.println("minimum value is : " + min.get());



        //max
        OptionalInt max = Arrays.stream(num).max();
        System.out.println("max value is : "+max.getAsInt());

        Optional<String> max1 = Arrays.stream(nameList).max((a, b) -> a.compareTo(b));
        System.out.println("Max value is : " +max1.get());

        //count
        long count = Arrays.stream(num).count();
        System.out.println("Count : "+count);

        long count1 = Arrays.stream(nameList).count();
        System.out.println("Count : "+count1);

        //allMatch

        boolean b = Arrays.stream(nameList).allMatch((name) -> !name.isEmpty());
        System.out.println("All match : "+b);

        //anyMatch
        boolean b1 = Arrays.stream(nameList).anyMatch((name) -> name.equals("Ubaid"));
        System.out.println("Any match : "+b1);

        //nonMatch
        boolean b2 = Arrays.stream(nameList).noneMatch((name) -> name.equals("Ubaid"));
        System.out.println("Any match : "+b2);

        boolean b3 = Arrays.stream(nameList).noneMatch((name) -> name.isEmpty());
        System.out.println("All match : "+b3);

        //collect

        List<Integer> greaterThanFive = Arrays.stream(num).filter((a) -> a > 5).boxed().collect(Collectors.toList());
       // Set<Integer> greaterThanFive = Arrays.stream(num).filter((a) -> a > 2).boxed().collect(Collectors.toSet());
        //boxed convert the IntStream to Stream<Integer>

        System.out.println("Number greater than 5 : "+greaterThanFive );

        List<String> collect = Arrays.stream(nameList).filter(name -> name.length() > 4).collect(Collectors.toList());
        System.out.println("name length greater than 4 "+ collect);

        //reduce
        OptionalInt reduce = Arrays.stream(num).reduce((a, c) -> a + c);
        System.out.println("reduce sum of numbers : "+ reduce.getAsInt());

    }
}
