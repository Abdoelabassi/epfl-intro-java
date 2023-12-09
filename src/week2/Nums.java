package week2;
import java.util.Scanner;
public class Nums {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        while (number == 0)
        {
            System.out.print("Entrez un nombre entier:");
            number = scanner.nextInt();

            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println("Le nombre est positif et pair ");
                } else {
                    System.out.println("Le nombre est positif et impair");
                }
            }
            else if (number < 0)
            {
                if (number % 2 == 0)
                {
                    System.out.println("Le nombre est negatif et pair");
                }
                else
                {
                    System.out.println("Le nombre est negatif et impair");
                }
            }
            else
            {
                System.out.println("Le nombre est zero (et il est pair)");
            }
        }
    }
}
