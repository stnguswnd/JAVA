package a.basic.practice3;

public class Practice1 {
    public static void main(String[] args) {
         int[] numbers = {45,23,78,12,89,34};

         int max = numbers[0];
         int min = numbers[0];

         for (int n : numbers) {
             if (n > max) max = n;
             if (n < min) min = n;
         }

         System.out.println("최댓값: " + max);
         System.out.println("최솟값: " + min);
    }
}
