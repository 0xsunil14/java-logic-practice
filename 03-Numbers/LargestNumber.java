import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int largest=0;
      System.out.print("Enter the Number : ");
      int no =sc.nextInt();
      no = Math.abs(no);
      while(no>0){
        int digit=no%10;
        if(digit>largest){
          largest=digit;
        }
        no=no/10;

      }
      System.out.println("Here is the Largest Number : "+largest);
    }
}