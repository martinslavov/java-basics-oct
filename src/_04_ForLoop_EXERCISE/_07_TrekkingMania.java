package _04_ForLoop_EXERCISE;

import java.util.Scanner;

public class _07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupsCount = Integer.parseInt(scanner.nextLine());

        // create counters for different people groups
        int musalaPeopleCount = 0;
        int monblancPeopleCount = 0;
        int kilimandjaroPeopleCount = 0;
        int k2PeopleCount = 0;
        int everestPeopleCount = 0;

        // create help variable for all people in all groups
        int allPeople = 0;

        // iterate through all groups and check people count in each group
        for (int i = 1; i <= groupsCount; i++) {
            // read people in each group
            int peopleInGroup = Integer.parseInt(scanner.nextLine());

            // add people count to the sum of all people
            allPeople += peopleInGroup;

            // check and sort the people in their appropriate interval
            if (peopleInGroup <= 5) {
                musalaPeopleCount += peopleInGroup;
                // musalaPeopleCount = musalaPeopleCount + peopleInGroup;
            }
            else if (peopleInGroup >= 6 && peopleInGroup <= 12) {
                monblancPeopleCount += peopleInGroup;
                // monblancPeopleCount = monblancPeopleCount + peopleInGroup;
            }
            else if (peopleInGroup >= 13 && peopleInGroup <= 25) {
                kilimandjaroPeopleCount += peopleInGroup;
                // kilimandjaroPeopleCount = kilimandjaroPeopleCount + peopleInGroup;
            }
            else if (peopleInGroup >= 26 && peopleInGroup <= 40) {
                k2PeopleCount += peopleInGroup;
                // k2PeopleCount = k2PeopleCount + peopleInGroup;
            }
            else if (peopleInGroup >= 41) {
                everestPeopleCount += peopleInGroup;
                // everestPeopleCount = everestPeopleCount + peopleInGroup;
            }
        }

        // calculate percentage for each group
        // NOTE: mind the operations with different data types (int and double -> * 1.0)
        System.out.printf("%.2f%%%n", ((1.0 * musalaPeopleCount) / allPeople) * 100);
        System.out.printf("%.2f%%%n", ((1.0 * monblancPeopleCount) / allPeople) * 100);
        System.out.printf("%.2f%%%n", ((1.0 * kilimandjaroPeopleCount) / allPeople) * 100);
        System.out.printf("%.2f%%%n", ((1.0 * k2PeopleCount) / allPeople) * 100);
        System.out.printf("%.2f%%", ((1.0 * everestPeopleCount) / allPeople) * 100);
    }
}
