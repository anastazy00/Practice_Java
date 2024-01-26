public class Task3 {
    // Напечатать таблицу соответствия между весом в фунтах и весом в килограммах для значений:
    // 1 , 2 , ..., 10 фунтов
    // (1 фунт = 453г).
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++)
        {
            double kilograms = i * 453 / 1000.0;
            System.out.printf("%d фунт = %2f кг\n", i, kilograms);
        }

    }
}
