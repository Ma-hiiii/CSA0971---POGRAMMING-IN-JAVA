import java.util.Scanner;
import java.util.Arrays;
class Mth {
    public static void main(String arg[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " Element:");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the M value:");
        int m = sc.nextInt();
        System.out.println("Enter the N value:");
        int nth = sc.nextInt();
        Arrays.sort(arr); 
        if (m > 0 && m <= n && nth > 0 && nth <= n) {
            int mth = arr[n - m];
            int kth = arr[nth - 1];
            System.out.println("The " + m + "th Maximum element is: " + mth);
            System.out.println("The " + nth + "th Minimum element is: " + kth);
            int sum = mth + kth;
            int difference = mth - kth;
            System.out.println("The sum is: " + sum);
            System.out.println("The difference is: " + difference);
        } else {
            System.out.println("Invalid values of m or n");
        }
    }
}
