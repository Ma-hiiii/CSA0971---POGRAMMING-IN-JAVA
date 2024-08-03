import java.util.Scanner;

class compo {
    public static void main(String[] args) {
        int a, b;
        System.out.print("Enter the range (two numbers): ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("The composite numbers in the range are: ");
        
        int cf = 0;
        
        for (int i = a; i <= b; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {    
                if (i % j == 0) {
                    count++;
                }
            }
            if (count > 2) {
                System.out.print(i + " ");
                cf = 1;
            }
        }
        
        if (cf==0) {
            System.out.println("\nNo composite numbers exist in the range");
        }
    }
}