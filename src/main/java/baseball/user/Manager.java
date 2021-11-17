package baseball.user;

import java.util.Scanner;

import baseball.rule.DEFINE;
import baseball.screen.Display;
import utils.pio.GameOutput;

import baseball.rule.Examine;
import baseball.exception.NumberException;


public class Manager {


    public Examine em = null;

    public StringBuffer playerNumber;
    public StringBuffer managerNumber;

    public boolean gameStatus = true; // 게임의 진행 상태 관리

    public Manager() {
        managerNumber = GameOutput.generateNumber();
    }

    public StringBuffer getManagerNumber() {
        return managerNumber;
    }

    public void setPlayerNumber(StringBuffer playerNumber) {
        this.playerNumber = playerNumber;
    }

    public boolean verify() {
        /* 유저가 입력한 숫자를 검증
         *   - verify 보다 좋은 네이밍을 써야할 듯
         *  */
        if ((playerNumber.length() < DEFINE.INPUT_NUMBER_DIGIT) ||
            (playerNumber.length() > DEFINE.INPUT_NUMBER_DIGIT)) {
            return false;
        }

        em = new Examine(managerNumber, playerNumber);
        em.checkBallCount();
        em.checkStrikeCount();
        return true;
    }

    public void notify(Scanner sc) {
        /* playerNumber의 결과를 표출 */

        if (em.strike_count == DEFINE.MAX_STRIKE) {
            Display.Manager.endMessage();

            /* 게임 종료 */
            if (sc.nextInt() == DEFINE.GAME_END) {
                gameStatus = false;
            }
            managerNumber = GameOutput.generateNumber();

        } else {
            em.score();
        }
    }


}
