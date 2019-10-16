package test;

import com.lamine.Guerrier;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {

    @Test
    public final void Given_MessageGuerrier_When_displayChoiSelected_Then_DisplayMessageGuerrier(){
        Guerrier guerrier = new Guerrier(10,10,0,0,"Joueur 1");
        guerrier.choixDeClassJoueur(1);
        guerrier.sePrsenter("Joueur "+ 1);
        assertEquals("Création du Personnage du Joueur 1 \n", guerrier.toString().replace("\r\n", "\n"));
        assertEquals("Woarg je suis le Guerrier Joueur 1 niveau 10 je possède  50 de vitalité, 10 de force, 0 agilité et 0 intelligence ! \n", guerrier.toString().replace("\r\n", "\n"));
    }
}
