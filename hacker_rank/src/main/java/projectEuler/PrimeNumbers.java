package projectEuler;

// created by: bandypiy
// Date: 10/4/2018

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            printLargestPrime(n);
        }
        in.close();
    }

    private static void printLargestPrime(long n){
        long primeNumbers = 0;
        for (long i = n; i >= 1; i--){
            int counter=0;
            for(long num = i; num >= 1; num--){
                if(i%num ==0)
                    counter = counter + 1;
                if(counter>2)
                    break;
            }
            if (counter ==2) {
                //Appended the Prime number to the String
                primeNumbers = i;
                break;
            }
        }
        System.out.println(primeNumbers);
    }
}
