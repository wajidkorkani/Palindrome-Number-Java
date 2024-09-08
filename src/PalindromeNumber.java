import java.util.Scanner;
public class PalindromeNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        boolean isPalindromeNumber = isPalindrome(number);
        System.out.println(isPalindromeNumber);
    }

    public static boolean isPalindrome(int x) {
        // Handle negative numbers and numbers ending in 0
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        String integerToString = Integer.toString(x);
        int left = 0;
        int right = integerToString.length() - 1;

        while (left < right) {
            if (integerToString.charAt(left) != integerToString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}