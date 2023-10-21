package _04__For.Loop;
import java.util.Scanner;

public class _05_CharacterSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // начало: 0 -> charAt
        // край: дължината - 1
        // промяна: 1

        for (int index = 0; index < text.length(); index++) {
            System.out.println(text.charAt(index));
        }

    }
}