import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        double g = 9.81;
        double v_0 = 0.0;
        double t_0 = 0.0;
        double  surface_parachutiste = 2.0;
        double s = surface_parachutiste / masse;
        double hauteur = h0;
        double v = v_0;
        double a = g;
        double t = t_0;
        //System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, v, a);
        while(hauteur > 0)
        {
            boolean is_supersonic = true;
            boolean is_max_v = true;
            boolean open_parachute = true;
            if (v > 343 && is_supersonic){
                is_supersonic = false;
                System.out.println("## Felix depasse la vitesse du son");
            }
            else if (a < 0.5 && is_max_v){
                is_max_v = false;
                System.out.println("## Felix a atteint sa vitesse maximale");
            }
            System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, v, a);
            double q = Math.exp(-s*(t-t_0));
            v = (1-q)*g/s + v_0*q;
            hauteur = h0 - g/s*(t-t_0) - (1-q)*(v_0 - g/s)/s;
            a = g - s*v;
            t++;
        }
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
