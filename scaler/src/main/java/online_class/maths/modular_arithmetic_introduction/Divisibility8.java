package online_class.maths.modular_arithmetic_introduction;

public class Divisibility8 {
    public int solve(String A) {
        int len = A.length();
        if (len == 0)
            return 0;
        if (len <= 2)
            return Integer.parseInt(A) % 8 == 0 ? 1 : 0;

        int lastindex = A.charAt(len - 1);
        int secondLastindex = A.charAt(len - 2);
        int thirdLastindex = A.charAt(len - 3);
        int num = thirdLastindex * 100 + secondLastindex * 10 + lastindex;
        return num % 8 == 0 ? 1 : 0;
    }
}
