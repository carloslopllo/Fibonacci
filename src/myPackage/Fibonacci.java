package myPackage;

public class Fibonacci {
    public static int calculate(int n) throws NumberFormatException {
        if (n < 0) {
            throw new NumberFormatException();
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return calculate(n - 1) + calculate(n - 2);
        }
    }
}
