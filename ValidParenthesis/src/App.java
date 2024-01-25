import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        // Given a String 's' '(', ')', '{', '}', '[' and ']'.
        // Determine if the string is valid if:
        // Open brackets must be closed by the same type of brackes.
        // Open brackets must be closed in the correct order.
        // Every close bracket has a corresponding open bracket of the same type.

        // Example 1:
        // Input: s = "()"
        // Output: true

        // Example 2:
        // Input: s = "()[]{}"
        // Output: true

        // Example 3:
        // Input: s = "(]"
        // Output: false

        String s = "()[]{)";
        String[] sInArray = s.split("");
        boolean isValid = true;

        // This solution failling when you have other pattern like "{()}".
        for (int i = 0; i < sInArray.length; i += 2) {

            if (sInArray[i].equals("(")) {
                if (!sInArray[i + 1].equals(")")) {
                    isValid = false;
                }
            }
            if (sInArray[i].equals("[")) {
                if (!sInArray[i + 1].equals("]")) {
                    isValid = false;
                }
            }
            if (sInArray[i].equals("{")) {
                if (!sInArray[i + 1].equals("}")) {
                    isValid = false;
                }
            }
        }
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {

            if (x == '(')
                stack.push(')');
            else if (x == '{')
                stack.push('}');
            else if (x == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != x)
                System.out.println(false);

        }
        System.out.println(String.valueOf(stack.isEmpty()));
    }
}