import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        if (a.length() >= 1 && a.length() <= 10 && b.length() >= 1 && b.length() <= 10) {
            System.out.print(a);
            System.out.print(b);
        }
    }
}//end class