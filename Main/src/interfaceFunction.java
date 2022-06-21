import java.util.function.Function;

public class interfaceFunction {
    public static void main(String args[])
    {
        // Takes in a number and returns half of it
        Function<Integer, Double> half = a -> a / 2.0;
        System.out.println(half.apply(10));

        // Takes in a number and returns half of it
        Function<Integer, Double> half_2 = b -> b / 2.0;
        // Now treble the output of half function
        half_2 = half_2.andThen(b -> 3 * b);
        System.out.println(half_2.apply(100));

        // Takes in a number and returns half of it
        Function<Integer, Double> half_3 = c -> c / 2.0;
        // However treble the value given to half function
        half_3 = half.compose(c -> 3 * c);
        System.out.println(half_3.apply(50));

        // Takes in a number and returns it
        Function<Integer, Integer> i = Function.identity();
        System.out.println(i.apply(23));

        // Takes in a number and returns half of it
        Function<Integer, Double> half_4 = d -> d / 2.0;

        // Try block to check for exce3ptions
        try {

            // Trying to pass null as parameter
            half_4 = half_4.andThen(null);
        }

        // Catch block to handle exceptions
        catch (Exception e) {
            System.out.println("Exception thrown " + "while passing null: " + e);
        }
    }
}
//Romen Adama Caetano Ramirez