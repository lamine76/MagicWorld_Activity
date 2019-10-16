package com.lamine;

import java.util.Scanner;

public class Guerrier extends Personnage {
    private String name;
    Scanner sc = new Scanner(System.in);

    public Guerrier() {

    }

    public Guerrier(String name) {
        this.name = name;
    }

    /**
     * Attaque basique Guerrier avec degâts contre l'adversaire equivalente à sa force
     * @param cible adversaire
     */
    private void couDepee(Personnage cible){
        System.out.println(this.getName() + " utilise coup d'Epée et inflige "+this.getForce()+ " de dommages.");
        cible.recevoirDegat(this.force);

        while (cible.estMort()) {
            System.out.println(cible.getName()+" a perdu !");
            break;
        }

    }

    /**
     * Attaque spéciale Guerrier avec Dégât égale à deux fois sa force contre son advesaire mais lui côute aussi la moitier de sa force en vie et oui il faut payer lol!!!
     * @param cible advesaire en parametres
     */
    private void couDeRage(Personnage cible){
        System.out.println(this.getName() + " utilise coup de rage et inflige "+this.getForce()*2+ " de dommages.");
        cible.recevoirDegat(this.force*2);
        this.vie -= this.force/2;
        System.out.println(this.getName()+" perd "+this.force/2+" points de vie.");
        while (cible.estMort()) {
            System.out.println(cible.getName()+" a perdu!");
            break;
        }
    }
    @Override
    public void sePrsenter(String name) {
        System.out.println("Woarg je suis le Guerrier "+ name +" niveau "+niveau+" je possède "+ vie + " de vitalité, "+force+" de force, "+agilite+" agilité et " +intelligence+" intelligence !");
    }

    @Override
    public void choixAttaque(int choix, Personnage cible) {
        System.out.println(this.getName()+ " ("+ vie + " vitalité ) Veuillez choisir votre action ( 1 : Attaque basique, 2 : Attaque spéciale )" );
        choix = sc.nextInt();
        if (choix == 1) this.couDepee(cible);
        else if (choix == 2) this.couDeRage(cible);
    }

    @Override
    public String getName() {
        return name;
    }
}
