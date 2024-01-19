import java.util.Scanner;
//Составить программу,которая в зависимости от порядкового номера дня недели(1,2,...,7)выводит на экран его название(понедельник,вторник,...,воскресенье)
public class Primer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите порядковый номер от 1 до 7");
        int a= sc.nextInt();
        sc.close();
        switch (a)
        {
            case 1:
                System.out.println("Понедельник");
                       break;
            case 2:
                System.out.println("Вторник");
                        break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Неизвестное значение");
            break;
        }
    }
}
