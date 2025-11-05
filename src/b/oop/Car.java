package b.oop;

public class Car {
    private String model;
    private int speed;
    public String name = "김현중";

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
        this.name = "김김김현중";
    }

    public void accelerate() {
        speed += 10;
    }

    public void brake() {
        if (speed >= 10)
            speed -= 10;
    }

    public void printInfo() {
        System.out.println("모델: " + model + ", 속도: " + speed + "km/h");
    }
}
