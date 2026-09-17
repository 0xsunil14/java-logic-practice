import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.next();

        char[] ch = str.toCharArray();
        StringBuilder seen = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }

            int pos = seen.indexOf(String.valueOf(ch[i]));

            if (pos == -1) {
                System.out.println(ch[i] + " -> " + count);
                seen.append(ch[i]);
            }
        }

        sc.close();
    }
}