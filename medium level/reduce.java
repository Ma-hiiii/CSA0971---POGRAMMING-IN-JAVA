import java.util.Scanner;
class ReduceToZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int steps = 0;

        System.out.print("Enter an integer: ");
        num = scanner.nextInt();

        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }

        System.out.println("Number of steps to reduce to zero: " + steps);
        
        scanner.close();
    }
}
