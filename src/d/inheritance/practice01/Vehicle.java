package d.inheritance.practice01;

class Vehicle {
    String model;
    double dailyRate;

    public Vehicle(String model, double dailyRate) {
        this.model = model;
        this.dailyRate = dailyRate;
    }

    public double calculateRentalCost(int days) {
        return dailyRate * days;
    }

    @Override
    public String toString() {
        return "Vehicle{model='" + model + "', dailyRate=" + dailyRate + "}";
    }
}

// Car.java
class Car extends Vehicle {
    boolean hasGPS;

    public Car(String model, double dailyRate, boolean hasGPS) {
        super(model, dailyRate);
        this.hasGPS = hasGPS;
    }

    @Override
    public double calculateRentalCost(int days) {
        double gpsCost = hasGPS ? 10000 * days : 0;
        return (dailyRate * days) + gpsCost;
    }

    @Override
    public String toString() {
        return "Car{model='" + model + "', dailyRate=" + dailyRate + ", hasGPS=" + hasGPS + "}";
    }
}

// Truck.java
class Truck extends Vehicle {
    double capacity; // 톤 단위

    public Truck(String model, double dailyRate, double capacity) {
        super(model, dailyRate);
        this.capacity = capacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        double capacityCost = capacity * 5000 * days;
        return (dailyRate * days) + capacityCost;
    }

    @Override
    public String toString() {
        return "Truck{model='" + model + "', dailyRate=" + dailyRate + ", capacity=" + capacity + "톤}";
    }

    public static void main(String[] args) {
        Car car = new Car("소나타", 50000, true);
        Truck truck = new Truck("포터", 70000, 1.5);

        System.out.println(car);
        System.out.println("3일 대여료: " + car.calculateRentalCost(3) + "원");

        System.out.println(truck);
        System.out.println("5일 대여료: " + truck.calculateRentalCost(5) + "원");
    }
}