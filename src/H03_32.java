public class H03_32 {

    public H03_32() {

    }

    public double power(double x, int n) {

        if (n == 0) {
            return 1;
        }

        return x * power(x, n - 1);
    }
}
