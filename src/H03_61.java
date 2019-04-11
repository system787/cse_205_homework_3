public class H03_61 {

    public static void main(String[] args) {
        new H03_61().run();
    }

    private void run() {
        Point p1 = new Point(3, 4);

        Point p2 = new Point(6, 8);

        Point p3 = new Point(4, 3);

        Point p4 = new Point(1, 2);

        System.out.println(p1.compareTo(p2));

        System.out.println(p1.compareTo(p3));

        System.out.println(p1.compareTo(p4));
    }
}
