import java.util.Scanner;

public class Fondue {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int BASE = 4;
        double fromage = 800.0;
        double eau = 2.0;
        double ail = 2.0;
        double pain = 400.0;
        int nbConvives;

        System.out.println("Entrez le nombre de personne(s) conviées à la fondue : ");
        nbConvives = scanner.nextInt();

        System.out.println("Pour faire une fondue fribourgeoise pour " + nbConvives +  " personnes, il vous faut :");
        System.out.println("- " + fromage * nbConvives/BASE + " gr de Vacherin fribourgeois");
        System.out.println( "- " + eau * nbConvives/BASE + " dl d'eau");
        System.out.println( "- " + ail * nbConvives/BASE + " gousse(s) d'ail");
        System.out.println("- " +   pain * nbConvives/BASE + " gr de pain");
        System.out.println("- du poivre à volonté");







    }
}
