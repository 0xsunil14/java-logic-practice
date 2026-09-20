import java.util.*;

public class CountDigits{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Number : ");
      int no=sc.nextInt();
      int count=0;
      if(no == 0) {
    count = 1;
   }
      while(no>0){
        no=no/10;
        count++;
      }
      
      System.out.println("Number of digits: " + count);
    }
}