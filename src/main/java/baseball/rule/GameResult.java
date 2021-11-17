package baseball.rule;


public class GameResult {
    /*
     *   Examine 객체에게 strike와 ball의 수(count)를 받아서 n/B, n/S 를 계산해서 알려줌
     * */
    int result_strike_count = 0;
    int result_ball_count = 0;

    public GameResult(int strike_count, int ball_count) {
        this.result_strike_count = strike_count;
        this.result_ball_count = ball_count;
    }

    public static GameResult withCount(int strike_count, int ball_count) {
        return new GameResult(strike_count, ball_count);
    }


    public GameResult checkNothing() {
        if ((result_strike_count == 0) && ((result_ball_count == 0))) {
            System.out.println("낫싱");
        }
        return this;
    }

    public GameResult checkOnlyBall() {
        if ((result_strike_count == 0) && ((result_ball_count > 0))) {
            System.out.println(result_ball_count + "볼 ");
        }
        return this;
    }

    public GameResult checkOnlyStrike() {
        if ((result_strike_count > 0) && ((result_ball_count == 0))) {
            System.out.println(result_strike_count + "스트라이크");
        }
        return this;
    }

    public void checkBallWithStrike() {
        /*
         *  Build 패턴의 마지막 메서드의 호출은 this 를 리턴하지 않아도 되나봄
         * */
        if ((result_strike_count > 0) && ((result_ball_count > 0))) {
            System.out.println(result_ball_count + "볼 " + result_strike_count + "스트라이크");
        }
    }

}
