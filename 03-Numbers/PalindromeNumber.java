import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number to check if it is a palindrome:");
      int no=sc.nextInt();
      int copy=no;
      int pal=0;
      while(no>0){
        int rem=no%10;
        pal=pal*10+rem;
        no=no/10;
      }
      if(copy==pal){
          System.out.println("Palindrome");
      } else {
        System.out.println("Not a Palindrome");
      }
    }
}