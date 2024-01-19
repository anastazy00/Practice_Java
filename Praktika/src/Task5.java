import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Даны два числа.Если квадратный корень из второго числа меньше первого числа,
        // то увеличить второе число в пять раз.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextInt();
        sc.close();
        if(Math.sqrt(b)<a)
        {
            System.out.println("b = " + b*5);
        }
        else
        {
            System.out.println("Заданное условие не выполняется");
        }
    }
}
