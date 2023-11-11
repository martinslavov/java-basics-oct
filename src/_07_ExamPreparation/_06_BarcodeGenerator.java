package _07_ExamPreparation;

import java.util.Scanner;

public class _06_BarcodeGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 2345
        int start = Integer.parseInt(scanner.nextLine());

        // 6789
        int end = Integer.parseInt(scanner.nextLine());

        // Version 1
////        Конвентираме го към Стринг
////        String startString = String.valueOf(start);
////        Вземаме първият елемент от стринг-a
////        String startFirstNumber = startString.substring(0,1);
////        Конвентираме го отново към int
////        int firstStart = Integer.parseInt(startFirstNumber);
//        int firstStart = Integer.parseInt(Integer.toString(start).substring(0,1));
//        int secondStart = Integer.parseInt(Integer.toString(start).substring(1,2));
//        int thirdStart = Integer.parseInt(Integer.toString(start).substring(2,3));
//        int fourthStart = Integer.parseInt(Integer.toString(start).substring(3,4));
//
////        String endString = String.valueOf(end);
////        String endFirstNumber = endString.substring(0,1);
////        int firstEnd = Integer.parseInt(endFirstNumber);
//        int firstEnd = Integer.parseInt(Integer.toString(end).substring(0,1));
//        int secondEnd = Integer.parseInt(Integer.toString(end).substring(1,2));
//        int thirdEnd = Integer.parseInt(Integer.toString(end).substring(2,3));
//        int fourthEnd = Integer.parseInt(Integer.toString(end).substring(3,4));

        // Version 2
        char first = Integer.toString(start).charAt(0);
        String firstStartString = String.valueOf(first);
        int firstStart = Integer.parseInt(firstStartString);
        int secondStart = Integer.parseInt(String.valueOf(Integer.toString(start).charAt(1)));
        int thirdStart = Integer.parseInt(String.valueOf(Integer.toString(start).charAt(2)));
        int fourthStart = Integer.parseInt(String.valueOf(Integer.toString(start).charAt(3)));

        int firstEnd = Integer.parseInt(String.valueOf(Integer.toString(end).charAt(0)));
        int secondEnd = Integer.parseInt(String.valueOf(Integer.toString(end).charAt(1)));
        int thirdEnd = Integer.parseInt(String.valueOf(Integer.toString(end).charAt(2)));
        int fourthEnd = Integer.parseInt(String.valueOf(Integer.toString(end).charAt(3)));

        for (int i = firstStart; i <= firstEnd ; i++) {

            for (int j = secondStart; j <= secondEnd ; j++) {

                for (int k = thirdStart; k <= thirdEnd ; k++) {

                    for (int l = fourthStart; l <= fourthEnd; l++) {

                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0 ){
                            System.out.print(i);
                            System.out.print(j);
                            System.out.print(k);
                            System.out.print(l);
                            System.out.print(" ");

                        }

                    }
                }

            }

        }
    }
}
