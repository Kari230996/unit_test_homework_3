/*
 * Задание 1. Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
переданное число четным или нечетным
 */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilTest {

    @Test
    public void testEvenNumber() {
        NumberUtil util = new NumberUtil();
        assertTrue(util.evenOddNumber(4), "Число 4 должно быть четным.");
    }

    @Test
    public void testOddNumber() {
        NumberUtil util = new NumberUtil();
        assertFalse(util.evenOddNumber(7), "Число 7 должно быть нечетным.");
    }

    @Test
    public void testZero() {
        NumberUtil util = new NumberUtil();
        assertTrue(util.evenOddNumber(0), "Ноль должен считаться четным числом.");
    }

    @Test
    public void testNegativeNumber() {
        NumberUtil util = new NumberUtil();
        assertTrue(util.evenOddNumber(-6), "Число -6 должно быть четным.");
    }
}
