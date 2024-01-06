package week3;
import java.util.Scanner;
public class Pret {

    public static void main(String[] args)
    {
        Scanner clavier = new Scanner(System.in);

        double S = 0.0; // montant totale
        double r = 0.0; // montant fix a paye
        double ir = 0.01; // taux d'interet
        int nbr = 0; // nombre de reboursements

        do{
            System.out.print("Entrez la somme total: ");
            S = clavier.nextDouble();
        }while(S <= 0);

        do{
            System.out.print("Entrez le montant fixe a rembourser chaque mois: ");
            r = clavier.nextDouble();
        }while(r <= 0);

        do{
            System.out.print("Entrez le taux d'interet: ");
            ir = clavier.nextDouble();
        }while(ir < 0 || ir > 1);

        double somme = S;
        double somme_interet = 0.0;

        while (somme > 0)
        {
            nbr++;
            somme_interet += ir * somme;
            somme -= r;
            System.out.println(nbr + ": somme= " + somme + " somme d'interet=" + somme_interet);
        }

        System.out.println(" Somme des interets encaisses: " + somme_interet + " euros " + " (sur " + nbr + " mois). ");
        clavier.close();

    }
}
