import java.util.Scanner;
class Palindrome {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a palindrome.");
        String input = sc.nextLine();
        if(checkP(input))
        {
            System.out.println(input + " is a palindrome string");
        }
        else {
            System.out.println(input + " is not a palindrome string");
        }
    }

    public static boolean checkP(String str) {
        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}