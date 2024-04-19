package week5;
import java.util.ArrayList;

public class Quiz {
    public static void main(String[] args){
        ArrayList<Character> liste = new ArrayList<Character>();

        liste.add('A');
        liste.add('D');
        liste.add('F');
        liste.add('M');
        liste.add('A');
        liste.add('B');
        liste.add('D');

        // 3.
        ArrayList<Integer> tab = new ArrayList<Integer>();

        tab.add(1);
        tab.add(1);

        for (int i = 2; i < 6; i++){
            tab.add(tab.get(i-2) + tab.get(i-1));
        }

        tab.remove(0);
        for (int i=0;i<tab.size()-1;i++){
            System.out.println(tab.get(i));
        }
        // 4 .
        String s1 = "110" ;
        String s2 = "11"                 ;

        int v = Integer.parseInt(s2);

        for (int i = 0; i < s1.length(); i++){

            String subs1 = s1.substring(0, i + 1);
            String subs2 = s1.substring(i + 1, s1.length());

            if (i == s1.length() - 1){
                subs2 = "0";
            }

            int v1 = Integer.parseInt(subs1);
            int v2 = Integer.parseInt(subs2);

            if (v1 + v2 == v){
                System.out.println(subs1 + " + " + subs2 + " = " + s2 );
            }
        }
    }
}