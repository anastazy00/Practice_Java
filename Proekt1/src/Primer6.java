import java.util.Scanner;
//Дано трехзначное число.
// Найти:
// 1.число единиц в нем;
// 2.число десятков в нем;
// 3.сумму его цифр;
// 4.произведение его цифр.
public class Primer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int units = number % 10;
        int decimals = (number / 10) % 10;
        int hundreds = (number / 10) / 10;
        System.out.println("Сумма цифр = " + (units + decimals + hundreds));
        System.out.println("Произведение цифр = " + (units * decimals * hundreds));
    }
}
