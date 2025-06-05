import java.util.*;

public class Main {
//    CODE IMPLEMENT BY MTHOKOZISI NDLOVU
//    I WILL ADD THIS TO READ ME ON GITHUB
//    This project has a function, isPalindrome(String str),
//    that takes a string as input and returns true if the string
//    is a palindrome (reads the same forwards and backward, ignoring
//    case and non-alphanumeric characters), and false otherwise.
//    Constraint: Using at least one stack and at least one queue in your solution.
//    Leverage their properties to efficiently determine if the string is a palindrome.
//    Example: isPalindrome("Racecar") should return true.
//    isPalindrome("A man, a plan, a canal: Panama")should return true.
//    isPalindrome("Hello") should return false.
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Normalize the input: ignore non-alphanumeric and convert to lowercase
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                char normalized = Character.toLowerCase(c);
                stack.push(normalized);
                queue.offer(normalized);
            }
        }

        // Compare characters from stack (LIFO) and queue (FIFO)
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;  // Mismatch found
            }
        }

        return true;  // All characters matched
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("Racecar"));                         // true
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("Hello"));                           // false

    }
}