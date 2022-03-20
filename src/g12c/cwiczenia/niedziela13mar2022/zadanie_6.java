package g12c.cwiczenia.niedziela13mar2022;

import java.util.Random;

public class zadanie_6 {

    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            Random randomNumber = new Random();
            arr[i] = randomNumber.nextInt(901) + 100;
        }

        System.out.print("Generated array: [");
        printArray(arr);
        System.out.println("]");

        sortArray(arr);

        System.out.print("Sorted array: [");
        printArray(arr);
        System.out.print("]");
    }

    public static void printArray(int[] arr) {

        for (int i = 0; i < (arr.length - 1); i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
    }

    public static void sortArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}