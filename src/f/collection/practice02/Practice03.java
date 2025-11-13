package f.collection.practice02;

import java.util.*;

public class Practice03 {
    public static void main(String[] args) {
        // 테스트 1
        String str1 = "hello";
        Map<Character, List<Integer>> result1 = findCharacterPositions(str1); //앞에는 캐릭터(한글자 구조 저장)를 넣음, 뒤쪽은 리스트 형태로 숫자 인덱스를 저장함.
        //
        System.out.println("테스트 1: " + result1);
        // {h=[0], e=[1], l=[2, 3], o=[4]}

        // 테스트 2
        String str2 = "programming";
        Map<Character, List<Integer>> result2 = findCharacterPositions(str2);
        System.out.println("테스트 2: " + result2);

        // 테스트 3: 모두 같은 문자
        String str3 = "aaa";
        Map<Character, List<Integer>> result3 = findCharacterPositions(str3);
        System.out.println("테스트 3: " + result3);
        // {a=[0, 1, 2]}

        // 테스트 4: 빈 문자열
        String str4 = "";
        Map<Character, List<Integer>> result4 = findCharacterPositions(str4);
        System.out.println("테스트 4: " + result4);
        // {}
    }

    public static Map<Character, List<Integer>> findCharacterPositions(String str) {
        Map<Character, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // charAt은 내가 가진 문자열에서 i번째 문자열을 뽑아주세요!~
            // 키가 없으면 리스트 새로 생성

            //아래는 AI가 짜준 답, 만약 c 위치에 아무것도 없으면 새로운 거 만들어! 없으면 안만들어도 돼.
            //map.putIfAbsent(c, new ArrayList<>());
            // 현재 인덱스를 리스트에 추가
            //map.get(c).add(i);
        }

        return map;
    }
}