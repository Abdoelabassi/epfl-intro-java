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
            System.out.print("Entrez le coefficient de rebond, constrainte 0 <= eps < 1: ");
            eps = clavier.nextDouble();
            System.out.print("Entrez le nombre de rebonds, contrainte: 0 <= NBR: ");
            nbr = clavier.nextInt();
            v = Math.sqrt(2 * hi * g);
            v1 = (eps * v) / nbr;
            hf = Math.pow(v1,2)/(2*g);
            System.out.println("l'hauteur apres " + nbr + " rebonds est " + hf);
        } while((hi < 0) || (eps < 0 || eps > 1) || (nbr < 0));



    }
}
