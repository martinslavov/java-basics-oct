package _04_ForLoop_EXERCISE;

import java.util.Scanner;

public class _03_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int p1Counter = 0;
        int p2Counter = 0;
        int p3Counter = 0;
        int p4Counter = 0;
        int p5Counter = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                p1Counter++;
                // p1Counter = p1Counter + 1;
                // p1Counter += 1;
            } else if (number >= 200 && number <= 399) {
                p2Counter++;
            } else if (number >= 400 && number <= 599) {
                p3Counter++;
            } else if (number >= 600 && number <= 799) {
                p4Counter++;
            } else if (number >= 800) {
                p5Counter++;
            }
        }

        System.out.printf("%.2f%%%n", ((1.0 * p1Counter) / n) * 100);
        System.out.printf("%.2f%%%n", ((1.0 * p2Counter) / n) * 100);
        System.out.printf("%.2f%%%n", ((1.0 * p3Counter) / n) * 100);
        System.out.printf("%.2f%%%n", ((1.0 * p4Counter) / n) * 100);
        System.out.printf("%.2f%%", ((1.0 * p5Counter) / n) * 100);
    }
}