import java.util.Scanner;

public class Task3 {
    // Даны стороны двух трекгольников.
    // Найти сумму их периметров и сумму их площадей.
    // Определить процедуру для расчета периметра и площади треугольника по его сторонам
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стороны двух треугольников");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        sc.close();
        int p = perimetr(a, b, c);
        int p1 = perimetr(a1,b1,c1);
        double s = square(a,b,c);
        double s1 = square(a1,b1,c1);

        if (a + b > c && a + c > b && b + c > a && a1 + b1 > c1 && a1 + c1 > b1 && b1 + c1 > a1)
        {
            System.out.println("Периметр треугольника 1 равен = "+ (perimetr(a,b,c)));
            System.out.println("Периметр треугольника 2 равен  = " + (perimetr(a1, b1, c1)));
            System.out.println("Сумма периметров равна = " + (p+p1));
            System.out.println("Площадь треугольника 1 равна = " + (square(a,b,c)));
            System.out.println("Площадь треугольника 2 равна = " + (square(a1,b1,c1)));
            System.out.println("Сумма площадей равна = " + (s+s1));
        }
        else
        {
            System.out.println("Треугольник не существует");
        }

    }
    public static int perimetr(int x, int y, int z)
    {
        return x + y + z;
    }
    public static double square (int x, int y, int z)
    {
        int pp = perimetr(x,y,z)/2;
        return Math.sqrt(pp * (pp-x) * (pp-y) * (pp-z));
    }


}
