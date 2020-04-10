// Date: 10/4/2018

import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }

    private static int reverse(int x) {
        boolean negativeFlag =false;
        int reverseInt = 0;
        int pre_reverseInt = 0;
        if(x<0){
            negativeFlag = true;
            x = -x;
        }
        while(x>0){
            int currNum = x % 10;
            reverseInt = reverseInt * 10 + currNum;

            if ((reverseInt - currNum)/10 != pre_reverseInt)
                return 0;

            pre_reverseInt = reverseInt;
            x = x/10;
        }
        return (negativeFlag)? -reverseInt : reverseInt;
    }
}
