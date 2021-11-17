package user;

import exception.NumberException;
import pio.GameInput;
import utils.DEFINE;
import utils.GameInterface;

import java.util.Scanner;


public class Player extends GameInterface {

    Manager gm; // 매니저 객체
    StringBuffer playerBuffer; // 사용자 입력버퍼 (buffer)
    Scanner userKeyBoardInput;

    public Player(Manager manager) {
        this.gm = manager;
        playerBuffer = new StringBuffer(DEFINE.INPUT_NUMBER_DIGIT);
    }

    public static Player readyWithManger(Manager manager) {
        /* 정적 팩토리 메소드를 이용해 메소드 생성 시 가독성 up */
        return new Player(manager);
    }

    public void play(Scanner sc) {
        userKeyBoardInput = sc;
        userInputMessage();
        String number = GameInput.Number(userKeyBoardInput);
        if (number == null) {
            throw new NumberException("3보다 크거나 작을 수 없음");
        }

        /* player가 입력한 숫자가 유효 */
        playerBuffer.append(number);
        sc.reset();
        submit();
    }


    public void submit() {
        playerBuffer.setLength(0);
        gm.setPlayerNumber(playerBuffer);
        gm.gameToStatus(userKeyBoardInput);

    }


}
