import java.util.Scanner;
//Составить программу, которая уменьшает первое введенное число в два раза, если оно больше второго введенного числа по абсолютной величине
public class Primer2 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a> Math.abs(b)) {
            System.out.println(a / 2);
        }
            else
            {
                System.out.println("@");
            }

    }
}
