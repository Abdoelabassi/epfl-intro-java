
import java.util.Scanner;
public class IMC {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double poids;
        double taille;


        System.out.print("Enter a weight in (in kg): ");
        poids = scanner.nextDouble();
        System.out.print("Enter a height in (in m): ");
        taille = scanner.nextDouble();

        double IMC = poids / (taille * taille);

        System.out.println("For a weight of  " + poids + " kg, and height of " + taille + " m, IMC is " + IMC);


    }
}
