package utils.pio;


import java.util.Scanner;

public class GameInput {

    public static String Number(Scanner sc) {
        String inputNumber = Integer.toString(sc.nextInt());
        return inputNumber;
    }

}
