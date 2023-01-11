import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

/**

 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一 对兔子， 假如兔子都不死，问每个月的兔子总数为多少？

 * @author Administrator

 */

public class Rabbit {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new littleRabbit());

        for (int k = 1; k <= 20; k++) {
            for (int j = 0; j < list.size(); j++) {
                littleRabbit rabbit = (littleRabbit) list.get(j);

                int age = rabbit.getAge();

                if (age >= 3) {
                    list.add(new littleRabbit());

                }

                age++;

                rabbit.setAge(age);

            }

            System.out.println("第" + k + "个月有" + list.size() + "对兔子，一共"+list.size()*2+"只。");

// System.out.print(list.size()+",");

        }

    }

}

class littleRabbit {
    private int age = 1;

    public void growUp() {
        this.age++;

    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;

    }

}