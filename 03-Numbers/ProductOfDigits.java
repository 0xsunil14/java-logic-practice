import java.util.*;

public class ProductOfDigits {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number : ");
      int no=sc.nextInt();
      int product=1;
      while(no>0){
        int rem=no%10;
        product=product*rem;
        no=no/10;
      }
      System.out.println("Product of Digits : "+product);
    }
}