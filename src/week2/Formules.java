package week2;
import java.util.Scanner;
public class Formules {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double x = 0.0;

        System.out.println("Entrez un variable reelle: ");
        scanner.nextDouble();

        if (x != 0)
        {
            System.out.println("la valeur de l'expression x/1-exp(x)= " + x / (1 - Math.exp(x)));
            System.out.println("la valuer de l'expression sqrt((sin(x) - x/20)log(sqrt(x*x - 1/x))) = " + Math.sqrt((Math.sin(x) - x/20)*Math.log(Math.sqrt(x*x - 1/x))));
        } else if (x > 1) {
            System.out.println("la valeur de l'expression xlog(x)exp(2/x-1) = " + x*Math.log(x)*Math.exp(2/x-1));
        } else if (x != 2 && x != 8) {
            System.out.println("la valeur de l'expression -x - sqrt(x*x - 8x)/2 - x = " + (-x - Math.sqrt(x*x - 8*x))/(2-x));
        }
        else
        {
            System.out.println("expression indefinie");
        }
    }
}
