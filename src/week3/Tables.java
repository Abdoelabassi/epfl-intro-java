package week3;

public class Tables {

    public static void main(String[] args)
    {
        System.out.println("Tables des multiplication");

        for (int i = 2; i <= 10; i++)
        {
            for (int j = 0; j <= 10; j++)
            {
                System.out.println("Table de " + i + " : ");
                System.out.println(i  + " * " + j + " = " + i*j);
            }
        }
    }
}
