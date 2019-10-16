package test;

import com.lamine.Guerrier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuerrierTest {

   @Test
   public void testGuerrierJoueurAttaqueBasique(){
       Guerrier guerrier = new Guerrier("Joueur 1");
       guerrier.sePrsenter("Joueur 1");
       assertEquals(guerrier.toString(), "Woarg je suis le Guerrier Joueur 1 niveau 0 je possède 0 de vitalité, 0 de force, 0 agilité et 0 intelligence !\n");
   }




}