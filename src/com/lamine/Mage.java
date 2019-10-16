package com.lamine;

import java.util.Scanner;

public class Mage extends Personnage{

    Scanner sc = new Scanner(System.in);
    private String name;

    public Mage() {

    }

    public Mage(String name) {
        this.name = name;
    }

    /**
     * attaque basique du Mage avec degat égle à son intelligence
     * @param cible le joueur adverse
     */

    private void bouleDeFeu(Personnage cible){
        System.out.println(this.getName() + " utilise boule de feu et inflige "+this.getIntelligence()+ " de dommage.");
        cible.recevoirDegat(this.intelligence);
        while (cible.estMort()) {
            System.out.println(cible.getName()+" a perdu !");
            break;
        }
    }

    /**
     * attaque special du Mage qui lui procure deux fois de son intelligence de vie supplimentaire
     */
    private void soin(){
        this.vie += this.intelligence*2;

        //pour éviter que la vie depasse la limite
        if (this.vie > this.niveau*5) {
            this.vie = this.niveau*5;
        }
        System.out.println(this.getName()+" utilise Soin et gagne "+this.intelligence*2+" en vitalité.");
    }

    @Override
    public void sePrsenter (String name) {
        System.out.println("Abracadabra je suis le Mage "+ name +" niveau "+niveau+" je possède "+ vie+ " vitalité, "+force+" de force, "+agilite+" agilité et " +intelligence+" intelligence !");
    }

    @Override
    public void choixAttaque(int choix, Personnage cible) {
        System.out.println(this.getName()+" ("+ vie + " de vitalité ) Veuillez choisir votre action ( 1 : Attaque basique, 2 : Attaque spéciale )" );
        choix = sc.nextInt();
        if (choix == 1) this.bouleDeFeu(cible);
        else if (choix == 2) this.soin();
    }

    @Override
    public String getName() {
        return name;
    }
}
