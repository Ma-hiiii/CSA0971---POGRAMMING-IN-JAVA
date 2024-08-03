import java.util.Scanner;
class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        System.out.print("Enter Case (1 for string, 2 for number): ");
        int caseChoice = scanner.nextInt();
        scanner.nextLine(); 
        if (caseChoice == 1) {
            System.out.print("Enter the string: ");
            String str = scanner.nextLine();
            int length = str.length();
            boolean isPalindrome = true; 
            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length - i - 1)) {
                    isPalindrome = false; 
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a palindrome");
            }
        } else if (caseChoice == 2) {
            System.out.print("Enter the number: ");
            int num = scanner.nextInt();
            int originalNum = num;
            int reversedNum = 0;
            while (num != 0) {
                int remainder = num % 10;
                reversedNum = reversedNum * 10 + remainder;
                num /= 10;
            }
            if (originalNum == reversedNum) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a palindrome");
            }
        } else {
            System.out.println("Invalid case choice");
        }
    }
}
