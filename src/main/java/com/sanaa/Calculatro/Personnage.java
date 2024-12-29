package com.sanaa.Calculatro;
public class Personnage {
    private String[] orientations = {"NORD", "EST", "SUD", "OUEST"};
    public String tourner(int fois) {
        if(fois<0){
            fois+=4;
        }
        int i = (fois % 4);
        return orientations[i];
    }
}
