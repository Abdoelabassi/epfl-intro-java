package week3;
import java.util.Map;
import java.util.Scanner;
public class Rebonds1 {

    public static void main(String[] args)
    {
        Scanner clavier = new Scanner(System.in);

        double v, v1;
        double g = 9.81;
        double eps;
        double hi;
        double hf;
        int nbr;

        do {
            System.out.print("Entrez l'hauteur initial (>= 0): ");
            hi = clavier.nextDouble();
        }while(hi < 0);

        do{
            System.out.print("Entrez le coefficient de rebond, constrainte 0 <= eps < 1: ");
            eps = clavier.nextDouble();
        }while(eps < 0 || eps > 1);

        do {
            System.out.print("Entrez le nombre de rebonds, contrainte: 0 <= NBR: ");
            nbr = clavier.nextInt();
        } while(nbr < 0);

        double h = hi;
        for (int i = 1; i <= nbr; i++)
        {
            v = Math.sqrt(2 * h * g);
            v1 = eps * v;
            hf = Math.pow(v1,2)/(2*g);
            h = hf;
            System.out.println("rebond " + i + " l'hauteur : " +  h);
        }


        clavier.close();
    }
}
