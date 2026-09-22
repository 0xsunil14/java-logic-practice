import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number to reverse:");
      int no = sc.nextInt();
      int revno=0;
      while(no>0){
        int rem=no%10;
        revno=revno*10+rem;
        no=no/10;
      }
      System.out.println("Reversed number: " + revno);
    }
}