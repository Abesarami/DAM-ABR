package Contornos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

public class DiscountSystemTest {
    //Autor Antonio Besada Ramilo
    @Test
    void testApplyDiscountCero() {
     assertNotEquals( 0.0, DiscountSystem.applyDiscount(0, true), 0);
    }
    @Test
    void testApplyDiscountCincuenta() {
        assertEquals(47.5, DiscountSystem.applyDiscount(50, false), 0);
    }

    @Test
    void testApplyDiscountCien() {
        assertEquals(90, DiscountSystem.applyDiscount(100, true), 0);
    }

    @Test
    void testApplyDiscountDoscientosLoyal() {
        assertEquals(170, DiscountSystem.applyDiscount(200, true), 0);
    }

    @Test
    void testApplyDiscountDoscientosNotLoyal() {
        assertEquals(180, DiscountSystem.applyDiscount(200, false), 0);

    }
}
