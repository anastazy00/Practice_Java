
import java.util.Scanner;
//Найти длину окружности радиуса 4
public class Primer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус окружности");
        short r = sc.nextShort();
        sc.close();
        double L= 2*Math.PI*r;
        System.out.println("Длина окружности = " + L);
    }
}
