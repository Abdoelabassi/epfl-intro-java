package week4;

public class Quiz {

    public static void main(String args[]) {

        int[][] tab1 = {{1, 2, 3, 4}, {5, 1, 8, 4}};
        int[][] tab2= { {1,3} , {1,4} , {3,5} , {2,5} };
        int[][] tab = new int[tab1.length][tab2[0].length];

        for (int i = 0; i < tab1.length; i++) {

            for (int j = 0; j < tab2[0].length; j++) {

                for (int k = 0; k < tab2.length; k++) {

                    tab[i][j] += tab1[i][k] * tab2[k][j];

                }
            }
        }
        for (int[] ints : tab) {
            for (int j = 0; j < tab[0].length; j++) {
                System.out.println(ints[j]);
            }
        }
    }
}
