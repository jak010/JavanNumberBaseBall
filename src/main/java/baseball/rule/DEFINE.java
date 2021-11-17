package baseball.rule;

public interface DEFINE {

    int INPUT_NUMBER_DIGIT = 3; /* 입력받을 숫자 */

    int NOT_EXIST_NUMBER = -1; /* StringBuffer의 indexOf() 호출하여 실패 시 따로 정의 */

    int MAX_STRIKE = 3; /*  최대 스트라이크 수 */

    int GAME_END = 2; /* 게임 종료 값 정의 */

    /* GAME CODE */

    int NOTHING = 990; // Nothing;

    int ONLY_BALL = 991; // ONLY BALL;

    int ONLY_STRIKE = 992; // ONLY STRIKE;

    int BALL_OR_STRIKE = 993; // BALL or STRIKE


}
