package _05_While_Lopp;


import java.util.Scanner;

public class _04_Sequence2k1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 1 до n, което се променя -> * 2 + 1
        // повтаряне: отпечатваме число
        // начало: 1
        // стоп: n
        // продължаваме: * 2 + 1

//        for (int i = 1; i <= n ; i = i * 2 + 1) {
//            System.out.println(i);
//        }

        // повтаряне: отпечатване на число -> отиване към следващото
        // стоп: number > n
        // продължаваме: number <= n

        int number = 1;
        while (number <= n) {
            System.out.println(number);
            number = number * 2 + 1;
        }

    }

}
