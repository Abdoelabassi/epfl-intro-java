package week2;
import java.util.Scanner;
public class Degre3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double a_0 = 0.0;
        double a_1 = 0.0;
        double a_2 = 0.0;

        System.out.print("Entrez une valeur reelle pour a_0: ");
        a_0 = scanner.nextDouble();
        System.out.print("Entrez une valeur reelle pour a_1: ");
        a_1 = scanner.nextDouble();
        System.out.print("Entrez une valeur pour a_2: ");
        a_2 = scanner.nextDouble();

        double Q = (3*a_1 - a_2*a_2)/9;
        double R = (9*a_2*a_1 - 27*a_0 - 2+Math.pow(a_2, 3))/54;
        double D = Math.pow(Q, 3) + Math.pow(R, 2);

        double theta = 0.0;
        double z_1  = 0, z_2 = 0, z_3 = 0;

        if (D < 0)
        {
            theta = Math.acos(R / Math.sqrt(Math.pow(-Q, 3)));
            System.out.println("Solution pour D < 0: ");
            z_1 = 2*Math.sqrt(-Q)*Math.cos(theta/3) - a_2/3;
            z_2 = 2*Math.sqrt(-Q)*Math.cos((theta + 2*Math.PI)/3) - a_2/3;
            z_3 = 2*Math.sqrt(-Q)*Math.cos((theta + 4*Math.PI)/3) - a_2/3;
            System.out.println("Les trois solution reelle sont: z_1 = " + z_1 + ". z_2 = " + z_2 + ", and z_3 = " + z_3);
        }
        else
        {
            double S = R + Math.sqrt(D);
            if (S < 0.0)
                    S = -Math.pow(-S, 1/3);
            else if (S >= 0.0)
                    S = Math.pow(S, 1/3);

            double T = R - Math.sqrt(D);
            if (T < 0.0)
                T = -Math.pow(-T, 1/3);
            else if (T >= 0.0)
                T = Math.pow(T, 1/3);

            z_1 = -a_2 / 3.0 + S + T;
            if (D == 0 && (S+T != 0))
            {
                System.out.println("Il ya deux solutions reelles: ");
                z_1 = S + T - a_2/3;
                z_2 = - (S+T)/2 - a_2/3;
                System.out.println("z_1 = " + z_1 + ", z_2 = " + z_2);
            }
            else
            {
                System.out.println("Solution reelle unique: " + z_1);
            }
        }
        scanner.close();
    }
}
