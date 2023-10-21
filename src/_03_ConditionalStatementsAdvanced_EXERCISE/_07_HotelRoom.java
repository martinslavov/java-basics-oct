package _03_ConditionalStatementsAdvanced_EXERCISE;

import java.util.Scanner;

public class _07_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nightsCount = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0.0;
        double apartmentPrice = 0.0;

        if (month.equals("May") || month.equals("October")) {
            studioPrice = 50.0 * nightsCount;
            apartmentPrice = 65.0 * nightsCount;

            if (nightsCount > 7 && nightsCount <= 14) {
                studioPrice = studioPrice * 0.95;
            } else if (nightsCount > 14) {
                studioPrice = studioPrice * 0.70;
                apartmentPrice = apartmentPrice * 0.90;
            }
        }
        else if (month.equals("June") || month.equals("September")) {
            studioPrice = 75.20 * nightsCount;
            apartmentPrice = 68.70 * nightsCount;

            if (nightsCount > 14) {
                studioPrice = studioPrice * 0.80;
                apartmentPrice = apartmentPrice * 0.90;
            }
        }
        else if (month.equals("July") || month.equals("August")) {
            studioPrice = 76.0 * nightsCount;
            apartmentPrice = 77.0 * nightsCount;

            if (nightsCount > 14) {
                apartmentPrice = apartmentPrice * 0.90;
            }
        }


        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartmentPrice, studioPrice);

    }
}