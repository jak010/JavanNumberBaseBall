import baseball.user.Player;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import baseball.user.Manager;

public class ManagerActionTestSuite {

    public static InputStream generateUserInput(String input) {
        /* Scanner 입력을 위해 테스트로 만든 함수 */
        return new ByteArrayInputStream(input.getBytes());
    }

    @Test
    void when_manager_verify_2_number_of_player() {
        // given
        InputStream in = generateUserInput("12");
        System.setIn(in);
        final Scanner scanner = new Scanner(System.in);

        // When
        Manager manager = new Manager();

        Player p = Player.readyWithManger(manager);
        p.guess(scanner);

        manager.playerNumber = p.playerBuffer;

        // Then
        assertFalse(manager.verify());
    }

    @Test
    void when_manager_verify_4_number_of_player() {
        // given
        InputStream in = generateUserInput("1234");
        System.setIn(in);
        final Scanner scanner = new Scanner(System.in);

        // When
        Manager manager = new Manager();

        Player p = Player.readyWithManger(manager);
        p.guess(scanner);

        manager.playerNumber = p.playerBuffer;

        // Then
        assertFalse(manager.verify());
    }

}
