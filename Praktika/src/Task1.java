public class Task1 {
    // Составить процедуру,"рисующую" на экране горизонтальную линию из 10 символов "*"
    public static void main(String[] args) {
        // **********
        char a = '*' ;
        printSymbol(a,0);

    }
    public static void printSymbol( char b, int count)
    {
        if (count < 10)
        {
            count++;
            System.out.print(b);
            printSymbol( b, count);


        }

    }
}
