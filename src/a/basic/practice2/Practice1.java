package a.basic.practice2;

public class Practice1 {
    public static void main(String[] args) {

        // 문제 1: 구구단
        // 2단부터 9단까지 구구단을 출력하세요.

        for (int i = 2; i <= 9; i++) {          // 2단부터 9단까지
            System.out.println("=== " + i + "단 ===");
            for (int j = 1; j <= 9; j++) {      // 각 단의 1~9
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        } // 단 사이 구분 줄
        //문제 5: 약수 구하기
        //주어진 숫자의 모든 약수를 출력하세요
        int num = 24;

        System.out.println(num + "의 약수: ");
        for (int i = 1; i <= num; i++) {    // 1부터 num까지 반복
            if (num % i == 0) {             // 나누어 떨어지면 약수
                System.out.print(i + " ");
            }
        }


        // 문제 6: 소수 판별
        // 주어진 숫자가 소수인지 판별하세요.

        int number = 17;
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
        }



    }
}
