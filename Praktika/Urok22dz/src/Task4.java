import java.util.Scanner;

public class Task4 {
    // Вычислить сумму 1 + 1/2 + 1/3 + ... + 1/n.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        if ( number<=0)
        {
            System.out.println("Введено неверное значение");
        }
        else {
            int j = 1;
            double sum = 0;
            do {
                sum += 1.0 / j;
                j++;
            }
            while (j <= number);
            System.out.println("Сумма равна = " + sum);
        }
    }
}
