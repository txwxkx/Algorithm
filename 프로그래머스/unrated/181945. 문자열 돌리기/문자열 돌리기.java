import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        if (a.length() >= 1 && a.length() <= 10) {
            char[] arr = a.toCharArray();
            for (char c : arr) {
                System.out.println(c);
            }
        }
    }
}//end class