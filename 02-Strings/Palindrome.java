import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String pal = sc.next();

        StringBuilder rev = new StringBuilder();

        for (int i = pal.length() - 1; i >= 0; i--) {
            rev.append(pal.charAt(i));
        }

        if (pal.equals(rev.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}