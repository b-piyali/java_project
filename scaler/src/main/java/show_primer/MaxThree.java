package show_primer;

import java.util.Scanner;

public class MaxThree {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int firstNum = sc.nextInt();
            int secondNum = sc.nextInt();
            int thirdNum = sc.nextInt();

            int maxNum = Math.max(firstNum, Math.max(secondNum, thirdNum));
            System.out.println(maxNum);
        }
    }
}
