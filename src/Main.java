import java.util.Arrays;
import java.util.Scanner;

public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

    public static void main(String[] args) {


        //Exercise 1
        int sum = 0;
        for (int costsDay : generateRandomArray()) {
            sum += costsDay;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();


        //Exercise 2
        int max = generateRandomArray()[0];
        int min = generateRandomArray()[0];
        for (int costsDay : generateRandomArray()) {
            max = costsDay > max ? costsDay : max;
            min = costsDay < min ? costsDay : min;
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей \n" +
                "Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println();


        //Exercise 3
        double sumMid = (double) sum / generateRandomArray().length;
        System.out.format("Средняя сумма трат за месяц составила %.2f рублей \n", sumMid);
        System.out.println();


        //Exercise 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int c = reverseFullName.length - 1; c >= 0; c--) {
            System.out.print(reverseFullName[c]);
        }
        System.out.println();


    }

}