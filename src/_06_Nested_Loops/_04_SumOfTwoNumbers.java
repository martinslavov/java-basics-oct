package _06_Nested_Loops;


import java.util.Scanner;

public class _04_SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        boolean isThereMagicNumber = false;
        int count = 0;
        int fNumber = 0;
        int sNumber = 0;

        //комбинация: число 1 и число 2
        for (int firstNumber = start; firstNumber <= end ; firstNumber++) {
            for (int secondNumber = start; secondNumber <= end ; secondNumber++) {

                // преброяване на генерираните комбинации
                count++;

                // комбинацич: число 1, число2
                // сума от числата в комбинацията
                int sum = firstNumber + secondNumber;
                if (sum == magicNumber){
                    isThereMagicNumber = true;
                    fNumber = firstNumber;
                    sNumber = secondNumber;

                    // прекъсваме вътрешният for цикъл
                    break;
                }
            }

            // прекъсваме външният for цикъл
            if (isThereMagicNumber){
                break;
            }

        }

        // Правим проверка дали има валидна комбинация
        if (isThereMagicNumber){
            // намерили сме валидна комбинация
            System.out.printf("Combination N:%d (%d + %d = %d)",
                    count, fNumber, sNumber, magicNumber );
        } else {
            // обходили сме всички комбинации и не сме намерли валидна
            System.out.printf("%d combinations - neither equals %d",
                    count, magicNumber);
        }

    }

}
