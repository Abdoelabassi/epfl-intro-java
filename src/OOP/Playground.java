package OOP;


public class Playground {
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] A = {1,6,4,2,6,3,0,9};
        int [] C = ms.mergSort(A);
        for (int c: C){
            System.out.print(c);
        }

    }
}
