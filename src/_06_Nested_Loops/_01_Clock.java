package _06_Nested_Loops;

public class _01_Clock {

    public static void main(String[] args) {

        // часове: 0 д0 23
        for (int hour = 0; hour <= 23 ; hour++) {
            // минути: 0 до 59
            for (int minute = 0; minute <= 59 ; minute++) {
                System.out.println(hour + ":" + minute);
            }
        }

    }
}