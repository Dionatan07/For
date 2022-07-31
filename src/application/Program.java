package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner key = new Scanner(System.in);

        int num = key.nextInt();

        for (int i = 1; i <= num; i++) {

            int num1 = i;
            int num2 = i * i;
            int num3 = i * i * i;
            System.out.println(num1 + " " + num2 + " " + num3);

        }


    }
}
