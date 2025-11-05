package b.oop;

public class Main {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        int area = r1.area();
        //System.out.println("area = " + area);

        Rectangle r2 = new Rectangle(20, 20);

        //System.out.println(r2); // 참조하고 있어서 참조형 타입이라고 한다. b.oop.Rectangle@27973e9b나고 뜸

        //System.out.println(r1.width); // 내부 값을 불러온다.
        Person person = new Person("홍길동", 25);
        person.printInfo();

        Dog2 dog = new Dog2("진돗개", "백구");
        dog.sit();
        dog.hand();

        Car car = new Car("Avante", 0);
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.brake();
        car.printInfo();
        System.out.println(car.name);

    }
}
