package com.sanaa.Calculatro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class PersonnageTest {
    @Test
    public void OR_NORD(){
        Personnage p=new Personnage();
        String r=p.tourner(0);
        Assertions.assertEquals("NORD",r,"Orientation devrait etre NORD");
    }
    @Test
    public void OR_EST(){
        Personnage p=new Personnage();
        String r=p.tourner(1);
        Assertions.assertEquals("EST",r,"Orientation devrait etre EST");
    }
    @Test
    public void OR_SUD(){
        Personnage p=new Personnage();
        String r=p.tourner(2);
        Assertions.assertEquals("SUD",r,"Orientation devrait etre SUD");
    }
    @Test
    public void OR_OUEST(){
        Personnage p=new Personnage();
        String r=p.tourner(3);
        Assertions.assertEquals("OUEST",r,"Orientation devrait etre OUEST");
    }
    @Test
    public void OR_SUD_negatif(){
        Personnage p =new Personnage();
        String r=p.tourner(-2);
        Assertions.assertEquals("SUD",r,"Orientation devrait etre SUD");
    }
}
