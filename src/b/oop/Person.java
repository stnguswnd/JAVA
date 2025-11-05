package b.oop;

public class Person {
    private String name;
    private int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 정보 출력 메서드
    public void printInfo() {
        System.out.println("이름: " + name + ", 나이: " + age + "세");
        //this.name으로 써야 하지만, name이 1개만 있어서 특정 가능하면 이렇게 사용 가능하다.
    }
}