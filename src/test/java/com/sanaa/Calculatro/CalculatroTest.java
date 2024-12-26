package com.sanaa.Calculatro;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Assertions;
public class CalculatroTest {
    @ParameterizedTest
    @CsvSource(
            {
                    "1,1,2",
                    "2,3,5",
                    "4,4,8"
            }
    )
    public void testAddition(int x, int y, int z) {
        int result = Calculatro.add(x, y);
        Assertions.assertEquals(z,result,"2+3 doit etre egal a 5");
    }
    @ParameterizedTest
    @CsvSource(
            {
                    "1,1,1",
                    "4,2,2",
                    "4,4,1"
            }
    )
    public void testdivision(int a,int b, int d)
    {
        int r=Calculatro.divide(a,b);
        Assertions.assertEquals(d,r,"4/2 doit etre egal a 2");

    }
}
