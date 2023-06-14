import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {



    }

    public static int romanToInt(String s) {
        // Transform Roman Numbers into Integer
        // I = 1;
        // V = 5;
        // X = 10;
        // L = 50;
        // C = 100;
        // D = 500;
        // M = 1000;

        HashMap<Character, Integer> letters = new HashMap<>();
        letters.put('I', 1);
        letters.put('V', 5);
        letters.put('X', 10);
        letters.put('L', 50);
        letters.put('C', 100);
        letters.put('D', 500);
        letters.put('M', 1000);

        int number = 0;

        String[] characters = s.split("");

       for(String character : characters)
       {
           if(letters.containsKey(character))
               number += letters.get(character);
       }

        return
    }
}