package c.oop2;

import java.sql.SQLOutput;

public class MethodType {
    int instanceField = 10;
    static int staticField = 20;

    void instanceMethod(){
        System.out.println("인스턴스입니다.");
    }

    static void staticMethod() {
        System.out.println("스태틱입니다");
    }

    public static void main(String[] args) {
        MethodType mt = new MethodType();
        mt.instanceMethod();

        mt.staticMethod();
        MethodType.staticMethod();
    }
}

