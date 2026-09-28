import java.util.*;

public class CountEvenOddDigits {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number : ");
      int no=sc.nextInt();
      int even =0;
      int odd=0;
      while(no>0){
        int rem =no%10;
        if(rem%2==0){
          even++;
        } else {
          odd++;
        }
        no=no/10;
      }
      System.out.println("Even digits : "+even);
      System.out.println("Odd digits : "+odd);
    }
}