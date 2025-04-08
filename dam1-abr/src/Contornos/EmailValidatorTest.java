package Contornos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmailValidatorTest {
    //Autor Antonio Besada Ramilo
    @Test
    void testIsValidFalse5() {
        assertEquals(false,EmailValidator.isValid("correo@@@gmail.com"));
    }
    @Test
    void testIsValidFalse6() {
        assertEquals(false,EmailValidator.isValid(null));
    }
    @Test
    void testIsValidFalse7() {
        assertEquals(false,EmailValidator.isValid("correoEjemplo@asdasd"));
    }
    @Test
    void testIsValidFalse8() {
        assertEquals(false,EmailValidator.isValid("@asd.aa"));
    }
    @Test
    void testIsValidTrue() {
        assertEquals(true,EmailValidator.isValid("correoEjemplo@gmail.com"));
    }
}
