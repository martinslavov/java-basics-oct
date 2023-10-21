package _04__For.Loop;
import java.util.Scanner;

public class _03_Numbers1NWithStep3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // начало: 1
        // край: n
        // промяна: 3

        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);
        }

    }
}
