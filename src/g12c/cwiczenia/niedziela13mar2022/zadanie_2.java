package g12c.cwiczenia.niedziela13mar2022;

import java.util.Scanner;

public class zadanie_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj trzy liczby całkowite:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a + " " + b + " " + c);

        int temp;

        if (a > b && a > c) {
            if  (b < c) {
                temp = b;
                b = c;
                c = temp;
            }
        }

        if (b > a && b > c) {
            temp = a;
            a = b;
            if  (temp < c) {
                b = c;
                c = temp;
            } else {
                b = temp;
            }
        }






        System.out.println("po sortowaniu: " + a + " " + b + " " + c);
    }

}