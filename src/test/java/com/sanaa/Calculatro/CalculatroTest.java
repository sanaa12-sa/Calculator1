package com.sanaa.Calculatro;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatroTest {

    @Test
    public void testAddition() {
        Calculatro calculator = new Calculatro();

        // Cas normal : addition simple
        int result = calculator.add(10, 20);
        assertEquals(30, result);

        // Cas d'exception : addition dépasse Integer.MAX_VALUE
        ArithmeticException exception1 = assertThrows(
                ArithmeticException.class,
                () -> calculator.add(Integer.MAX_VALUE, 1)
        );
        assertEquals("addition dépasse les limites des entiers", exception1.getMessage());

        // Cas d'exception : addition dépasse Integer.MIN_VALUE
        ArithmeticException exception2 = assertThrows(
                ArithmeticException.class,
                () -> calculator.add(Integer.MIN_VALUE, -1)
        );
        assertEquals("addition dépasse les limites des entiers", exception2.getMessage());
    }

    @Test
    public void testDivision() {
        Calculatro calculator = new Calculatro();

        // Cas normal : division simple
        int result = calculator.divide(10, 2);
        assertEquals(5, result);

        // Cas d'exception : division par zéro
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );
        assertEquals("division par zero", exception.getMessage());
    }
}
