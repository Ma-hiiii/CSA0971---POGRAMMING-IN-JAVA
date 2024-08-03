import java.util.Scanner;

class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fah,cel,fa,ce;
        System.out.print("Enter temperature in fahrenheit: ");
        fah = sc.nextDouble();
        cel=(fah-32)*(5/9);
        System.out.println("Temp in celcius " + cel);
        System.out.print("Enter temperature in celcius: ");
        ce = sc.nextDouble();
        fa=(ce*(9/5))+32;
        System.out.println("Temp in fahrenheit " + fa);
    }
}
