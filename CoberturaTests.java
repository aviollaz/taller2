package aed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CoberturaTests {
    Cobertura cobertura = new Cobertura();

    @Test
    void testFizzBuzz() {
        assertEquals("Fizz",cobertura.fizzBuzz(3));
        assertEquals("Buzz",cobertura.fizzBuzz(5));
        assertEquals("FizzBuzz",cobertura.fizzBuzz(15));
        assertEquals("7",cobertura.fizzBuzz(7));
    }

    @Test
    void testNumeroCombinatorio() {
        assertTrue(cobertura.numeroCombinatorio(1, 1) == 1);
        assertTrue(cobertura.numeroCombinatorio(3, 0) == 1);
        assertTrue(cobertura.numeroCombinatorio(1, 5) == 0);
        assertTrue(cobertura.numeroCombinatorio(3, 2) == 3);
    }

    @Test
    void testRepeticionesConsecutivas() {
        assertTrue(cobertura.repeticionesConsecutivas(new int[]{}) == 0);
        assertTrue(cobertura.repeticionesConsecutivas(new int[]{1,2,2,2,1}) == 3);
    }
}
