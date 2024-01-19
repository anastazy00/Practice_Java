import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Даны радиус круга и стороны квадрата.У какой фигуры площадь больше?
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус круга а = "  );
        System.out.println("Введите сторону квадрата b = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        double Pa = Math.PI*a;
        double Pb = Math.pow(b,2);
        if (Pa>Pb)
        {
            System.out.println("Площадь круга больше");
        }
        else
        {
            System.out.println("Площадь квадрата больше");
        }



    }
}
