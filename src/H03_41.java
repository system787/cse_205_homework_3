import java.util.ArrayList;

public class H03_41 {

    public H03_41() {
    }

    //public static void main(String[] args) {
    //    new H03_41().run();
    //}

    //private void run() {
    //    ArrayList<String> list = new ArrayList<>();
    //    String[] array = new String[]{ "a", "b", "c", "d", "e", "f", "g", "h"};

    //    for (String s : array) {
    //        list.add(s);
    //    }

    //    System.out.println(recLinearSearch(list, "e", 0, list.size()));

    //    System.out.println(recLinearSearch(list, "g", 0, list.size()));

    //    System.out.println(recLinearSearch(list, "z", 0 , list.size()));

    //}

    public int recLinearSearch(ArrayList<String> pList, String pKey, int pBeginIdx, int pEndIdx) {

        if (pBeginIdx > pEndIdx) {
            return -1;
        }

        int middle = (pBeginIdx + pEndIdx) / 2;

        if (pKey.compareToIgnoreCase(pList.get(middle)) == 0) {
            return middle;
        } else if (pKey.compareToIgnoreCase(pList.get(middle)) < 0) {
            return recLinearSearch(pList, pKey, pBeginIdx, pEndIdx - 1);
        } else {
            return recLinearSearch(pList, pKey, middle + 1, pEndIdx);
        }
    }
}
