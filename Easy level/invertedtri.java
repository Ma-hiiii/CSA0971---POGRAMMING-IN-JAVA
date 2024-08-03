import java.util.Scanner;
class Tri {
    public static void main(String[] args) {
        int rows, i, j, space;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        rows = sc.nextInt();
        for (i = rows; i >= 1; i--) {
            for (space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
