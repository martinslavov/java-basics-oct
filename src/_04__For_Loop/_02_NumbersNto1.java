package _04__For.Loop;

import java.util.Scanner;

public class _02_NumbersNto1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // начало: n
        // край: 1
        // промяна: -1

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

    }

}
