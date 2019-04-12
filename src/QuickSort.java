public class QuickSort {

    public static void main(String[] args) {
        int[] testArray = new int[]{4, 2, 7, 3, 5, 13, 11, 8, 6, 2};

        quickSort(testArray, 0, testArray.length - 1);


        StringBuffer sb = new StringBuffer();
        for (int i : testArray) {
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    private static void swap (int[] inputArray, int start, int end) {
        int tempLeft = inputArray[start];
        inputArray[start] = inputArray[end];
        inputArray[end] = tempLeft;
    }

    private static int partition(int[] inputArray, int start, int end) {
        int pivot = inputArray[start];

        int leftIndex = start - 1;
        int rightIndex = end + 1;

        while (leftIndex < rightIndex) {
            leftIndex++;

            while (inputArray[leftIndex] < pivot) {
                leftIndex++;
            }

            rightIndex--;
            while (inputArray[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex < rightIndex) {
                swap(inputArray, leftIndex, rightIndex);
            }
        }

        return rightIndex;
    }


    public static void quickSort(int[] inputArray, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = partition(inputArray, start, end);

        quickSort(inputArray, start, pivot);
        quickSort(inputArray, pivot + 1, end);
    }
}
