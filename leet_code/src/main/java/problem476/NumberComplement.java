package problem476;

public class NumberComplement {
    public int findComplement(int num) {
        String binaryNum = Integer.toBinaryString(num);
        String complementBinary = convertBinaryComplement(binaryNum);
        return Integer.parseInt(complementBinary, 2);
    }


    @org.jetbrains.annotations.NotNull
    private String convertBinaryComplement(String binaryNum) {
        StringBuilder comlementBinary = new StringBuilder();
        for (char c : binaryNum.toCharArray()) {
            if (c == '1') {
                comlementBinary.append('0');
            } else if (c == '0') {
                comlementBinary.append('1');
            }
        }
        return comlementBinary.toString();
    }

    private int decimalToBinary(int num) {
        return 0;
    }

    private int binaryToDecimal(int num) {
        int decValue = 0;
        int base = 1;
        int temp = num;
        while (temp > 0) {
            int lastDigit = temp % 10;
            temp = temp / 10;
            decValue += lastDigit * base;
            base = base * 2;
        }

        return decValue;
    }
}
