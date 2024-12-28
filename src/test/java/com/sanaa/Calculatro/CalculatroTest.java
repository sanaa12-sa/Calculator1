package com.sanaa.Calculatro;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatroTest {

    @Test
    public void testAddition() {
        Calculatro calculator = new Calculatro();

        // Cas normal : addition de deux entiers normaux
        int result = calculator.add(10, 20);
        Assertions.assertThat(result).isEqualTo(30);

        // Cas d'exception : dépassement supérieur
        Assertions.assertThatThrownBy(() -> calculator.add(Integer.MAX_VALUE, 1))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("addition dépasse les limites des entiers");

        // Cas d'exception : dépassement inférieur
        Assertions.assertThatThrownBy(() -> calculator.add(Integer.MIN_VALUE, -1))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("addition dépasse les limites des entiers");
    }

    @Test
    public void testDivision() {
        Calculatro calculator = new Calculatro();

        // Cas normal : division
        int result = calculator.divide(10, 2);
        Assertions.assertThat(result).isEqualTo(5);

        // Cas d'exception : division par zéro
        Assertions.assertThatThrownBy(() -> calculator.divide(10, 0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("division par zero");
    }
}
