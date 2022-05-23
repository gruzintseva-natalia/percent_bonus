import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndMinAmountForOneBonus() {
        long amount = 34;
        boolean registered = true;
        long expected = 1;

        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndMaxAmountForLimitBonus() {
        long amount = 16667;
        boolean registered = true;
        long expected = 500;

        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndMinAmountForOneBonus() {
        long amount = 100;
        boolean registered = false;
        long expected = 1;

        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndMaxAmountForLimitBonus() {
        long amount = 50000;
        boolean registered = false;
        long expected = 500;

        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndMaxAmountForZeroBonus() {
        long amount = 33;
        boolean registered = true;
        long expected = 0;

        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndMaxAmountForOverLimitBonus() {
        long amount = 16668;
        boolean registered = true;
        long expected = 500;

        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndMaxAmountForZeroBonus() {
        long amount = 99;
        boolean registered = false;
        long expected = 0;

        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndMaxAmountForOverLimitBonus() {
        long amount = 50001;
        boolean registered = false;
        long expected = 500;

        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}