import java.util.*;

public class GCD {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      System.out.print("Enter 1st numbers : ");
      int a=sc.nextInt();
      System.out.print("Enter 2nd numbers : ");
      int b=sc.nextInt();
      int gcd=0;
      int limit =Math.min(a,b);
      for(int i=1;i<=limit;i++){
        if(a%i==0&&b%i==0){
          gcd=i;
        }
      }
      System.out.println("Greatest Common Divisor is : "+gcd);
    }
}