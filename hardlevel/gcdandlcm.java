import java.util.Scanner;
class D192225054 {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();      
        System.out.println("GCD of " + n1 + " & " + n2 + " is: " + gcd(n1, n2));
        System.out.println("LCM of " + n1 + " & " + n2 + " is: " + lcm(n1, n2));
    }
}
