package utils;

import rule.Examine;


public class GameResult {

    int result_strike_count = 0;
    int result_ball_count = 0;

    public GameResult(int strike_count, int ball_count) {
        this.result_strike_count = strike_count;
        this.result_ball_count = ball_count;
    }

    public static GameResult withManager(int strike_count, int ball_count) {
        return new GameResult(strike_count, ball_count);
    }

    public void checkBallWithStrike() {
        if ((result_strike_count > 0) && ((result_ball_count > 0))) {
            System.out.println(result_ball_count + "볼 " + result_strike_count + "스트라이크");
        }
    }

    public void noThing() {
        if ((result_strike_count == 0) && ((result_ball_count == 0))) {
            System.out.println("낫싱");
        }
    }

    public void checkOnlyStrike() {
        if ((result_strike_count > 0) && ((result_ball_count == 0))) {
            System.out.println(result_strike_count + "스트라이크");
        }
    }
    public void checkOnlyBall() {
        if ((result_strike_count == 0) && ((result_ball_count > 0))) {
            System.out.println(result_ball_count + "볼 ");
        }
    }

}
