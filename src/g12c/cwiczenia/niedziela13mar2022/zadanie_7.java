package g12c.cwiczenia.niedziela13mar2022;

import java.util.Scanner;

public class zadanie_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Podaj liczbe n: ");
        n = scanner.nextInt();

        while (n < 5 || n % 2 == 0) {
            System.out.print("Ponownie podaj liczbe n: ");
            n = scanner.nextInt();
        }

        // first line of stars
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        // generating the sample arr
        String[] arr = new String[n];
        arr[0] = "*";
        for (int i = 1; i < n - 1; i++) {
            arr[i] = " ";
        }
        arr[n - 1] = "*";

        // adding the star inside
        for (int i = 1; i < n-1; i++) {
            for (int j = 0; j < (arr.length); j++) {
                arr[i] = "*";
                System.out.print(arr[j]);
                arr[i] = " ";
            }
            System.out.println();
        }

        // the last line of stars
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}