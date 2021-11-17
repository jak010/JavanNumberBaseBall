package pio;

import utils.DEFINE;
import utils.RandomUtils;

import user.Manager;

public class GameOutput {

    public static StringBuffer generateNumber() {
        /* Player가 맞춰야할 숫자 생성 */
        StringBuffer numberBuffer = new StringBuffer(DEFINE.INPUT_NUMBER_DIGIT);

        while (numberBuffer.length() < DEFINE.INPUT_NUMBER_DIGIT) {
            String number = Integer.toString(RandomUtils.nextInt(1, 9));
            if (numberBuffer.indexOf(number) == DEFINE.NOT_EXIST_NUMBER) {
                numberBuffer.append(number);
            }
        }
        return numberBuffer;
    }
}
