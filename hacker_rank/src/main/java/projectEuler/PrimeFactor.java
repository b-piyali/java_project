package projectEuler;
// created by: bandypiy
// Date: 10/4/2018

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            largestPrimeFactor(n);
        }
        in.close();
    }

    private static void largestPrimeFactor(long n) {
        // Print the number of 2s that divide n
        long lFactor = 0;
        while ((n & 1)==0){
            lFactor=2;
            n = n >> 1;
        }

        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i+= 2){
            // While i divides n, print i and divide n
            while (n%i == 0){
                if(lFactor < i)
                    lFactor = i;
                n /= i;
            }
        }

        // This condition is to handle the case whien
        // n is a prime number greater than 2
        if (n > 2)
            lFactor = n;

        System.out.println(lFactor);
    }
}
