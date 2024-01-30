public class Task3 {
    // Заполнить массив из двенадцати элементов 1, 2, ... 12.
    // Определить:
    // 1.сумму всех элементов массива;
    // 2.произведение всех элементов массива;
    // 3.сумму квадратов всех элементов массива;
    // 4.сумму шести первых элементов массива.
    public static void main(String[] args) {
        int array [] = new int[12];
        for (int i =0; i< array.length; i++) {
            array[i] = i + 1;
        }
        for (int i =0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        int sum=0;
        int proiz = 1;
        double sumSqr = 0;

        for (int i =0; i< array.length; i++)
        {
            sum = sum + array[i];
            proiz*=array[i];
            double sqr = square(array[i], 2);
             sumSqr +=sqr;

        }
        int sum1=0;
        for (int i =0; i<=5; i++)
        {
            sum1+=array[i];
        }

        System.out.println("\nСумма всех элементов = " + sum);
        System.out.println("\nПроизведение всех элементов = " + proiz);
        System.out.println("\nСумма квадратов всех элементов = " + sumSqr);
        System.out.println("\nСумма первых 6 элементов = " + sum1);
    }
    public static double square(int a, int b){
        return Math.pow(a,b);
    }

}

