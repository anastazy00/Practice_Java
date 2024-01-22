import java.util.Scanner;

public class Task2 {
    // Составить процедуру,"рисующую" на экране горизонтальную линию из любого числа символов "*"
    public static void main(String[] args) {
        char a ='*';
        Scanner sc = new Scanner(System. in);
        System.out.println("Введите количество символов");
        int number = sc.nextInt();
        sc.close();
        if (number<=0)
        {
            System.out.println("Введено некорректное число");
        }
        horizontalLine(a,number,0);
    }
    public static void horizontalLine(char b, int m, int count)
    {
        if (count<m)
        {
            count++;
            System.out.print(b);
            horizontalLine(b, m, count);

        }

    }

}
