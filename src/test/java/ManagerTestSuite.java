import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import user.Manager;


public class ManagerTestSuite {

    @Test
    @DisplayName("랜덤 넘버 생성 테스트 ")
    public void when_manager_generate_3_numbers() {

        // given
        Manager manager;
        // when
        manager = new Manager();

        // then
        assert manager.managerNumber.length() == 3;
    }

    @Test
    @DisplayName("1볼 테스트")
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
    @DisplayName("2볼 테스트")
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
    @DisplayName("3볼 테스트")
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

    @Test
    @DisplayName("1볼 1스트라이크 테스트")
    public void when_manager_verify_1B_1S() {
        // given
        StringBuffer testPlayerNumber = new StringBuffer(3);
        StringBuffer testManagerNumber = new StringBuffer(3);
        Manager manager = new Manager();

        // when
        testManagerNumber.append("123");
        manager.managerNumber = testManagerNumber;

        testPlayerNumber.append("329");
        manager.setPlayerNumber(testPlayerNumber);
        manager.verify();

        // then

        assertEquals(1, manager.em.ball_count);
        assertEquals(1, manager.em.strike_count);

    }

    @Test
    @DisplayName("2볼 1스트라이크 테스트")
    public void when_manager_verify_2B_1S() {
        // given
        StringBuffer testPlayerNumber = new StringBuffer(3);
        StringBuffer testManagerNumber = new StringBuffer(3);
        Manager manager = new Manager();

        // when
        testManagerNumber.append("123");
        manager.managerNumber = testManagerNumber;

        testPlayerNumber.append("132");
        manager.setPlayerNumber(testPlayerNumber);
        manager.verify();

        // then
        assertEquals(2, manager.em.ball_count);
        assertEquals(1, manager.em.strike_count);

    }

    @Test
    @DisplayName("1스트라이크 테스트")
    public void when_manager_verify_1S() {
        // given
        StringBuffer testPlayerNumber = new StringBuffer(3);
        StringBuffer testManagerNumber = new StringBuffer(3);
        Manager manager = new Manager();

        // when
        testManagerNumber.append("123");
        manager.managerNumber = testManagerNumber;

        testPlayerNumber.append("189");
        manager.setPlayerNumber(testPlayerNumber);
        manager.verify();

        // then
        assertEquals(0, manager.em.ball_count);
        assertEquals(1, manager.em.strike_count);

    }

    @Test
    @DisplayName("2스트라이크 테스트")
    public void when_manager_verify_2S() {
        // given
        StringBuffer testPlayerNumber = new StringBuffer(3);
        StringBuffer testManagerNumber = new StringBuffer(3);
        Manager manager = new Manager();

        // when
        testManagerNumber.append("123");
        manager.managerNumber = testManagerNumber;

        testPlayerNumber.append("124");
        manager.setPlayerNumber(testPlayerNumber);
        manager.verify();

        // then
        assertEquals(0, manager.em.ball_count);
        assertEquals(2, manager.em.strike_count);

    }

    @Test
    @DisplayName("3스트라이크 테스트")
    public void when_manager_verify_3S() {
        // given
        StringBuffer testPlayerNumber = new StringBuffer(3);
        StringBuffer testManagerNumber = new StringBuffer(3);
        Manager manager = new Manager();

        // when
        testManagerNumber.append("123");
        manager.managerNumber = testManagerNumber;

        testPlayerNumber.append("123");
        manager.setPlayerNumber(testPlayerNumber);
        manager.verify();

        // then
        assertEquals(0, manager.em.ball_count);
        assertEquals(3, manager.em.strike_count);

    }

}
