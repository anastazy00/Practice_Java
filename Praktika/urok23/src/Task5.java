import java.util.Random;
import java.util.Scanner;

public class Task5 {
    // Составить программу:
    // 1. нахождения минимального значения среди элементов любой строки двумерного массива;
    // 2. нахождения максимального значения среди элементов любого столбца двумерного массива.
    public static void main(String[] args) {
        Random r = new Random();
        int [][] array = new int[r.nextInt(5,8)][r.nextInt(5,10)];
        for (int i = 0; i< array.length;i++){
            for (int j = 0; j< array[i].length;j++){
                array[i][j]= r.nextInt(1,30);
                System.out.print(array[i] [j] + " ");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любую строку");
        System.out.println("Введите любой столбец");
        int number = sc.nextInt();
        int number1 = sc.nextInt();
        int min=array[number][0];
        int max=array[0][number1];
        for (int i=0; i<array[number].length; i++){
            if (array[number][i]<min){
                min=array[number][i];
            }
        }
        for (int i=0; i<array.length; i++){
            if (array[i][number1]>max){
                max=array[i][number1];
            }
        }

        System.out.println("Минимум равен = " + min);
        System.out.println("Максимум равен = " + max);


    }

}
