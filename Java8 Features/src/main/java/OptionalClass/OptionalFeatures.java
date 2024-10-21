package OptionalClass;

import java.util.NoSuchElementException;
import java.util.Optional;

/*
 * isPresent
 * of
 * ofNullable
 * orElse
 * orElseGet
 * orElseThrow
 * filter
 * map
 * */
public class OptionalFeatures {
    public static void main(String[] args) {
        //empty   create Optional empty object
        //isPresent    check whether the optional value is null or not
        Optional<String> obj = Optional.empty();
        System.out.println("obj " + obj.isPresent());

        //of    Create object of Optional Class
        Optional<String> obj1 = Optional.of(new String());
        System.out.println("obj1 : " + obj1.isPresent());

        //In Optional.of() we cant pass null value it will through NullPointerException
        String st = null;
         //Optional<String> op = Optional.of(st);
        //System.out.println(op);

        //ofNullable
        //create the object with null value
        Optional<String> op1 = Optional.ofNullable(st);
        System.out.println("op1 : "+op1);

        //orElse
        //Else giving default values
        System.out.println(op1.orElse("No Value"));

        //orElseThrow
        //String s = op1.orElseThrow(()-> new NoSuchElementException("value not found"));
        //System.out.println(s);

        System.out.println(op1.orElseGet(() -> new String("Hi welcome on optional class")));

        //filter
        Optional<String> fil = Optional.ofNullable("Ubaidurrehman");
        fil.stream().filter(a -> a.startsWith("U")).forEach(System.out::println);

        //map
        Optional<Integer> in = Optional.of(10);
        in.stream().map(a -> a * 9).forEach(System.out::println);



    }
}
