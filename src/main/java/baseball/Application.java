package baseball;

import org.graalvm.compiler.asm.amd64.AMD64Assembler;
import user.Manager;
import user.Player;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Application {


    static void run(Scanner sc) {

        Manager manager = new Manager();
        Player p1 = new Player();

        while (manager.endGameNow) {
            p1.playWithManager(manager, sc);
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        // TODO 구현 진행
        Application.run(scanner);

    }
}
