package week4;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class MatMul {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){


        // size
        int lignes = 0;
        int colonnes = 0;
        System.out.println("Saisie de la 1ere matrice: ");

        while (lignes < 1){
           System.out.print("\tNombre de lignes: ");
           lignes = scanner.nextInt();
       }
       while (colonnes < 1){
           System.out.print("\tNombre des colonnes: ");
           colonnes = scanner.nextInt();
       }

        double[][] mat1 = new double[lignes][colonnes];
        for (int i=0; i < lignes; i++){
            for (int j=0;j<colonnes;j++){
                System.out.print("M["+(i+1)+","+(j+1)+"]= ");
                mat1[i][j] = scanner.nextDouble();
            }
        }
        lignes = 0;
        colonnes = 0;
        System.out.println("Saisie de la 2eme matrice: ");

        while (lignes < 1){
            System.out.print("\tNombre de lignes: ");
            lignes = scanner.nextInt();
        }
        while (colonnes < 1){
            System.out.print("\tNombre des colonnes: ");
            colonnes = scanner.nextInt();
        }


        double[][] mat2 = new double[lignes][colonnes];
        for (int i=0;i<lignes;i++){
            for (int j=0;j<colonnes;j++){
                System.out.print("M["+(i+1)+","+(j+1)+"]= ");
                mat2[i][j] = scanner.nextDouble();
            }
        }
        if (mat1[0].length != mat2.length){
            System.out.println("Matrice Multiplication est impossible");
        }
        else{
            double[][] prod = new double[mat1.length][mat2[0].length];
            for (int i = 0; i < mat1.length; i++){
                for (int j=0; j < mat2[0].length; j++){
                    for (int k = 0; k < mat2.length;k++){
                        prod[i][j] = mat1[i][k]*mat2[k][j];
                    }
                }
            }
            for (double[] doubles : prod) {
                for (int j = 0; j < prod[0].length; j++) {
                    System.out.print(doubles[j] + " ");
                }
                System.out.println();
            }
        }


    scanner.close();

    }
}
