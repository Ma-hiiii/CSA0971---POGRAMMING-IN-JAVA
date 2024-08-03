import java.util.Scanner;
import java.util.Calendar;
class dateprog {
    public static void main(String[] args) {
        int n; 
        System.out.println("Enter the number of days : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n<0){
        System.out.println("Invalid input");
        }else{        
        int years=n/365;
        int remdays=n%365;
        int week=remdays/7;
        int remadays=remdays%7;
        System.out.println("No. of years: " + years);
        System.out.println("No. of weeks: " + week);
        System.out.println("No. of days: " + remadays); 
        }
        System.out.print("Enter the day: ");
        int day = sc.nextInt();  
        System.out.print("Enter the month: ");
        int month = sc.nextInt(); 
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("The day of the week is: " + days[dayOfWeek - 1]);
    }
}