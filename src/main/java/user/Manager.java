package user;

import pio.GameOutput;
import rule.Examine;
import utils.DEFINE;
import utils.GameInterface;
import utils.GameResult;

import java.util.Scanner;

public class Manager extends GameInterface {


    public boolean gameStatus = true; // 게임의 진행 상태 관리

    public Examine em = null;

    public StringBuffer playerNumber;

    public StringBuffer getManagerNumber() {
        return managerNumber;
    }

    public StringBuffer managerNumber;

    public Manager() {
        managerNumber = GameOutput.generateNumber();
    }


    public void setPlayerNumber(StringBuffer playerNumber) {
        this.playerNumber = playerNumber;
    }



    public void verify() {
        /* 유저가 입력한 숫자를 검증 */
        em = new Examine(managerNumber, playerNumber);
        em.checkBall();
        em.checkStrike();
    }

    public boolean gameToStatus(Scanner sc) {
        verify(); // player 입력 값에 결과 도출

        /* Player에게 게임을 끝낼건지 물어볼자
         *  - When?,  3 strike 일 때
         * */
        if (em.strike_count == DEFINE.MAX_STRIKE) {
            gameEndMessageByManger();
            gameRebootMessageByManger();
            if (sc.nextInt() == DEFINE.GAME_END) gameStatus = false;
        } else {
            em.score();
        }
        return true;
    }


}
