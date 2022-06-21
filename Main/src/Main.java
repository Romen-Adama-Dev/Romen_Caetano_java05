import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        System.out.println("This is the original array list");
        for (Integer i : numbers){
            System.out.println(i);
        }
        System.out.println("This is the incremented Arraylist");
        List<Integer>list = numbers;
        list.stream().forEach(elem -> System.out.println(elem + 1));
    }

}
//Romen Adama Caetano Ramirez
