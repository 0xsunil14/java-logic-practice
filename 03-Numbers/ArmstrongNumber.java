import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter a number to check Armstrong Number or not");
      int no =sc.nextInt();
      int copy=no;
      int arm=0;
      while(no>0){
        int rem=no%10;
        arm=arm+rem*rem*rem;
        no=no/10;
      }
      if(copy==arm){
        System.out.println("Armstrong Number");
      } else{
        System.out.println("Not Armstrong Number");
      }
      
    }
}