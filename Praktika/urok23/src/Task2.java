public class Task2 {
    // Заполнить массив из двенадцати элементов 1, 2, ... 12.
    // Вывести элементы массива на экран в обратном порядке.
    public static void main(String[] args) {
        int array[]= new int[12];
        for (int i =0; i< array.length; i++){
            array[i] = i + 1;
        }
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //System.out.println("\n" + array[5]);// вывести 5 элемент
        for (int i = array.length - 1 ; i>=0; i--){
            System.out.print(array[i] + " ");
        }

    }
}
