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
        final double g = 9.81;
        double v0 = 0.0;
        double t0 = 0.0;
        double  surface_parachutiste = 2.0;
        double s = surface_parachutiste / masse;
        double hauteur=h0;
        double vitesse=v0;
        double accel=g;
        double t = t0;
        boolean is_supersonic = false;
        boolean is_max_v = false;
        boolean open_parachute = false;
        double q;
        q = Math.exp(-s*(t-t0));
        vitesse = (1-q)*g/s + v0*q;
        hauteur = h0 - g/s*(t-t0) - (1-q)*(v0 - g/s)/s;
        accel = g - s*vitesse;
        System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, vitesse, accel);
        t++;
        do
        {

            q = Math.exp(-s*(t-t0));
            vitesse = (1-q)*g/s + v0*q;
            hauteur = h0 - g/s*(t-t0) - (1-q)*(v0 - g/s)/s;
            accel = g - s*vitesse;

            if (vitesse > 343 && !is_supersonic){
                is_supersonic = true;
                System.out.println("## Felix depasse la vitesse du son");
            }
            if (accel < 0.5 && !is_max_v){
                is_max_v = true;
                System.out.println("## Felix a atteint sa vitesse maximale");
            }
            if (hauteur < 2500 && !open_parachute) {
                System.out.println("## Felix ouvre son parachute");
                open_parachute = true;
                s = 25.0 / masse;
                t0 = t;
                v0 = vitesse;
                h0 = hauteur;
            }
            if (hauteur > 0)
            {
                System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, vitesse, accel);

            }
            t++;

        }while(hauteur > 0);
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
