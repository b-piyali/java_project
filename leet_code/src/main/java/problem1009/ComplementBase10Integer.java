package problem1009;

public class ComplementBase10Integer {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        if (n == 1) return 0;
        String bitString = Integer.toBinaryString(n);
        StringBuilder complementString = new StringBuilder();
        for (char ch : bitString.toCharArray()) {
            if (ch == '1')
                complementString.append(0);
            else
                complementString.append(1);
        }
        return Integer.parseInt(complementString.toString(), 2);
    }
}
