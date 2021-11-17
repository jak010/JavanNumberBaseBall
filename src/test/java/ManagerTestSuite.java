import org.junit.jupiter.api.Test;
import user.Manager;
import user.Player;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;


public class ManagerTestSuite {
    /*
     *   안 되는 것을 위주로 테스트 해보자
     * */

    @Test
    public void when_manager_generate_3_numbers() {

        // given
        Manager manager;
        // when
        manager = new Manager();

        // then
        assert manager.managerNumber.length() == 3;
    }

    @Test
    public void when_manager_verify_1B() {
        // given
        StringBuffer testPlayerNumber = new StringBuffer(3);
        StringBuffer testManagerNumber = new StringBuffer(3);
        Manager manager = new Manager();

        // when
        testManagerNumber.append("123");
        manager.managerNumber = testManagerNumber;

        testPlayerNumber.append("345");
        manager.setPlayerNumber(testPlayerNumber);
        manager.verify();

        // then
        assert manager.em.ball_count == 1;
    }

    @Test
    public void when_manager_verify_2B() {
        // given
        StringBuffer testPlayerNumber = new StringBuffer(3);
        StringBuffer testManagerNumber = new StringBuffer(3);
        Manager manager = new Manager();

        // when
        testManagerNumber.append("123");
        manager.managerNumber = testManagerNumber;

        testPlayerNumber.append("234");
        manager.setPlayerNumber(testPlayerNumber);
        manager.verify();

        // then
        assert manager.em.ball_count == 2;
    }

    @Test
    public void when_manager_verify_3B() {
        // given
        StringBuffer testPlayerNumber = new StringBuffer(3);
        StringBuffer testManagerNumber = new StringBuffer(3);
        Manager manager = new Manager();

        // when
        testManagerNumber.append("123");
        manager.managerNumber = testManagerNumber;

        testPlayerNumber.append("312");
        manager.setPlayerNumber(testPlayerNumber);
        manager.verify();

        // then
        assert manager.em.ball_count == 3;
    }

}
