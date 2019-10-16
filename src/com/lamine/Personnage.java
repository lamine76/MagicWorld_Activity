package com.lamine;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Personnage {

    Scanner sc = new Scanner(System.in);
    protected int niveau;
    protected int vie ;
    protected int force;
    protected int agilite;
    protected int intelligence;

    public Personnage() {
    }

    public Personnage(int niveau, int force, int agilite, int intelligence) {
        this.niveau = niveau;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
    }

    protected abstract void sePrsenter (String name);
    protected abstract void choixAttaque (int choix, Personnage personnage);
    protected abstract String getName();

    /**
     * Creation du personnage avec attribution du choix et numero de Joueur
     * @param choix  le choix de la classe du joueur
     * @param numJoueur Numero du joueur
     */
    public void creationPersonnage(int choix, int numJoueur){

    }

    /**
     * verification du saisi pour la definition de la classe du joueur
     * @param choix la valeur saisie par l'utilisateur
     */
    public void choixDeClassJoueur(int choix){

    }

    private void remplieConditionsNiveau(){

    }

    private void remplireConditionsForce(){


    }

    private void remplireConditionsAgilite(){


    }

    private void remplireConditionsIntelligence(){

    }

    /**
     * enregistrement des caracteristiques du joueur données par l'utilisateur
     */
    public void caracteristiquePersonnage(){
        remplieConditionsNiveau();
        remplireConditionsForce();
        remplireConditionsAgilite();
        remplireConditionsIntelligence();
        this.vie = niveau * 5;
    }


}
