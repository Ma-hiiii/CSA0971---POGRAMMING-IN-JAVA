import java.util.Scanner;
class prime{
  public static void main(String[] args){
    int a,b=0,c,n,s=0;
    System.out.print("Enter the number: ");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    c=n;
    for(int i=1;i<=n;i++){
     if(n%i==0){
       s++;       
     }
    }
    if(s==2){
      System.out.println("\n"+n+" is a prime number");
    }else{
      System.out.println("\n"+n+" is a Composite number");
    }

  }
}