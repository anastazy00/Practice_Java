import java.util.Random;

public class Task6 {
   // Дан массив. Определить:
    // 1.количество максимальных элементов в массиве;
    // 2. количество минимальных элементов в массиве
   public static void main(String[] args) {
       Random r = new Random();
       int[] array = new int[r.nextInt(10,20)];
       for (int i=0; i< array.length;i++){
           array[i]= r.nextInt(1,10);
       }
       for(int i=0; i< array.length; i++){
           System.out.print(array[i] + " ");
       }
       int max= array[0];
       int min= array[0];
       int maxCount = 0;
       int minCount = 0;
//        int number = 2;
//       int povtor=0;
       for(int i=0; i< array.length;i++){
           if(array[i]>max){
               max=array[i];
           }
           if (array[i]<min){
               min=array[i];
           }
       }
       for(int i =0; i<array.length;i++){
           if (array[i]==max){
               maxCount++;
           }
           if (array[i]==min){
               minCount++;
           }
       }
//       for (int i=0; i< array.length;i++){
//           if(array[i]==number){
//               povtor++;
//           }
//       }
       System.out.println("\nMax = " + max);
       System.out.println("\nMin = " + min);
       System.out.println("\nКолличество максимальных элементов = " + maxCount);
       System.out.println("\nКолличество минимальных элементов = " + minCount);
//       System.out.println("\nПовторений 2 ровно = " + povtor);
   }
}
