package week2;
import java.util.Scanner;
public class Formules {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double x = 0.0;

        System.out.print("Entrez un variable reelle: ");
        x = scanner.nextDouble();
        double resultat = 0.0;
        // Expression I:  x / (1 - Math.exp(x))
        if (x == 0)
        {
            System.out.println("Expression 1 indefinie");
        }
        else
        {
            resultat = x / (1 - Math.exp(x));
            System.out.println("Expression 1: " + resultat);
        }
        // Expression II:  x*Math.log(x)*Math.exp(2/x-1)
        if (x <= 0.0 || x == 1.0)
        {
            System.out.println("Expression 2 indefinie");
        }
        else
        {
            resultat = x * Math.log(x) * Math.exp(2/(x - 1));
            System.out.println("Expression 2: " + resultat);
        }
        // Expression III: (Math.sin(x) - x/20)*Math.log(Math.sqrt(x*x - 1/x))
        if (x >= 0.0 && x <= 1.0)
        {
            System.out.println("Expression 3 indefinie");
        }
        else
        {
            resultat = (Math.sin(x) - x/20)*Math.log(Math.sqrt(x*x - 1/x));
            if (resultat < 0.0)
                System.out.println("indefinie");
            else
                System.out.println("Expression 3: " + Math.sqrt(resultat));
        }
        // Expression IV:  (-x - Math.sqrt(x*x - 8*x))/(2-x)
        if ((x > 0.0) && (x < 8.0))
        {
            System.out.println("Expression 4 indefinie");
        }
        else
        {
            resultat = ( -x - Math.sqrt(x*x - 8*x))/ (2 - x);
            System.out.println("Expression 4: " + resultat);
        }

    }
}
