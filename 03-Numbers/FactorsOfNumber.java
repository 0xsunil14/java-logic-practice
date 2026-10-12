import java.util.*;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = sc.nextInt();

        int limit = (int) Math.sqrt(no);

        for (int i = 1; i <= limit; i++) {
            if (no % i == 0) {
                System.out.print(i + " ");
            }
        }

        for (int i = limit; i >= 1; i--) {
            if (no % i == 0 && i != no / i) {
                System.out.print((no / i) + " ");
            }
        }

        sc.close();
    }
}