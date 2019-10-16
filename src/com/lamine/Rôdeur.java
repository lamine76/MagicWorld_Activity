package com.lamine;

public class Rôdeur extends Personnage {
    private String name;

    public Rôdeur() {
    }

    public Rôdeur(String name) { this.name = name;}

    /**
     * l'attaque basic Rôdeur avec degats contr adversaire egale à son agilité
     * @param cible adversaire
     */

    private void tireAlarc(Personnage cible){
        cible.recevoirDegat(this.agilite);
        while (cible.estMort()) {
            System.out.println(cible.getName()+" a perdu !");
            break;
        }
    }

    /**
     * Attaque spéciale Rôdeur qui lui procure la moitier de son niveau en vie
     */
    private void concentration(){
        this.agilite += this.niveau/2;
        if (this.agilite > this.niveau-(this.force+this.intelligence)) this.agilite = this.niveau-(this.force+this.intelligence); //l'agilité doit avoir un maximum à ne pas dépasser
    }

    @Override
    public void sePrsenter (String name) {
        System.out.println("Woarg je suis le Rôdeur "+ name +" niveau "+niveau+" je possède "+ vie+ " de vitalité, "+force+" de force, "+agilite+" agilité et " +intelligence+" intelligence !");
    }

    @Override
    public void choixAttaque(int choix, Personnage cible) {
        System.out.println(this.getName()+ " ("+ vie + " vitalité ) Veuillez choisir votre action ( 1 : Attaque basique, 2 : Attaque spéciale )" );
        choix = sc.nextInt();
        if (choix == 1) this.tireAlarc(cible);
        else if (choix == 2) this.concentration(); ;
    }

    @Override
    public String getName() {
        return name;
    }
}
