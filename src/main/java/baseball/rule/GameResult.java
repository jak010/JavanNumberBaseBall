package baseball.rule;


public class GameResult {

    /*
     *   Examine 객체에게 strike와 ball의 수(count)를 받아서 n/B, n/S 를 계산해서 알려줌
     * */
    int resultStrikeCount = 0;
    int resultBallCount = 0;

    int gameCode = 0;

    public GameResult(int strike_count, int ball_count) {
        this.resultStrikeCount = strike_count;
        this.resultBallCount = ball_count;
    }

    public static GameResult withCount(int strike_count, int ball_count) {
        return new GameResult(strike_count, ball_count);
    }


    public GameResult checkNothing() {
        if ((resultStrikeCount == 0) && ((resultBallCount == 0))) {
            this.gameCode = DEFINE.NOTHING;
        }
        return this;
    }

    public GameResult checkOnlyBall() {
        if ((resultStrikeCount == 0) && ((resultBallCount > 0))) {
            this.gameCode = DEFINE.ONLY_BALL;
        }
        return this;
    }

    public GameResult checkOnlyStrike() {
        if ((resultStrikeCount > 0) && ((resultBallCount == 0))) {
            this.gameCode = DEFINE.ONLY_STRIKE;
        }
        return this;
    }

    public GameResult checkBallWithStrike() {

        if ((resultStrikeCount > 0) && ((resultBallCount > 0))) {
            this.gameCode = DEFINE.BALL_OR_STRIKE;
        }
        return this;
    }

    public void release() {
        /*
         *  Build 패턴의 마지막 메서드의 호출은 this 를 리턴하지 않아도 되나봄
         * */

        if (gameCode == DEFINE.NOTHING) {
            System.out.println("낫싱");
        } else if (gameCode == DEFINE.ONLY_BALL) {
            System.out.println(resultBallCount + "볼 ");
        } else if (gameCode == DEFINE.ONLY_STRIKE) {
            System.out.println(resultStrikeCount + "스트라이크");
        } else if (gameCode == DEFINE.BALL_OR_STRIKE) {
            System.out.println(resultBallCount + "볼 " + resultStrikeCount + "스트라이크");
        }
    }
}
