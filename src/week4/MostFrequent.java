class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        int maxocc = tab1[0];
        int occurfreq = 0;
        int max = tab1[0];
        int occur = 0;

        for (int i=0;i<taille;i++){
            occur=1;
            for (int j=i+1;j<taille;j++){
                if (tab1[i]==tab1[j]){
                    max=tab1[i];
                    occur++;
                }
            }
            if(occur>occurfreq) {
                occurfreq = occur;
                maxocc=max;
            }
        }

        System.out.println("Le nombre le plus frequent dans le tableau est le :");
        System.out.println(maxocc + " (" + occurfreq + " x)");


        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}