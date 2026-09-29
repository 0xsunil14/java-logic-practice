import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number : ");
      int no=sc.nextInt();
      System.out.print("Enter the Target digit to find its frequency : ");
      int digit=sc.nextInt();
      int count=0;

      while(no>0){
        int rem=no%10;
        if(digit==rem){
          count++;
        }
        no=no/10;
      }

      System.out.println("Digit : "+digit);
      System.out.println("Count : "+count);
    }
}