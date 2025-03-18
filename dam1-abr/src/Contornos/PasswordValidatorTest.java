package Contornos;

import org.junit.jupiter.api.Test;

import static Contornos.PasswordValidator.isValid;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

class PasswordValidatorTest {

    @Test
    void isValidtest() {
        assertEquals(true,isValid("Abc12342"));

    }
    @Test
    void isValidtest2() {
        assertEquals(false,isValid("34dasdas2asd1341"));

    }
    @Test
    void isValidtest3() {
        assertEquals(false,isValid(""));

    }
    @Test
    void isValidtest4() {
        assertEquals(false,isValid("dsfAASDFdsfafdasf"));

    }

}