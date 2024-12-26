package com.sanaa.Calculatro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculatroTest {
    @Test
    public void testAddition() {
        int result = Calculatro.add(2, 3);
        Assertions.assertEquals(5,result,"2+3 doit etre egal a 5");
    }
    @Test
    public void testdivision()
    {
        int r=Calculatro.divide(4,2);
        Assertions.assertEquals(2,r,"4/2 doit etre egal a 2");

    }
}
