import java.util.ArrayList;

public class H03_43 {
    public H03_43() {}

    public static void main(String[] args) {
        new H03_43().run();
    }

    private void run() {
        ArrayList<Integer> list = new ArrayList<>();

        int[] array = new int[]{ 2, 3, 5, 10, 16, 24, 32, 48, 96, 120, 240, 360, 800, 1600 };

        for (int i : array) {
            list.add(i);
        }

        //System.out.println(recursiveBinarySearch(list, 32, 0, list.size() - 1));

        System.out.println(recursiveBinarySearch(list, 150, 0, list.size() - 1));
     }

    public int recursiveBinarySearch(ArrayList<Integer> pList, int pKey, int pLow, int pHigh) {

        if (pLow > pHigh) {
            return -1;
        }

        int middle = (pLow + pHigh) / 2;

        if (pList.get(middle) == pKey) {

            return middle;

        } else if (pList.get(middle) > pKey) {

            return recursiveBinarySearch(pList, pKey, pLow, middle - 1);

        } else {

            return recursiveBinarySearch(pList, pKey, middle + 1, pHigh);

        }
    }
}
