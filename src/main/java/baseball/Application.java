package baseball;


import baseball.user.Manager;
import baseball.user.Player;

import java.util.Scanner;


public class Application {

    public static void run(Scanner sc) {

        Manager manager = new Manager();
        Player p1 = Player.readyWithManger(manager);

        while (manager.gameStatus) {
            System.out.println(manager.getManagerNumber());
            p1.guess(sc);
            p1.submit(sc);
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        // TODO 구현 진행
        Application.run(scanner);

    }

}
