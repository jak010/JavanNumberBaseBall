package baseball.screen;

public class Display {

    public static class User {
        public static void inputMessage() {
            System.out.print("숫자를 입력하세요: ");

        }
    }

    public static class Manager {
        public static void endMessage() {
            System.out.print("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
                    "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n ");

        }
    }


}
