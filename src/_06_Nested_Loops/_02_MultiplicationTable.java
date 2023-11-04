package _06_Nested_Loops;

public class _02_MultiplicationTable {

    public static void main(String[] args) {

        // първи множител 1 до 10
        for (int first = 1; first <= 10; first++) {

            // втори множител 1 до 10
            for (int second = 1; second <= 10; second++) {
                int sum = first * second;
                System.out.println(first + " * " + second + " = " + sum);
            }

        }

    }
}