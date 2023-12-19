import java.util.Scanner;
public class Champi {

    public static void main(String [] args)
    {
        Scanner clavier = new Scanner(System.in);
        boolean qst1;
        boolean qst2;
        boolean qst3;
        boolean qst4;

        System.out.println("Pensez à  un champignon : amanite tue mouches, pied bleu, girolle,");
        System.out.println("cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");
        System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
        qst1 = clavier.nextBoolean();
        if (qst1 == false)
        {
            System.out.print("Est - ce que votre champignon a des lamelles (true : oui, false : non) ?");
            qst2 = clavier.nextBoolean();
            if (qst2 == false)
            {
                System.out.print("==> Le champignon auquel vous pensez est ");
                System.out.print("le cèpe de Bordeaux");

            }
            else
            {
                System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
                qst3 = clavier.nextBoolean();
                if (qst3 == true)
                {
                    System.out.print("==> Le champignon auquel vous pensez est ");
                    System.out.print("la girolle");
                }
            }
        }
        else
        {
            System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
            qst4 = clavier.nextBoolean();
            if (qst4 == true)
            {
                System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
                qst3 = clavier.nextBoolean();
                if (qst3 == true)
                {
                    System.out.print("==> Le champignon auquel vous pensez est ");
                    System.out.print("l'amanite tue-mouches");
                }
                else
                {
                    System.out.print("==> Le champignon auquel vous pensez est ");
                    System.out.print("le pied bleu");
                }
            }
            else
            {
                System.out.print("==> Le champignon auquel vous pensez est ");
                System.out.print("l'agaric jaunissant");
            }
        }

    }
}
