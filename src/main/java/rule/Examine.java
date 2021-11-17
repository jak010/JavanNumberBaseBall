package rule;

import utils.DEFINE;
import utils.GameResult;


public class Examine {

    StringBuffer mangerNumber;
    StringBuffer playerNumber;

    public int strike_count = 0;
    public int ball_count = 0;

    public Examine(StringBuffer mangerNumber, StringBuffer playerNumber) {
        this.mangerNumber = mangerNumber;
        this.playerNumber = playerNumber;
    }

    public void checkBall() {
        /* 입력된 숫자에서 Ball의 갯수를 체크 */
        for (int i = 0; i < DEFINE.INPUT_NUMBER_DIGIT; i++) {
            String playNumberCh = Character.toString(playerNumber.charAt(i));
            if ((mangerNumber.indexOf(playNumberCh) != DEFINE.NOT_EXIST_NUMBER) &&
                    (mangerNumber.indexOf(playNumberCh) != playerNumber.indexOf(playNumberCh))) {
                ball_count += 1;
            }
        }
    }

    public void checkStrike() {
        /* 입력된 숫자에서 Strike 의 갯수를 체크 */
        for (int i = 0; i < DEFINE.INPUT_NUMBER_DIGIT; i++) {
            String playNumberCh = Character.toString(playerNumber.charAt(i));
            if ((mangerNumber.indexOf(playNumberCh) != DEFINE.NOT_EXIST_NUMBER) &&
                    (mangerNumber.indexOf(playNumberCh) == playerNumber.indexOf(playNumberCh))) {
                strike_count += 1;
            }
        }
    }

    public void score() {
        GameResult result = GameResult.withManager(strike_count, ball_count);

        if (strike_count == 0) {
            result.noThing();
            result.checkOnlyBall();
        }

        if (ball_count == 0) {
            result.noThing();
            result.checkOnlyStrike();
        }

        result.checkBallWithStrike();

    }
}
