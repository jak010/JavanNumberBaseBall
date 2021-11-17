import org.junit.jupiter.api.Test;
import utils.pio.GameInput;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class PioTestSuite {
    public static InputStream generateUserInput(String input) {
        /* Scanner 입력을 위해 테스트로 만든 함수 */
        return new ByteArrayInputStream(input.getBytes());
    }

    @Test
    public void when_the_game_input_2_number() {
        // given
        InputStream in = generateUserInput("12");
        System.setIn(in);
        // when
        final Scanner scanner = new Scanner(System.in);
        // Then
        assert GameInput.Number(scanner) == null;

    }

    @Test
    public void when_the_game_input_4_number() {
        // given
        InputStream in = generateUserInput("1234");
        System.setIn(in);
        // when
        final Scanner scanner = new Scanner(System.in);
        // Then
        assert GameInput.Number(scanner) == null;
    }
}
