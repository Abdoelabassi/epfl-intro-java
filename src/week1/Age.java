package week1;
import java.util.Scanner;
public class Age {

    public static void main(String[] args)
    {
        int age;
        int anne_de_naissance;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Donnez votre age: ");
        age = scanner.nextInt();

        anne_de_naissance = 2023 - age;
        System.out.println("Votre annee de naissance est: " + anne_de_naissance);
    }

}
