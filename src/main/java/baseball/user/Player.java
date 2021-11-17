package baseball.user;

import java.util.Scanner;

import baseball.rule.DEFINE;
import baseball.screen.Display;
import utils.pio.GameInput;


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

    public void guess(Scanner sc) {
        Display.User.inputMessage();
        playerBuffer.append(GameInput.Number(sc));

    }


    public void submit(Scanner sc) {
        gm.setPlayerNumber(playerBuffer);
        gm.verify(); // 1. 검증하고
        gm.notify(sc); // 2. 결과를 받고
        playerBuffer.setLength(0); // 3. buffer를 비워줌
    }


}
