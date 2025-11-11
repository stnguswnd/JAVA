package d.inheritance.practice02;

// Animal.java
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + ": 소리를 냅니다.");
    }
}

// Lion.java
class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("사자 " + name + ": 어흥!");
    }
}

// Elephant.java
class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("코끼리 " + name + ": 뿌우우!");
    }
}

// Monkey.java
class Monkey extends Animal {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("원숭이 " + name + ": 끼끼!");
    }
}

// Zoo.java
class Zoo {
    Animal[] animals;

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void feedingTime() {
        System.out.println("=== 먹이 시간 ===");
        for (Animal a : animals) {
            a.makeSound(); // 다형성!
        }
    }

    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("심바", 5),
                new Elephant("덤보", 10),
                new Monkey("조조", 3)
        };

        Zoo zoo = new Zoo(animals);
        zoo.feedingTime();
    }
}
