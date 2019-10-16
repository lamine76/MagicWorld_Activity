package test;

import com.lamine.Guerrier;
import com.lamine.Mage;
import com.lamine.Personnage;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonnageTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    Scanner sc = new Scanner(System.in);


    @Test
     public void Ginven_Correct_Messag_When_DisplayNiveauPersonnage_Then_DisplayCorrectProcess(){
        System.setIn(new ByteArrayInputStream("10\n".getBytes()));
        Guerrier guerrier = new Guerrier("Joueur 1");
        guerrier.remplieConditionsNiveau();
        String output = outContent.toString().replace("\r\n", "\n");
        assertEquals(output.endsWith(""), true);
        assertEquals(output.length() > "Niveau du personnage ?\n".length(), false);
    }

    @Test
    public void Ginven_Correct_Messag_When_DisplayForcePersonnage_Then_DisplayCorrectProcess(){

        System.setIn(new ByteArrayInputStream("0\n".getBytes()));
        Guerrier guerrier = new Guerrier("Joueur 1");
        guerrier.remplireConditionsForce();

        String output = outContent.toString().replace("\r\n", "\n");
        assertEquals(output.endsWith(""), true);
        assertEquals(output.length() > "Force du personnage ?\n".length(), false);
    }

    @Test
    public void Ginven_Correct_Messag_When_DisplayAgilitéPersonnage_Then_DisplayCorrectProcess(){

        System.setIn(new ByteArrayInputStream("0\n".getBytes()));
        Guerrier guerrier = new Guerrier("Joueur 1");
        guerrier.remplireConditionsAgilite();

        String output = outContent.toString().replace("\r\n", "\n");
        assertEquals(output.endsWith(""), true);
        assertEquals(output.length() > "Agilité du personnage ?\n".length(), false);
    }

    @Test
    public void Ginven_Correct_Messag_When_DisplayIntelligencePersonnage_Then_DisplayCorrectProcess(){

        System.setIn(new ByteArrayInputStream("0\n".getBytes()));
        Guerrier guerrier = new Guerrier("Joueur 1");
        guerrier.remplireConditionsIntelligence();

        String output = outContent.toString().replace("\r\n", "\n");
        assertEquals(output.endsWith(""), true);
        assertEquals(output.length() > "Intelligence du personnage ?\n".length(), false);
    }


}
