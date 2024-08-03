import java.util.Scanner;
class ConsonantVowelSeparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        System.out.print("Vowels: ");
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (isVowel(ch)) {
                System.out.print(ch + " ");
            }
        }
        System.out.print("\nConsonants: ");
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!isVowel(ch) && Character.isLetter(ch)) {
                System.out.print(ch + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); 
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}