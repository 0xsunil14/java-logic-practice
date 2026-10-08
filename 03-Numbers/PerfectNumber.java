import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a Number : ");
      int no=sc.nextInt();
      int sum=0;
      for(int i=1;i<no;i++){
        if(no%i==0){
          sum=sum+i;
        }
      }
      if(no==sum){
        System.out.println(no+" is a Perfect Number");
      } else {
        System.out.println(no+" is Not a Perfect Number");
      }
    }
}