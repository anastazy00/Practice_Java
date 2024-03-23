import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два разных целых числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if (a != b) {
            System.out.println("Сумма двух числел равна " + Summ(a, b));
            System.out.println("Абсолютная разница двух числел равна " + Diff(a, b));
            System.out.print("Ряд чисел: ");
            Series(a,b);
        } else {
            System.out.println("Введите другие значение.  a = b");
        }
    }

    public static int Summ(int a, int b) {
        return a + b;
    }

    public static int Diff(int c, int d) {
        return Math.abs(c - d);
    }

    public static void Series(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}



