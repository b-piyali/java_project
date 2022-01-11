package problem67;

public class AddBinary {
    public String addBinary1(String a, String b) {
        int sum = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(sum);
    }

    public String addBinary2(String a, String b) {
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        StringBuilder out = new StringBuilder();
        int carry = 0;

        for (int ia = ca.length - 1, ib = cb.length - 1; ia > -1 || ib > -1; ia--, ib--) {
            int sum = (ia < 0 ? 0 : ca[ia] & 1) +
                    (ib < 0 ? 0 : cb[ib] & 1) +
                    carry;
            carry = sum >> 1;
            out.append(sum & 1);
        }

        if (carry > 0)
            out.append(1);

        return out.reverse().toString();
    }

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum >> 1;
        }

        if (carry != 0)
            sb.append(carry);

        return sb.reverse().toString();
    }
}
