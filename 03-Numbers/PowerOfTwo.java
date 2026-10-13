import java.util.*;

public class PowerOfTwo {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter a number to check if it is power of 2 or not");
      int no =sc.nextInt();
      int copy=no;
      while(no>0){
        if(no%2==0){
          no=no/2;
        } else {
          break;
        }
      }
      if(no==1){
        System.out.println(copy+" is Power of 2");
      } else {
        System.out.println(copy+" is Not Power of 2");
      }
      
    }
}