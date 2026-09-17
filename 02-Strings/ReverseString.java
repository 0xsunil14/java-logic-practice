import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = sc.next();

        StringBuilder str = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            str.append(s.charAt(i));
        }

        System.out.println("Reversed String: " + str);

        sc.close();
    }
}