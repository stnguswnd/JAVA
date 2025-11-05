package a.basic.practice3;

import java.util.Arrays;

// 배열 뒤집기
// 힌트: 두 개의 인덱스를 사용하여 양 끝에서 중앙으로 이동하며 교환
public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("뒤집기" + Arrays.toString(arr));
    }
}
