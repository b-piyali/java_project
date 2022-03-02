package show_primer;

public class RoundedVal {
    public int solve(int A) {
        if (A >= 0) {
            return (int) Math.round((A / 200) + 0.5);
        } else {
            return (int) Math.floor((A / 200) - 0.5);
        }
    }
}
