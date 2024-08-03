import java.util.Scanner;
class NumberSquareArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        int n = end - start + 1;
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            array[i][0] = start + i;
            array[i][1] = (start + i) * (start + i);
        }
        System.out.println("Number  Square");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i][0] + "       " + array[i][1]);
        }
    }
}
