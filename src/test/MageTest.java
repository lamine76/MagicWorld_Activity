package test;

import com.lamine.Guerrier;
import com.lamine.Mage;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    Scanner sc = new Scanner(System.in);

    @Test
    public void testMagePresentation(){
        Mage mage = new Mage("Joueur 2");
        mage.sePrsenter("Joueur 2");
        assertEquals( true,outContent.toString().isEmpty());
    }

    @Test
    public void testMageAttaqueBasique(){
        Mage mage = new Mage("Joueur 2");
        Guerrier guerrier = new Guerrier("Joueur 1");
        mage.bouleDeFeu(guerrier);
        assertEquals( true,outContent.toString().isEmpty());
    }

    @Test
    public void testMageAttaqueSpeciale(){
        Mage mage = new Mage("Joueur 2");
        mage.soin();
        assertEquals( true,outContent.toString().isEmpty());
    }

}