import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Given an Integer 'n', return a string array 'asnwer' (1 - indexed) where
        // if disible for 3, return "Fizz"
        // if divisible by 5, return "Buzz"
        // if divisible by both, return "FizzBuzz"

        int n = 15;
        ArrayList<String> result = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                result.add("FizzBuzz");
            }
            else if(i % 5 == 0){
                result.add("Buzz");
            }
            else if(i % 3 == 0){
                result.add("Fizz");
            }
            else
            {
                result.add(String.valueOf(i));
            }
        }
        System.out.println(result);
    }
}
