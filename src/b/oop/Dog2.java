package b.oop;

public class Dog2 {
    private String breed;
    private String name;

    // 생성자
    public Dog2(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public void sit() {
        System.out.println(breed + " " + name + "가 앉았습니다.");
    }

    public void hand() {
        System.out.println(breed + " " + name + "가 손을 내밀었습니다.");
    }
}
