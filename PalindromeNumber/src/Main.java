// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(1221));
        System.out.println("aflredo");
    }

    public static boolean isPalindrome(int x)
    {
        int reversed = 0;
        int source = x;

        while(x > 0)
        {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        if(reversed == source)
            return true;

    return false;
    }
}