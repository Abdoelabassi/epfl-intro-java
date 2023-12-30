package week3;
import java.util.Scanner;
public class Pret {

    public static void main(String[] args)
    {
        Scanner clavier = new Scanner(System.in);

        double S = 0.0;
        double r = 0.0;
        double ir = 0.01;

        do{
            System.out.print("Entrez la somme total: ");
            S = clavier.nextDouble();
        }while(S < 0);

        do{
            System.out.print("Entrez le montant par mois: ");
            r = clavier.nextDouble();
        }while(r < 0);

        do{
            System.out.print("Entrez le taux d'interet: ");
            ir = clavier.nextDouble();
        }while(ir < 0 || ir > 1);

        double somme = S;

        for (int i = 1; i <= 30; i++)
        {
            somme += r;
        }

        System.out.println("La somme des interets encaisses: " + somme);
        clavier.close();

    }
}
