package com.sanaa.Calculatro;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculatroTest {
    @Test
    public void testAddition() {
        Calculatro calculator = new Calculatro();
        int result = calculator.add(2, 3);
        Assertions.assertThat(result).isEqualTo(5);
    }
    @Test
    public void testdivision()
    {
        Calculatro c=new Calculatro();
        int r=c.divide(4,2);
        Assertions.assertThat(r).isEqualTo(2);

    }
}
