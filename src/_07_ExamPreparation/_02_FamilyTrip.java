package _07_ExamPreparation;

import java.util.Scanner;

public class _02_FamilyTrip {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        double pricePerDay = Double.parseDouble(scanner.nextLine());
        int percentAdditionalExpenses = Integer.parseInt(scanner.nextLine());

        // правим проверка дали нощувките са повече от 7
        if (days > 7){
            // цената с процент отстъпка
            pricePerDay = pricePerDay - (pricePerDay * 0.05);
        }

        // цената за всички нощувки
        double priceForAllDays = days * pricePerDay;

        // допълнителните разходи
        double additionalExpenses = (percentAdditionalExpenses / 100.00) * budget;

        // всички пари които ще ни трябват
        double neededMoney = priceForAllDays + additionalExpenses;

        // изчисляваме разликата
        double diff = Math.abs(neededMoney - budget);

        if (budget >= neededMoney){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        } else {
            System.out.printf("%.2f leva needed.", diff);
        }

    }

}
