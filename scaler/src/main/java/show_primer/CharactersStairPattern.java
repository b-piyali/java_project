package show_primer;

import java.util.Scanner;

public class CharactersStairPattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            char ch = 64;

            for (int i = 0; i < num; i++) {
                StringBuilder str = new StringBuilder();
                ch++;
                for (int j = 0; j <= i; j++) {
                    str.append(ch);
                    str.append(" ");
                }
                System.out.println(str.toString().trim());
            }
        }
    }
}
