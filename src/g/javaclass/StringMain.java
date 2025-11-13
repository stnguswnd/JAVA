package g.javaclass;

import java.util.Arrays;

public class StringMain {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println(str1 == str2); //true가 나옴, 따옴표 안에 넣는걸 리터럴 방식으로 String을 만들었다고 함.

        String str3 = new String("hi");
        String str4 = new String("hi");

        System.out.println(str3 == str4); //false가 나옴, String이라고 하는 클래스에 생성자 메소드를 만들어서 호출했음.

        String str5 = "hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str5)); //대소문자 상관없이 이퀄을 할려면 equalsignore을 써야함.

        System.out.println(str1.length());
        System.out.println(str1.charAt(2)); //2번 인덱스에는 l이 있음, 0부터 시작해서 3번째임.
        System.out.println(str1.indexOf("z")); //만약 값이 없으면 음수가 나옴,
        System.out.println(str1.lastIndexOf("l")); // 이건 맨 마지막 인덱스만을 찾아줌.

        System.out.println(str1.substring(2,4)); //데이터를 자를 수 있지만 return은 새로운 문자열이다.
        System.out.println(str1); //반영 안됨

        System.out.println(str1.contains("H"));
        System.out.println(str1.startsWith("h"));

        System.out.println(str1.isEmpty()); // 빈문자열은 true고 공백일 떄는 false이다. 공백을 파악할라면 isBlank()를 써야함.

        //띄어쓰기나 개행 문자등이 있으면 이를 공백이라고 하는데, 이를 제거해주는 것을 trim이라고 한다.

        String srt6 = "   Hello    \n";
        //System.out.println(trim());

        //str6.replace("Hello","Hi");

        String csv = "aplle, banana, orange";
        String[] fruits = csv.split(", ");
        System.out.println(Arrays.toString(fruits));





    }
}
