package basic_programming.input_output;

import java.util.Scanner;

public class DoctorSecret {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lenOfBook = s.nextInt();
        int pageInBook = s.nextInt();
        System.out.println((lenOfBook > 0 && lenOfBook <= 23) && (pageInBook >= 500 && pageInBook <= 1000) ? "Take Medicine" : "Don't take Medicine");
    }
}
