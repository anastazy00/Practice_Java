public class Task4 {
    //Напечатать числа в виде следующей таблицы :
    // 1 2...10
    // 1 2...10
    // 1 2...10
    // 1 2...10
    public static void main(String[] args) {
        string(1, 10, 4);

    }

    public static void string(int a, int b, int c) {
        if (a <= c)
        {
            table(1,b);
            System.out.println();
            string(a+1,b,c);
        }
    }
    public static void  table(int a,int c)
    {
        if (a<=c)
    {
        System.out.print(a + " ");
        table(a+1,c);
    }
    }
}


