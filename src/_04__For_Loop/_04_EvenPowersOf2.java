package _04__For.Loop;

import java.util.Scanner;

public class _04_EvenPowersOf2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // начало: 0 (0 е валидна степен)
        // край: n
        // промяна: 1

//        for (int step = 0; step <= n ; step++) {
//            if ( step % 2 == 0){
//                System.out.println(Math.pow(2, step));
//            }
//        }

        for (int step = 0; step <= n; step += 2) {
            System.out.println(Math.pow(2, step));
        }

    }
}
