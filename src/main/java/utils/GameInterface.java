package utils;

public class GameInterface {

    public static void userInputMessage() {
        System.out.print("숫자를 입력하세요: ");
    }


    public static void gameEndMessageByManger() {
        System.out.print("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void gameRebootMessageByManger() {
        System.out.print("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
                "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요: ");
    }


}
