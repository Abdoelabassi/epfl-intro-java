package week6;
import java.util.Scanner;

public class Quiz {
    private static final Scanner scanner = new Scanner(System.in);

    static void f(int x, int y){
        System.out.println(1);
    }

    static void f(int x, double y){
        System.out.println(2);
    }

    static void f(int x, char y){
        System.out.println(3);
    }

    static void f(long x, long y){
        System.out.println(4);
    }

    public static void main(String[] args) {
        f(0,0.0);
    }

}