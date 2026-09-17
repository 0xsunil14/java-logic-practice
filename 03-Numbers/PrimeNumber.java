import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       System.out.print("Enter a Number : ");
      int no=sc.nextInt();
      boolean flag=false;

      if(no<=1){
        System.out.println("Not a Prime Number");
        return;
      }
      
      for(int i=2;i*i<=no;i++)
      {
        if(no%i==0){
          flag=true;
          break;
        }
       
      }
      if(flag){
        System.out.println("Not a Prime No");
      } else{
        System.out.println("Prime No");
      }
    }
}