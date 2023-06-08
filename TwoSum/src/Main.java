import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // An array of integers nums.
        // Integer Target
        // Return indices of the two numbers such that they add up to target.
        // OBS => Each input have exactly one solution
        // OBS => You may not use the same element twice.

        int[] test = {2,7,11,15};
        int[] secondTest = {3,2,4};
        int[] thirdTest = {3,3};
        int[] leetCode = {2,4,11,3};
        int[] leetCode1 = {2,5,5,11};

        System.out.println(Arrays.toString(twoSum(test,9)));
        System.out.println(Arrays.toString(twoSum(secondTest,6)));
        System.out.println(Arrays.toString(twoSum(thirdTest,6)));
        System.out.println(Arrays.toString(twoSum(leetCode,6)));
        System.out.println(Arrays.toString(twoSum(leetCode1,10)));
    }

    public static int[] twoSum(int[] nums, int target)
    {
        int length = nums.length;
        int[] result = {0,0};
        boolean found = false;

        for(var i = 0; i < length; i++)
        {
            for(var j = 1; j < length; j++)
            {
                if(nums[j] + nums[i] == target && j != i)
                {
                    result[0] = i;
                    result[1] = j;
                    found = true;
                    break;
                }
            }

            if(found)
            {
                break;
            }
        }
        return result;
    }
}