package _06_Nested.Loops;

import java.util.Scanner;

public class _05_Travelling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Прочинатане на дестинацията
        String input = scanner.nextLine();

        // повраеяне: въвеждане на водни данни дестинация или End
        // спираме: входните данни са == End
        // продължаваме: входните данни != End
        while (!input.equals("End")){

            // нужните пари за въведената дестинация
            double needMoney = Double.parseDouble(scanner.nextLine());

            // спестяване
            // повтоаряне: въвеждане на сума + спестяване
            // спиране: спестените пари >= needMoney
            // продължаваме: спестените пари <= NeedMoney
            double savedMoney = Double.parseDouble(scanner.nextLine());
            while (savedMoney < needMoney){
                // спестените пари
                double sumForSave = Double.parseDouble(scanner.nextLine());
                savedMoney += sumForSave;
            }

            // има наличната сума: savedMoney => needMoney ->  отива на почивка
            System.out.println( "Going to " + input + "!" );


            input = scanner.nextLine();

        }

    }


}
