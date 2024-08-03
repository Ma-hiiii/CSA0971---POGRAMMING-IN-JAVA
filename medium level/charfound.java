import java.util.Scanner;
class CharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a character to search: ");
        char ch = scanner.next().charAt(0);
        int found = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                found = i;
                break;
            }
        }
        if (found != -1) {
            System.out.println("Character '" + ch + "' found at index " + found);
        } else {
            System.out.println("Character '" + ch + "' not found in the string");
        }
        scanner.close();
    }
}