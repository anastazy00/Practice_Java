import java.util.Scanner;

public class Task1 {
    // Составить программу вывода любого числа любое заданное число раз.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();// введите число
        System.out.println("Введите количество повторений");
        int b = sc.nextInt();// введите количество повторений
        for (int i =0; i<b; i++)
        {
            System.out.printf("%d ", a);
        }

    }
}
