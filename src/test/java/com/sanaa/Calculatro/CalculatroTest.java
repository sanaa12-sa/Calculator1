package com.sanaa.Calculatro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Set;

public class CalculatroTest{
     @Test
    public void testEnsembleChiffres() {
        Calculatro calc = new Calculatro();

        // Test avec un nombre positif
        Set<Integer> result1 = calc.ensembleChiffres(7679);
        Assertions.assertEquals(Set.of(6, 7, 9), result1);

        // Test avec un nombre négatif
        Set<Integer> result2 = calc.ensembleChiffres(-11);
        Assertions.assertEquals(Set.of(1), result2);

        // Test avec un seul chiffre
        Set<Integer> result3 = calc.ensembleChiffres(0);
        Assertions.assertEquals(Set.of(), result3); // Ensemble vide
    }
}

