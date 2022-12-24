package SortAlgorithms;

public class mergeSort {
    
    public static void main(String[] args) {

    }

    public static void mergeSort(int[] A) {
        int left = 0;
        int right = A.length;
        int middle = (int) Math.floor((left+right)/2);

        mergeSort(A, left, middle);
        mergeSort(A, middle, right);
        merge(A, left, middle, right);
    }

    public static void mergeSort(int[] A, int left, int right) {
        if(!(left == right)) {
            int middle = (int) Math.floor((left+right)/2);

            mergeSort(A, left, middle);
            mergeSort(A, middle, right);
            merge(A, left, middle, right);
        }
    }

    public static void merge(int[] A, int left1, int middle, int right2) {

    }
}
