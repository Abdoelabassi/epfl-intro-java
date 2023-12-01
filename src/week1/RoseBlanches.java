package week1;

import java.util.Scanner;
public class RoseBlanches {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int livres_fornitures;
        int cafe = 2; // 2 franc
        int abonnnement = 4;
        int billet_metro = 3;
        int budget;

        System.out.print("Combien avez-vous reçu d'argent (Frs)? ");
        budget = scanner.nextInt();

        livres_fornitures = budget * 3 / 4;
        int res_budget = budget - livres_fornitures;

        int autre_budget = res_budget / 3;

        int nCafe = autre_budget / cafe;
        int nAbon_ = autre_budget / abonnnement;
        int nBillet_ = autre_budget / billet_metro;

        int rest = autre_budget % 2 + autre_budget % 4 + autre_budget % 3 +  res_budget % 3;

        // Affichage des résultats
        System.out.println("Livres et Fournitures: " + livres_fornitures + " Frs.");
        System.out.println("Vous pouvez ensuite acheter:");
        System.out.println(" " + nCafe + " cafés à Sat");
        System.out.println(" " + nAbon_ + " numéros du Flash");
        System.out.println(" " + nBillet_ + " billets de métro");
        System.out.println("et il vous restera " + rest + " Frs pour les roses blanches");
        scanner.close();








    }
}
