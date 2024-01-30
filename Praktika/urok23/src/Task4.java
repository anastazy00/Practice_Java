import java.util.Random;

public class Task4 {
    // Дан массив. Вывести на экран сначала его неотрицательные элементы, затем отрицательные.
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[r.nextInt(5, 10)];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-100, 100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.print(array[i] + " ");
            }
        }


    }
}