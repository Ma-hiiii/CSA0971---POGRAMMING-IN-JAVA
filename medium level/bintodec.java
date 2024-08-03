import java.util.Scanner;
class Bin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binary;
        int decimal = 0, octal = 0, power = 0;
        System.out.print("Enter a binary number: ");
        binary = scanner.next();
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }
        int tempDecimal = decimal;
        power = 1;
        while (tempDecimal > 0) {
            octal = octal + (tempDecimal % 8) * power;
            tempDecimal = tempDecimal / 8;
            power = power * 10;
        }
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
    }
}
