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

    /**
     * Creation du personnage avec attribution du choix et numero de Joueur
     * @param choix  le choix de la classe du joueur
     * @param numJoueur Numero du joueur
     */
    public void creationPersonnage(int choix, int numJoueur){
        System.out.println("Création du Personnage du Joueur "+numJoueur);
        choixDeClassJoueur(choix);
        this.caracteristiquePersonnage();
        this.sePrsenter("Joueur "+ numJoueur);
    }

    /**
     * verification du saisi pour la definition de la classe du joueur
     * @param choix la valeur saisie par l'utilisateur
     */
    public void choixDeClassJoueur(int choix) {

        boolean classeIsGood = false;
        do {
            System.out.println("Veuillez choisir la classe de votre  personnage ( 1: Guerrier, 2 : Rôdeur, 3 : Mage)");
            try
            {
                choix = sc.nextInt();
                classeIsGood = (choix == 1 || choix == 2 || choix == 3);
            }
            catch (InputMismatchException e)
            {
                sc.next();
                classeIsGood = false;
            }
            if (classeIsGood) classeIsGood = true;
            else  System.out.println("Vous devez saisir un nombre, correspondant au choix proposés !!");
        }while (!classeIsGood);
    }

    public void remplieConditionsNiveau(){
        boolean niveauIsGood = false;
        do {
            System.out.println("Niveau du personnage ?");
            try {
                this.niveau = sc.nextInt();
                niveauIsGood = (this.getNiveau() > 0 && this.getNiveau() <= 100);
            } catch (InputMismatchException e) {
                sc.next();
                niveauIsGood = false;
            }
            if (niveauIsGood) niveauIsGood = true;
            else System.out.println("Vous devez saisir un nombre entre 0 et 100 !!");
        }while(!niveauIsGood);
    }

    public void remplireConditionsForce(){

        boolean forceIsGood = false;
        do {
            System.out.println("Force du personnage ?");
            try {
                this.force = sc.nextInt();
                forceIsGood = (this.getForce() <= this.getNiveau() && this.getForce() >= 0);
            } catch (InputMismatchException e) {
                sc.next();
                forceIsGood = false;
            }
            if (forceIsGood)  forceIsGood = true;
            else System.out.println("Le force du Joueur doit être positif et ne doit pas dépassée "+this.getNiveau());
        }while (!forceIsGood);
    }

    public void remplireConditionsAgilite(){

        boolean agiliteIsGood = false;
        do {
            System.out.println("Agilité du personnage ?");
            try{
                this.agilite = sc.nextInt();
                agiliteIsGood = (this.getAgilite() <= (this.getNiveau() - this.getForce()) && this.getAgilite() >= 0);
            }catch(InputMismatchException e){
                sc.next();
                agiliteIsGood = false;
            }

            if(agiliteIsGood) agiliteIsGood =true;
            else  System.out.println("L'Agilité du Joueur ne doit pas dépassée "+(this.niveau - this.force));
        }while (!agiliteIsGood);
    }

    public void remplireConditionsIntelligence(){
        boolean intelligenceIsGood = false;

        do {
            System.out.println("Intelligence du personnage ?");
            try{
                this.intelligence = sc.nextInt();
                intelligenceIsGood = (this.getIntelligence() <= (this.getNiveau() - (this.getForce() + this.getAgilite())) && this.getIntelligence() >= 0);
            }catch(InputMismatchException e){
                sc.next();
                intelligenceIsGood = false;
            }

            if(intelligenceIsGood) intelligenceIsGood = true;
            else  System.out.println("L'Intelligence du Joueur ne doit pas dépassée "+(this.niveau - (this.force + this.agilite)));
        }while (!intelligenceIsGood);
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

    /**
     * tout les Personnages doivent recevoires des dégats 'c est le but ici biensur lol!!
     * @param degats geâts recçue
     */

    protected void recevoirDegat(int degats){
        this.vie -= degats;
        System.out.println(this.getName()+" perd "+degats+" points de vie.");
        if (this.vie <= 0){
            vie = 0;
            System.out.println(this.getName()+" est mort.");
        }
    }

    /**
     * es ce que cet Personnage est mort?? pour arréter le jeux biensur et aussi de lui faire plus de dégats lol
     * @return en retourn true s 'il est mort
     */
    protected boolean estMort(){
        return (this.getVie() == 0);

    }

    protected abstract void sePrsenter (String name);
    protected abstract void choixAttaque (int choix, Personnage personnage);
    protected abstract String getName();

    public int getNiveau() {
        return niveau;
    }

    public int getVie() {
        return vie;
    }

    public int getForce() {
        return force;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }


}
