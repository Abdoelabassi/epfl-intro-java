import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l’heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l’heure de début de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        int n_heures = 0;
        double prix_1 = 0.0;
        double prix_2 = 0.0;
        if ((debut < 0 && debut > 24) || (fin < 0 && fin > 24)) {
            System.out.println("Les heures doivent Ãªtre comprises entre 0 et 24 !");
        }
        else if (debut == fin) {
            System.out.println("Bizarre, vous n'avez pas louÃ© votre vÃ©lo bien longtemps !");
        }
        else if (debut > fin) {
            System.out.println("Bizarre, le dÃ©but de la location est aprÃ¨s la fin ...");
        }
        else if ((fin - debut > 0 && fin - debut < 7) || (fin - debut > 17 && fin - debut <= 24)) {
            n_heures = fin - debut;
            prix_1 = 1.0 * n_heures;

            System.out.println("Vous avez loué votre vélo pendant ");
            System.out.println( n_heures + " heure(s) au tarif horaire de " + prix_1 + " franc(s)");

            System.out.print("Le montant total Ã  payer est de " + (fin - debut));
            System.out.println(" franc(s).");
        }
        else if (fin - debut >= 7 && fin - debut < 17)
        {
            n_heures = fin - debut;
            prix_2 = 2 * n_heures;
            System.out.println("Vous avez louÃ© votre vÃ©lo pendant ");
            System.out.println( n_heures + " heure(s) au tarif horaire de " + prix_2 + " franc(s)");
        }
        double prix_total = prix_1 + prix_2;
        System.out.print("Le montant total Ã  payer est de " + prix_total);
        System.out.println(" franc(s).");

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
