import java.util.*;

public class LCM {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter two numbers to find LCM : ");
      int a=sc.nextInt();
      System.out.println("Enter second number : ");
      int b=sc.nextInt();
      int candidate =Math.max(a,b);

      while(candidate %a!=0||candidate %b!=0){
          candidate ++;
      }
      System.out.println("LCM is : " + candidate);
    }
}