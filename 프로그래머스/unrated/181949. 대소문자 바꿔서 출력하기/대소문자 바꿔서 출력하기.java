import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        if (a.length() >= 1 && a.length() <= 20) {
            char[] arr = a.toCharArray();
            for (char ab : arr) {
                if (Character.isUpperCase(ab)) {
                    ab = Character.toLowerCase(ab);
                } else if(Character.isLowerCase(ab)) {
                    ab = Character.toUpperCase(ab);
                }
            System.out.print(ab);
            }
        }
    }
}//end class