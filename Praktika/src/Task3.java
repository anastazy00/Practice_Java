import java.util.Scanner;

public class Task3 {
    //Дано двузначное число.Определить:остаток от деления десятков на единицы,результат деления единиц на десятки
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        //a-единицы, b - десятки.
        int a = number % 10;
        System.out.println(a);
        int b = number/10;
        System.out.println(b);
        double c = b % a;
        double k = a/b;
        System.out.println("остаток от деления десятков на единицы = " + c);
        System.out.println("результат деления единиц на десятки = " + k);



    }
}
