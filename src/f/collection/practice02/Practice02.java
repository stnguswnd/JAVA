package f.collection.practice02;

import java.util.*;

public class Practice02 {
    public static void main(String[] args) {
        // 테스트 1
        String[] words1 = {"apple", "banana", "apple", "cherry", "banana", "apple"};
        Map<String, Integer> result1 = countWordFrequency(words1);
        System.out.println("테스트 1: " + result1); // {apple=3, banana=2, cherry=1}

        // 테스트 2
        String[] words2 = {"hello", "world"};
        Map<String, Integer> result2 = countWordFrequency(words2);
        System.out.println("테스트 2: " + result2); // {hello=1, world=1}

        // 테스트 3: 빈 배열
        String[] words3 = {};
        Map<String, Integer> result3 = countWordFrequency(words3);
        System.out.println("테스트 3: " + result3); // {}

        // 테스트 4: 모두 같은 단어
        String[] words4 = {"test", "test", "test"};
        Map<String, Integer> result4 = countWordFrequency(words4);
        System.out.println("테스트 4: " + result4); // {test=3}
    }

    public static Map<String, Integer> countWordFrequency(String[] words) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1); //0이 아니라 1을 넣어야하는거 아님? 만약에 없으면 0 +1을 하는 연산을 하는 것임! 만약 있으면 기존 값이 0이 아니고, 이 값에 1을 추가함!
        }

        return map;
    }
}