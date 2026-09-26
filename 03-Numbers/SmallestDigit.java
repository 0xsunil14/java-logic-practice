import java.util.*;

public class SmallestDigit {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number to find smallest digit in it: ");
      int no = sc.nextInt();
      int smallest=10;
      while (no>0){
        int rem=no%10;

        if(smallest>rem){
          smallest=rem;
        }
        no=no/10;
      }
      System.out.println("Smallest Number is "+smallest);
    }
}