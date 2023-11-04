package _06_Nested_Loops;


import java.util.Scanner;

public class _06_Building {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // брой на етажите
        int countFloors = Integer.parseInt(scanner.nextLine());
        // брой на стаи
        int countRooms = Integer.parseInt(scanner.nextLine());

        // етажи: от последният към първият
        for (int floor = countFloors; floor >= 1; floor--) {
            for (int room = 0; room < countRooms ; room++) {

                // проверка на какъв етаж се намира стаята(дали е на последен)
                if (floor == countFloors) {
                    System.out.print("L" + floor + room + " ");
                }
                // проверка дали етажа е четен
                else if (floor % 2 == 0 ){
                    System.out.print("O" + floor + room + " ");
                }
                // проверка дали етажа е четен
                else {
                    System.out.print("A" + floor + room + " ");
                }

            }

            System.out.println();


        }

    }

}
