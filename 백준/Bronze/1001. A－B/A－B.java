import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a > 0 && a < 10 && b > 0 && b < 10) {
            System.out.print(a - b);
        }
    }
}