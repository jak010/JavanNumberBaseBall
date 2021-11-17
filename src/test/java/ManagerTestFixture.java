import org.junit.jupiter.api.Test;
import user.Player;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class ManagerTestFixture {
    /*
     *   안 되는 것을 위주로 테스트 해보자
     * */

    public static InputStream generateUserInput(String input) {
        return new ByteArrayInputStream(input.getBytes());
    }


    @Test
    public void when_the_player_input_2_number() {
        // given
        InputStream in = generateUserInput("12");
        System.setIn(in);
        final Scanner scanner = new Scanner(System.in);

        // when
        Player p = new Player();

        // Then
        assert p.inputNumber(scanner) == 0;
    }

    @Test
    public void when_the_player_input_4_number() {
        // given
        InputStream in = generateUserInput("1234");
        System.setIn(in);
        final Scanner scanner = new Scanner(System.in);

        // when
        Player p = new Player();

        // Then
        assert p.inputNumber(scanner) == 0;
    }

}
