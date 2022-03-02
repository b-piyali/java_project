package online_class.maths.modular_arithmetic_introduction;

public class ModString {
    public int findMod1(String A, int B) {
        int mod = 0;
        int rem = 1;
        int len = A.length() - 1;
        for (int i = len; i >= 0; --i) {
            mod += (Character.getNumericValue(A.charAt(i)) * rem) % B;
            rem = (rem * 10) % B;
        }
        return mod % B;
    }

    public int findMod(String A, int B) {
        int number = 0;
        for (int i = 0; i < A.length(); i++) {
            number = (number * 10) % B;
            int x = Character.getNumericValue(A.charAt(i));
            number = (number + x) % B;
        }
        return number;
    }
}
