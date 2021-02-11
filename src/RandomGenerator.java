import java.util.Random;

public class RandomGenerator {
    Random random = new Random();

    public void task1() {
        int randomValue = random.nextInt();
        System.out.println("Task1: " + randomValue);
    }

    public void task2() {
        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt();
            System.out.println("Task2: " + randomValue);
        }
    }

    public void task3() {
        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt(10);
            System.out.println("Task3: " + randomValue);
        }
    }

    public void task4() {
        int min = 20;
        int max = 50;

        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt((max - min) + 1) + min;
            System.out.println("Task4: " + randomValue);
        }
    }

    public void task5 () {
        int min = -10;
        int max = 10;

        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt((max - min) + 1) + min;
            System.out.println("Task5: " + randomValue);
        }
    }

    public void task6 () {
        int min = -10;
        int max = 35;

        int randomMin = 3;
        int randomMax = 15;

        int x = random.nextInt((randomMax - randomMin) + 1) + randomMin;

        for (int i = 0; i < x; i++) {
            int randomValue = random.nextInt((max - min) + 1) + min;
            System.out.println("Task6: " + randomValue);
        }
    }
}