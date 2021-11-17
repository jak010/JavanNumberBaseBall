package user;

import exception.NumberException;
import utils.DEFINE;
import utils.GameInterface;

import java.util.Scanner;


public class Player {

    Manager gm; // 매니저 객체
    public StringBuffer inputBuffer; // 사용자 입력버퍼 (buffer)

    public Player() {
        inputBuffer = new StringBuffer(DEFINE.INPUT_NUMBER_DIGIT);
    }

    public void playWithManager(Manager manager, Scanner sc) {
        this.gm = manager;

        if (inputNumber(sc) == 1) {
            /* player가 입력한 숫자가 유효할 때  */
            submitToManager();
        } else {
            throw new NumberException("3보다 크거나 작을 수 없음");
        }
    }


    public int inputNumber(Scanner sc) {
        GameInterface.userInput();
        String inputNumber = sc.nextLine();

        /* 3보다 크거나 작을 수 없음*/
        if ((inputNumber.length() > DEFINE.INPUT_NUMBER_DIGIT) ||
                (inputNumber.length() < DEFINE.INPUT_NUMBER_DIGIT)) {
            return 0;
        }

        inputBuffer.append(inputNumber);
        sc.reset(); // 입력 버퍼 비워주기
        return 1;
    }

    public void submitToManager() {
        gm.setPlayerNumber(inputBuffer);
    }

}
