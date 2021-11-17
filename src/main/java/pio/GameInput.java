package pio;

import utils.DEFINE;
import utils.GameInterface;

import java.util.Scanner;

public class GameInput {

    public static String Number(Scanner sc) {
        String inputNumber = sc.nextLine();

        /* 3보다 크거나 작을 수 없음*/
        if ((inputNumber.length() > DEFINE.INPUT_NUMBER_DIGIT) ||
                (inputNumber.length() < DEFINE.INPUT_NUMBER_DIGIT)) {
            return null;
        }

        sc.reset(); // 입력 버퍼 비워주기
        return inputNumber;
    }

}
