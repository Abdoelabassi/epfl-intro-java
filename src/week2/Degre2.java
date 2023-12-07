package week2;
import java.util.Scanner;
public class Degre2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;

        while (a == 0.0)
        {
            System.out.print("Entrez une valeur non nulle pour a: ");
            a = scanner.nextDouble();
        }
        System.out.print("Entrez une valeur pour b: ");
        b = scanner.nextDouble();
        System.out.print("Entrez une valeur pour c: ");
        c = scanner.nextDouble();

        double delta = b*b - 4*a*c;

        if (delta < 0)
        {
            System.out.print("pas de solution reelle");
        }
        else if (delta == 0.0)
        {
            System.out.println("seule solution:" + -b/2*a);
        }
        else
        {
            System.out.println("deux possible solution: x_1= "
                    + (-b + Math.sqrt(delta))/2*a + ", x_2= " + (-b - Math.sqrt(delta))/2*a);
        }




    }
}
