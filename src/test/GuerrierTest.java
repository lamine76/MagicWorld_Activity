package test;

import com.lamine.Guerrier;
import com.lamine.Mage;
import com.lamine.Personnage;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GuerrierTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    Scanner sc = new Scanner(System.in);

   @Test
   public void testGuerrierJoueurAttaqueBasique(){
       Guerrier guerrier = new Guerrier("Joueur 1");
       guerrier.sePrsenter("Joueur 1");
       assertEquals( true,outContent.toString().isEmpty());
   }

   @Test
    public void testGuerrierAttaqueBasique(){
       Guerrier guerrier = new Guerrier("Joueur 1");
       Mage mage = new Mage("Joueur 2");
       guerrier.couDepee(mage);
       assertEquals( true,outContent.toString().isEmpty());
   }

    @Test
    public void testGuerrierAttaqueSpeciale(){
        Guerrier guerrier = new Guerrier("Joueur 1");
        Mage mage = new Mage("Joueur 2");
        guerrier.couDeRage(mage);
        assertEquals( true,outContent.toString().isEmpty());
    }
}