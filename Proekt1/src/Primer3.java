import java.util.Scanner;
//Известен вес боксера-любителя (целое число). Известно, что вес таков, что боксер может быть отнесён к одной из трех весовых категорий:
//
//Легкий вес – до 60 кг;
//Первый полусредний вес – до 64 кг;
//Полусредний вес – до 69 кг.
//
//Напишите программу, определяющую, в какой категории будет выступать данный боксер.
public class Primer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вес");
        int weight = sc.nextInt();
        sc.close();
        if (weight>=91)
        {
            System.out.println("Супертяжелый вес");
        }
        else if(weight >=75)
        {
            System.out.println("Тяжелый вес");
        }
        else if(weight>=69)
        {
            System.out.println("Средний вес");
        }
        else
        {
            System.out.println("Легкий вес");
        }


    }
}