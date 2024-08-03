import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c, n;
        System.out.print("Enter the number of terms: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive number");
        } else if (n == 1) {
            System.out.print("0");
        } else {
            System.out.print("0 1");
            for (int i = 2; i < n; i++) {
                c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;
            }
        }
    }
}
