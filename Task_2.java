/*
 * Задание 2. Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
переданное число в интервал (25;100)

 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilTest {

    @Test
    public void testNumberInInterval() {
        NumberUtil util = new NumberUtil();
        assertTrue(util.numberInInterval(50), "Число 50 должно попадать в интервал (25;100).");
    }

    @Test
    public void testNumberBelowInterval() {
        NumberUtil util = new NumberUtil();
        assertFalse(util.numberInInterval(24), "Число 24 не должно попадать в интервал (25;100).");
    }

    @Test
    public void testNumberAboveInterval() {
        NumberUtil util = new NumberUtil();
        assertFalse(util.numberInInterval(101), "Число 101 не должно попадать в интервал (25;100).");
    }

    @Test
    public void testNegativeNumber() {
        NumberUtil util = new NumberUtil();
        assertFalse(util.numberInInterval(-5), "Отрицательное число -5 не должно попадать в интервал (25;100).");
    }
}
