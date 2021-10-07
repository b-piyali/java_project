package basic_programming.input_output;

import java.util.Locale;
import java.util.Scanner;

public class Zoos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        int countZ = 0;
        int countO = 0;
        if (word.length() <= 20) {
            for(char ch: word.toLowerCase(Locale.ROOT).toCharArray()){
                switch (ch) {
                    case 'z':
                    //case 'Z':
                        countZ++;
                        break;
                    case 'o':
                    //case 'O':
                        countO++;
                        break;
                }
            }
            System.out.println(countZ * 2 == countO ? "Yes" : "No");
        }
    }
}
