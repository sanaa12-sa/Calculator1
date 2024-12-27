package com.sanaa.Calculatro;
import java.util.HashSet;
import java.util.Set;
public class Calculatro {
    public Set<Integer> ensembleChiffres(int pNombre) {
        // Convertir le nombre en sa représentation absolue pour ignorer le signe négatif
        pNombre = Math.abs(pNombre);

        // Créer un ensemble pour stocker les chiffres uniques
        Set<Integer> chiffres = new HashSet<>();

        // Boucle pour extraire chaque chiffre du nombre
        while (pNombre > 0) {
            // Obtenir le dernier chiffre (remainder de la division par 10)
            int chiffre = pNombre % 10;

            // Ajouter le chiffre à l'ensemble
            chiffres.add(chiffre);

            // Supprimer le dernier chiffre du nombre (division entière par 10)
            pNombre /= 10;
        }

        // Retourner l'ensemble des chiffres
        return chiffres;
    }
}

