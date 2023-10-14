package _03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class _10_InvalidNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        // валидно: диапазона [100...200] или е 0 -> не печатаме нищо
        // невалидно: печатаме invalid

//        // Първи вариант
//        if( number >= 100 && number <= 200 || number == 0 ){
//            // валидно число
//        } else {
//            // невалидно
//            System.out.println("invalid");
//        }
//
//        // Втори вариант
//        if( !(number >= 100 && number <= 200 || number == 0 ) ){
//            // невалидно
//            System.out.println("invalid");
//        }

        // Трети вариант
        boolean isValid = number >= 100 && number <= 200 || number == 0;
        if (!isValid) {
            // невалидно
            System.out.println("invalid");
        }

    }
}
