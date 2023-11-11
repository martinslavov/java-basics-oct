package _07_ExamPreparation;

import java.util.Scanner;

public class _04_FoodForPets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countDays = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());

        double sumFoodEatenDog = 0;
        double sumFoodEatenCat = 0;
        double sumBiscuits = 0;

        for (int day = 1; day <= countDays ; day++) {
            int foodEatenByDog = Integer.parseInt(scanner.nextLine());
            int foodEatenByCat = Integer.parseInt(scanner.nextLine());

            if ( day % 3 == 0){
                sumBiscuits = sumBiscuits + (foodEatenByDog + foodEatenByCat) * 0.10;
            }

            sumFoodEatenDog = sumFoodEatenDog + foodEatenByDog;
            sumFoodEatenCat = sumFoodEatenCat + foodEatenByCat;
        }

        double sumAllEatenFood = sumFoodEatenDog + sumFoodEatenCat;

        double percentageEatenFood = (sumAllEatenFood / totalFood) * 100;
        double percentageEatenFoodByDog = (sumFoodEatenDog / sumAllEatenFood) * 100;
        double percentageEatenFoodByCat = ( sumFoodEatenCat / sumAllEatenFood) * 100;


        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(sumBiscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", percentageEatenFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentageEatenFoodByDog);
        System.out.printf("%.2f%% eaten from the cat.", percentageEatenFoodByCat);



    }
}
