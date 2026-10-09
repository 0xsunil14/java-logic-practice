import java.util.*;

public class StrongNumber {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter a number to check if it is a Strong Number or not");

      int no=sc.nextInt();
      int copy=no;
      
      int sum=0;
      while(no>0){
        int rem=no%10;
        int fact=1;
        for(int i=1;i<=rem;i++){
          fact=fact*i;
        }
         sum=sum+fact;
         no=no/10;
      }
      if(copy==sum){
        System.out.println(copy+ " is a Strong Number");
      } else{
        System.out.println(copy+ " is Not a Strong Number");
      }
      
    }
}