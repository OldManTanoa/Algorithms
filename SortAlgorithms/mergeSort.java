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
        if(left < right) {
            int middle = (int) Math.floor((left+right)/2);

            mergeSort(A, left, middle);
            mergeSort(A, middle, right);
            merge(A, left, middle, right);
        }
    }

    public static void merge(int[] A, int left, int middle, int right) {
        int i = left;
        int j = middle;
        int[] res = new int[right-left];
        int k = 0;

        while(i < middle && j < right) {
            if (A[i] < A[j]) {
                res[k] = A[i];
                i++; k++;
            } else {
                res[k] = A[j];
                j++; k++;
            }
        }

        while (i < middle) {
            res[k] = A[i];
            k++;
            i++;
        }

        while (j < right) {
            res[k] = A[j];
            j++;
            k++;
        }
    }
}
