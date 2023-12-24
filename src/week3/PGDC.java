package week3;
import java.util.Scanner;
public class PGDC {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int firstNum = 0;
        int secondNum = 0;

        System.out.print("Entrez un nombre positif: ");
        firstNum = scanner.nextInt();
        System.out.print("Entrez un nombre positif: ");
        secondNum = scanner.nextInt();

        int a = firstNum;
        int b = secondNum;

        while (a != b)
        {
            if (a > b)
            {
                a = a - b;

            }else
            {
                b = b - a;
            }
        }
            System.out.println("Le plus grand diviseur commun de " + firstNum + " et " + secondNum + " et " + a);

            scanner.close();

    }
}
