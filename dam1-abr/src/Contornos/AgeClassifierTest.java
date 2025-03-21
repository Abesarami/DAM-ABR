package Contornos;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class AgeClassifierTest {

    @Test
    void test1() {
        assertEquals("Infantil",AgeClassifier.classify(12));
        assertEquals("Adolescente",AgeClassifier.classify(16));
        assertEquals("Adulto",AgeClassifier.classify(34));
        assertEquals("Senior",AgeClassifier.classify(80));

    }
}