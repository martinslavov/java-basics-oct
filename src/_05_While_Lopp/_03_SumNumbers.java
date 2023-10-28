package _05_While_Lopp;

import java.util.Scanner;

public class _03_SumNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        // повтаряне: четене на число(number) + сума
        // стоп: сума >= number
        // продължаваме: сума < number

        int sum = 0;
        while (sum < number) {
            int n = Integer.parseInt(scanner.nextLine());
            sum += n;
        }

        System.out.println(sum);

    }
}