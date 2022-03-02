package online_class.maths.modular_arithmetic_introduction;

public class ExcelColumnNumber {
    public int titleToNumber(String A) {
        int n = A.length() - 1;
        int temp = 1;
        int sum = 0;
        for (int i = n; i >= 0; i--) {
            sum = sum + (A.charAt(i) - 'A' + 1) * temp;
            temp = temp * 26;
        }
        return sum;
    }
}
