import java.util.Scanner;
class StringOperations { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String inputString = scanner.nextLine();
        System.out.println("Choose an operation:");
        System.out.println("1. Replace a word");
        System.out.println("2. Find the length");
        System.out.println("3. Uppercase Conversion");
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        switch (choice) {
            case 1:
                System.out.println("Enter the word to replace:");
                String oldWord = scanner.nextLine();
                System.out.println("Enter the new word:");
                String newWord = scanner.nextLine();
                String replacedString = inputString.replace(oldWord, newWord);
                System.out.println("String after replacement: " + replacedString);
                break;
            case 2:
                int length = inputString.length();
                System.out.println("Length of the string: " + length);
                break;
            case 3:
                String upperCaseString = inputString.toUpperCase();
                System.out.println("String in uppercase: " + upperCaseString);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
