package daysofCode.day10;// created by: bandypiy
// Date: 10/8/2018

import java.util.Scanner;

public class BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(consecutive1Binary(n));
        scanner.close();
    }

    private static int consecutive1Binary(int n){
        int count=0;
        int preCount=0;
        int rem;
        int prevRem=1;
        while(n>0){
            rem = n%2;
            n = n/2;
            if(prevRem == rem)
                count++;
            else
                count =0;
            prevRem = rem;
            if(preCount<count)
                preCount = count;
        }

        return preCount;
    }
}
