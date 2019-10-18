package Prog8Prob5;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo2 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
        //lambda expression
       fruits.forEach((name) -> System.out.println(name));

        //  method reference
        fruits.forEach(System.out::println);
    }
}