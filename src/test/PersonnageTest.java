package test;

import com.lamine.Guerrier;
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
        assertEquals( true,outContent.toString().isEmpty());
    }

    @Test
    public void Ginven_Correct_Messag_When_DisplayForcePersonnage_Then_DisplayCorrectProcess(){
        System.setIn(new ByteArrayInputStream("0\n".getBytes()));
        Guerrier guerrier = new Guerrier("Joueur 1");
        guerrier.remplireConditionsForce();
        assertEquals( true,outContent.toString().isEmpty());
    }



    @Test
    public void Ginven_Correct_Messag_When_DisplayAgilitéPersonnage_Then_DisplayCorrectProcess(){

        System.setIn(new ByteArrayInputStream("0\n".getBytes()));
        Guerrier guerrier = new Guerrier("Joueur 1");
        guerrier.remplireConditionsAgilite();
        assertEquals( true,outContent.toString().isEmpty());
    }

    @Test
    public void Ginven_Correct_Messag_When_DisplayIntelligencePersonnage_Then_DisplayCorrectProcess(){

        System.setIn(new ByteArrayInputStream("0\n".getBytes()));
        Guerrier guerrier = new Guerrier("Joueur 1");
        guerrier.remplireConditionsIntelligence();
        assertEquals( true,outContent.toString().isEmpty());
    }


}
