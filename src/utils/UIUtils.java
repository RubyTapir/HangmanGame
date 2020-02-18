package utils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UIUtils {
    public static int readNumber(String message) {
        int result = 0;

        boolean isValid = false;

        do {
            try {
                result = Integer.parseInt(readInput(message));

                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, please try again");
            }

        } while (!isValid);

        return result;
    }

    public static String readInput (String messsage) {
        System.out.println(messsage);

        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }
}
