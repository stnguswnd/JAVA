package g.javaclass;

import java.util.HashSet;
import java.util.Random;

public class MathRandomeMain {
    public static void main(String[] args) {
        System.out.println(Math.min(10, 20));
        System.out.println(Math.PI);

        Random random = new Random();

        int num = random.nextInt(10);
        System.out.println(num);

        int num2 = random.nextInt(999999);
        System.out.println(num2);

        System.out.println(random.nextInt(10));
        System.out.println(num);

        int dice = random.nextInt(6) + 1;
        System.out.println(dice);

        HashSet<Integer> lotto = new HashSet<>();

        while (lotto.size() < 6) {
            int number = random.nextInt(1, 46);
            lotto.add(number);
        }
        System.out.println(lotto);
    }
}
