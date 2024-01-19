import java.util.Scanner;
//Дано натуральное число.Определить :
// является ли оно четным;
// оканчивается ли оно цифрой 7

public class Primer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        sc.close();

        if (number % 2==0)
        {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }

        if (number % 10 ==7)
        {
            System.out.println("Число оканчивается на 7");
        }
        else
        {
            System.out.println("Число не оканчивается на 7");
        }
    }
}

