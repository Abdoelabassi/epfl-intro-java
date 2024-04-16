package week4;
import java.util.Scanner;

public class Scalaire {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int nMax = 10;
        double [] v1 = new double[nMax];
        double [] v2 = new double[nMax];
        int n;
        double result = 0;

        do{
            System.out.print("Entrez une taille <= 10 : ");
            n = scanner.nextInt();
        }while(n<0 || n > nMax);

        for (int i=0; i < n; i++){
            System.out.print("Enter the entry " + "v1[" + i + "] = ");
            v1[i] = scanner.nextDouble();
            System.out.print("Enter the entry " + "v2[" + i + "] = ");
            v2[i] = scanner.nextDouble();
        }
        for (int j = 0; j < n; j++){
            result += v1[j]*v2[j];
        }
        System.out.println("Produit scalaire de v1 et v2 " + result);

        scanner .close();


    }
}
