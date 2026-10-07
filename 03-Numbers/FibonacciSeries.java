import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int no = sc.nextInt();

        if (no <= 0) {
            System.out.println("Enter a positive number");
            return;
        }

        int a = 0;
        int b = 1;

        if (no >= 1) {
            System.out.print(a + " ");
        }

        if (no >= 2) {
            System.out.print(b + " ");
        }

        for (int i = 2; i < no; i++) {
            int next = a + b;

            a = b;
            b = next;

            System.out.print(next + " ");
        }
    }
}