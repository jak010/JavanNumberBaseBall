package baseball.user;

import java.util.Scanner;

import baseball.rule.DEFINE;
import utils.pio.GameInput;

import static baseball.screen.GameMenu.userInputMessage;


public class Player {

    Manager gm; // 매니저 객체
    StringBuffer playerBuffer; // 사용자 입력버퍼 (buffer)

    public Player(Manager manager) {
        this.gm = manager;
        playerBuffer = new StringBuffer(DEFINE.INPUT_NUMBER_DIGIT);
    }

    public static Player readyWithManger(Manager manager) {
        /* 정적 팩토리 메소드를 이용해 메소드 생성 시 가독성 up */
        return new Player(manager);
    }

    public void play(Scanner sc) {
        userInputMessage();
        String number = GameInput.Number(sc);

        playerBuffer.append(number);
        submit(sc);
        playerBuffer.setLength(0);

    }


    public void submit(Scanner sc) {
        gm.setPlayerNumber(playerBuffer);
        gm.verify();
        gm.notify(sc);
    }


}
