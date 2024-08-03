import java.util.Scanner;
class ReverseAndAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        int reverse, temp, sum;
        int remainder;
        while (true) {
            temp = number;
            reverse = 0;
            while (temp != 0) {
                remainder = temp % 10;
                reverse = reverse * 10 + remainder;
                temp = temp / 10;
            }
            if (number == reverse) {
                break;
            }
            sum = number + reverse;
            System.out.println(number + " + " + reverse + " = " + sum);
            number = sum;
        }
        System.out.println("Palindrome: " + number);
    }
}
