import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        final int speed_of_light = 3000000;
        Scanner keyb = new Scanner(System.in);
        System.out.println("enter a value for n: ");
        int n = keyb.nextInt();
        System.out.println("multiplying n by 5, results in " + n * 5);
    }
}