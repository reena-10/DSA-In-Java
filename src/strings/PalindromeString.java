package strings;
import java.util.Scanner;

public class PalindromeString {
     static boolean isPalindrome(String s) {
         int i = 0, j = s.length() - 1;
         while (i <= j) {
             if (s.charAt(i) != s.charAt(j)) return false;
             else {
                 i++;
                 j--;
             }
         }
         return true;
     }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String s = sc.next();
        isPalindrome(s);
    }
}
