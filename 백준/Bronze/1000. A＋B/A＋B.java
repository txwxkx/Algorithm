import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (0 < a && a < 10 && 0 < b && b < 10) {
            System.out.print(a + b);
        }
    }
}