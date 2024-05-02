import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DollarTest {
    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
//        Dollar product  = five.times(2);
////        assertEquals(10, product.amount);
//        assertEquals(new Dollar(10), five.times(2));
        assertEquals(Money.dollar(10), five.times(2));
//        product = five.times(3);
////        assertEquals(15, product.amount);
//        assertEquals(new Dollar(15), five.times(3));
        assertEquals(Money.dollar(10), five.times(3));
    }

    public void testFrancMultiplication() {
        Money five = Money.franc(5);
//        Dollar product  = five.times(2);
////        assertEquals(10, product.amount);
        assertEquals(Money.franc(10), five.times(2));
//        product = five.times(3);
////        assertEquals(15, product.amount);
        assertEquals(Money.franc(15), five.times(3));
    }

    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }
}
