package days_coding_challange.day2;

import java.util.Scanner;

public class ExploringDataTypes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            System.out.print("This input is of type Integer.");
        } else if (s.hasNextFloat()) {
            System.out.print("This input is of type Float.");
        } else if (s.hasNextLine()) {
            System.out.print("This input is of type string.");
        } else {
            System.out.print("This is something else");
        }
    }
}
