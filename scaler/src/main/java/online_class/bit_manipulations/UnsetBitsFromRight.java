package online_class.bit_manipulations;

public class UnsetBitsFromRight {
    public Long solve(Long A, int B) {
        A = A >> B;             //This will loose B bits at the right
        A = A << B;             //This will add B 0's at the right
        return A;
    }
}
