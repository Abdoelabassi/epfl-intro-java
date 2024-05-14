package OOP;

import java.util.Arrays;

class MergeSort implements Algorithms {

    @Override
    public int[] mergSort(int[] A) {
        int n = A.length;
        int[] C = Arrays.copyOf(A, n);
        int[] R = Arrays.copyOfRange(A, 0, n/2);
        int[] L = Arrays.copyOfRange(A, n/2-1, n);
        int i = 0, j = 0;
        for (int k = 0; k < n; k++) {
            if (R[i] < L[j]){
                C[k] = R[i];
                i++;
            }
            else if (L[j] < R[i]){
                C[k] = L[j];
                j++;
            }
        }

        return C;
    }
}