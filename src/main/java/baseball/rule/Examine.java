package baseball.rule;


public class Examine {
    /*
     *  Manager 객체에게 managerNumber와 playerNumber 를 받아서 결과를 알려줌
     *  - examine: 조사하다
     * */
    StringBuffer mangerNumber;
    StringBuffer playerNumber;

    public int strike_count = 0;
    public int ball_count = 0;

    public Examine(StringBuffer mangerNumber, StringBuffer playerNumber) {
        this.mangerNumber = mangerNumber;
        this.playerNumber = playerNumber;
    }

    public void checkBallCount() {
        /* 입력된 숫자에서 Ball의 갯수를 체크 */
        for (int i = 0; i < DEFINE.INPUT_NUMBER_DIGIT; i++) {
            String playNumberCh = Character.toString(playerNumber.charAt(i));
            if ((mangerNumber.indexOf(playNumberCh) != DEFINE.NOT_EXIST_NUMBER) &&
                    (mangerNumber.indexOf(playNumberCh) != playerNumber.indexOf(playNumberCh))) {
                ball_count += 1;
            }
        }
    }

    public void checkStrikeCount() {
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
        /* build 패턴 적용해봄*/
        GameResult result = GameResult.withCount(strike_count, ball_count);
        result.checkNothing()
                .checkOnlyBall()
                .checkOnlyStrike()
                .checkBallWithStrike();

    }
}
