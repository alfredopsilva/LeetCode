
public class App {
    public static void main(String[] args) throws Exception {
        // Set of Integers 's'
        // Contains number from 1 to N
        // One number is duplicated
        // Find the number that occurs twice and the number that is missing and return
        // than in the form of an Array.
        int[] nums = { 2, 2 };
        // int[] nums = { 1, 2, 2, 4 };
        // int[] nums = { 1, 2, 2, 4 };

        int dup = 0;
        int missing = 0;

        for (int i = 1; i <= nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i)
                    count++;
            }

            if (count == 2)
                dup = i;
            else if (count == 0)
                missing = i;
        }

        // int dup = -1, missing = -1;

        // for (int i = 1; i <= nums.length; i++) {
        // int count = 0;
        // for (int j = 0; j < nums.length; j++) {
        // if (nums[j] == i) {
        // count++;
        // }
        // }
        // if (count == 2) {
        // dup = i;
        // } else if (count == 0) {
        // missing = i;
        // }
        // }

        System.out.println("Dup" + dup);
        System.out.println("Missing" + missing);
    }
}
