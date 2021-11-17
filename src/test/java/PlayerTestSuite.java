import baseball.user.Manager;
import baseball.user.Player;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import java.util.Scanner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTestSuite {

    public static InputStream generateUserInput(String input) {
        /* Scanner 입력을 위해 테스트로 만든 함수 */
        return new ByteArrayInputStream(input.getBytes());
    }

    @Test
    void when_player_guess_number() {

        // given
        InputStream in = generateUserInput("12");
        System.setIn(in);
        final Scanner scanner = new Scanner(System.in);

        Manager manager = new Manager();
        Player p = Player.readyWithManger(manager);

        // when
        p.guess(scanner);

        // then
        assert p.playerBuffer.length() == 2;

    }

    @Test
    void when_player_guess_number_submit_to_manager() {

        // given
        InputStream in = generateUserInput("123");
        System.setIn(in);
        final Scanner scanner = new Scanner(System.in);

        Manager manager = new Manager();
        Player p = Player.readyWithManger(manager);

        // when
        p.guess(scanner);
        p.submit(scanner);

        // then
        assert p.playerBuffer.length() == 0;

    }

}

