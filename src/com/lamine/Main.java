package com.lamine;

public class Main {

    public static void main(String[] args) {

        Guerrier guerrier = new Guerrier("Joueur 1");
        Mage mage = new Mage("Joueur 2");
        Rôdeur rôdeur = new Rôdeur("Joueur 3");
        // la boucle nous permis de créer autant de joueurs qu 'on veut....
        for (int i = 1; i < 3; i++) {
            guerrier.creationPersonnage(1, i);
            mage.creationPersonnage(1, ++i);
        }

        while(! guerrier.estMort()  || !mage.estMort()){
            guerrier.choixAttaque(1,mage);
            if (mage.estMort()) break; // on verifie si l'adversaire est encore vivant car pas la peine de continuer s il est mort
            mage.choixAttaque(1,guerrier);
            if (guerrier.estMort()) break;// la meme chose pour l'adversaire
        }

    }
}
