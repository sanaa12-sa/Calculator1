package com.sanaa.Calculatro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CalculatroTest {
    Calculatro ca;
    @BeforeEach
    public void setup() {
    ca = new Calculatro();
    System.out.println("Calculatrice utilisation");}
    @AfterEach
    public void tearDown() {
    System.out.println("nettoyage");
    ca=null;}
    @Test
    public void testAddition() {
        int result = ca.add(2, 3);
        Assertions.assertEquals(5,result,"2+3 doit etre egal a 5");
    }
    @Test
    public void testdivision()
    {
        Calculatro c=new Calculatro();
        int r=c.divide(4,2);
        Assertions.assertEquals(2,r,"4/2 doit etre egal a 2");

    }
}
