package g.javaclass;

public class WrapperMain {
    public static void main(String[] args) {
        int primitive = 10;
        Integer wrapper = Integer.valueOf(primitive);

        Integer wrapper2 = Integer.valueOf(20);
        int primitive2 = wrapper2.intValue();

        System.out.println(wrapper);
        System.out.println(primitive2);

        //아래는 자동으로 박스에 담아주는 거다! 이를 오토 박싱이라고 한다.
        Integer wrapper3 = 10; // 래퍼 클래스 형태로 저장
        int primitive3 = 10;  // 인티저 타입으로 저장!

        //이것도 가능하다!
        int primitive4 = wrapper3;

        Integer w = null;  //클래스는 항상 참조를 하기 떄문에 null 값을 가질 수 있다.
        //int v = w;  //지금 w에 값이 null이 있어서 v에 집어넣을 수 없어! 그래서 안돼!

        // -128 ~ 127 까지는 캐싱되어 같은 객체를 참조합니다.이런 컨셉이 있다 정도만 보고 넘어가자!

        //문자열데이터를 숫자로 바꿔주세요! 글자에 따옴표를 제거하고 숫자로 바꿔줌!
        int parsed = Integer.parseInt("123");
        System.out.println(parsed);

        //상수와 속성 Integer.MAX_VALUE 가장 작고 큰 숫자를 자동으로 담아줄 수 있다.

        Integer a = 10;
        Integer b = 20;

        System.out.println(a.compareTo(b)); // -1이 뜸,

        // flaot vs double, 일반적으로는 더블인데 사이즈를 줄일려면 플롯도 쓰지만 이는 우리가 쓰는 레벨에서는 아니다.

        //타입 간 변환



    }
}
