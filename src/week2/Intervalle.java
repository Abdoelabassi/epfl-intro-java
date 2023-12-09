package week2;
import java.util.Scanner;
public class Intervalle {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // intervalle: I = [2,3[ U ]0,1] U [-10, -2]
        double x  = 0.0;
        System.out.print("Entrez un variable reelle x: ");
        x = scanner.nextDouble();
        if ((x >= 2 && x < 3) || (x > 0 && x <= 1) || (x >= -10 && x <= -2))
        {
            System.out.println("x appartient a I");
        }
        else
        {
            System.out.println("x n'appartient pas I");
        }

    }
}
