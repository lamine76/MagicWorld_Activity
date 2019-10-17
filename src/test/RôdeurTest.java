package test;

import com.lamine.Guerrier;
import com.lamine.Mage;
import com.lamine.Rôdeur;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class RôdeurTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    Scanner sc = new Scanner(System.in);

    @Test
    public void testRôdeurPresentation(){
        Rôdeur rôdeur = new Rôdeur("Joueur 3");
        rôdeur.sePrsenter("Joueur 3");
        assertEquals( true,outContent.toString().isEmpty());
    }

    @Test
    public void testRôdeurAttaqueBasique(){
        Rôdeur rôdeur = new Rôdeur("Joueur 3");
        Guerrier guerrier = new Guerrier("Joueur 1");
        rôdeur.tireAlarc(guerrier);
        assertEquals( true,outContent.toString().isEmpty());
    }

    @Test
    public void testRôdeurAttaqueSpeciale(){
        Rôdeur rôdeur = new Rôdeur("Joueur 3");
        rôdeur.concentration();
        assertEquals( true,outContent.toString().isEmpty());
    }
}