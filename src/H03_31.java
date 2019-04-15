// CLASS:   H03_31 (H03_31.java)
// AUTHOR:  Vincent Hoang, vnhoang@asu.edu
public class H03_31 {

    public H03_31() {}

    public int sum1toN(int n) {

        if (n == 1) {
            return 1;
        }

        return (n + sum1toN(n - 1));
    }

}
