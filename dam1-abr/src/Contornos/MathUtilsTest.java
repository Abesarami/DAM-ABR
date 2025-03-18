package Contornos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {


    @Test
    void testFactorial(){
        int resultado;

        resultado = MathUtils.factorial(2);
        assertEquals(2,resultado);
        resultado = MathUtils.factorial(8);
        assertEquals(40320,resultado);
        resultado = MathUtils.factorial(6);
        assertEquals(720,resultado);

    }
    @Test
    void testExcepcionFactorial(){

        try {
            MathUtils.factorial(-1);
            fail("no ha dado excepcion");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}