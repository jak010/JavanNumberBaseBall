package baseball.user;

import java.util.Scanner;

import baseball.rule.DEFINE;
import utils.pio.GameOutput;

import baseball.rule.Examine;
import baseball.exception.NumberException;

import static baseball.screen.GameMenu.gameEndMessageByManger;


public class Manager {


    public boolean gameStatus = true; // 게임의 진행 상태 관리

    public Examine em = null;

    public StringBuffer playerNumber;
    public StringBuffer managerNumber;

    public Manager() {
        managerNumber = GameOutput.generateNumber();
    }

    public StringBuffer getManagerNumber() {
        return managerNumber;
    }

    public void setPlayerNumber(StringBuffer playerNumber) {
        this.playerNumber = playerNumber;
    }

    public void verify() {
        /* 유저가 입력한 숫자를 검증
         *   - verify 보다 좋은 네이밍을 써야할 듯
         *  */
        if (playerNumber.length() < DEFINE.INPUT_NUMBER_DIGIT) {
            throw new NumberException("3보다 크거나 작을 수 없음");
        }

        em = new Examine(managerNumber, playerNumber);
        em.checkBallCount();
        em.checkStrikeCount();
    }

    public void notify(Scanner sc) {
        /* playerNumber의 결과를 표출 */

        if (em.strike_count == DEFINE.MAX_STRIKE) {
            gameEndMessageByManger();

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
