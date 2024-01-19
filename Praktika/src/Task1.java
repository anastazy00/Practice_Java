import java.util.Scanner;
//В чемпионате по футболу команде за выигрыш дается 3 очка,за проигрыш-0,за ничью-1.
// Известно количество очков,полученных командой за игру. Определить словесный результат игры(выигрыш,проигрыш или ничья)
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цифру от 1,0 или 3");
        int number = sc.nextInt();
        sc.close();
        if (number== 3)
        {
            System.out.println("Выигрыш!");
        }
        else if(number==0)
        {
            System.out.println("Проигрыш!");
        }
        else if(number==1)
        {
            System.out.println("Ничья");
        }
        else
        {
            System.out.println("Введена неверная цифра");
        }
    }
}
