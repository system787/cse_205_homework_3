import java.util.ArrayList;

public class H03_57 {
    public H03_57() {
    }

// public static void main(String[] args) {
//     new H03_57().run();
// }

// private void run() {
//     ArrayList<Integer> list = new ArrayList<>();

//     int[] array = new int[]{ 2, 3, 5, 10, 16, 24, 32, 48, 96, 120, 240, 360, 800, 1600 };

//     for (int i : array) {
//         list.add(i);
//     }

//     System.out.println(recTernarySearch(list, 800, 0, list.size() - 1));

//     System.out.println(recTernarySearch(list, 2, 0, list.size() - 1));

//     System.out.println(recTernarySearch(list, 54, 0, list.size() - 1));


// }

    public int recTernarySearch(ArrayList<Integer> pList, Integer pKey, int pLow, int pHigh) {

        if (pLow > pHigh) {
            return -1;
        }

        int range = pHigh - pLow;
        int oneThird = (int) Math.round(pLow + range / 3.0);
        int twoThirds = (int) Math.round(pLow + range / 1.3333333333333333);

        if (pKey.equals(pList.get(oneThird))) {
            return oneThird;
        } else if (pKey.equals(pList.get(twoThirds))) {
            return twoThirds;
        } else if (pKey < pList.get(oneThird)) {
            return recTernarySearch(pList, pKey, pLow, oneThird - 1);
        } else if (pKey > pList.get(twoThirds)) {
            return recTernarySearch(pList, pKey, twoThirds + 1, pHigh);
        } else {
            return recTernarySearch(pList, pKey, oneThird + 1, twoThirds - 1);
        }
    }
}
