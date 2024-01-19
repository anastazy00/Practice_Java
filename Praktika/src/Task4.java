import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Даны три вещественных числа a,b,c.
        // Проверить:1.выполняется ли неравенство a<b<c; 2.выполняется ли неравенство b>a>c
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if (a < b && b<c)
        {
            System.out.println("Выполняется неравенство a<b<c ");
        }
        else
        {
            System.out.println("Неравенство не выполняется");
        }
        if (b > a && a>c)
        {
            System.out.println("Bыполняется неравенство b>a>c");
        }
        else
        {
            System.out.println("Второе Неравенство не выполняется");
        }
    }
}
