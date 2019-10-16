package com.lamine;

import java.util.Scanner;

public class Guerrier extends Personnage {
    Scanner sc = new Scanner(System.in);
    private String name;

    public Guerrier() {

    }

    public Guerrier(int niveau, int force, int agilite, int intelligence, String name) {
        super(niveau, force, agilite, intelligence);
        this.name = name;
    }

    @Override
    public void sePrsenter(String name) {

    }

    @Override
    public void choixAttaque(int choix, Personnage personnage) {

    }

    @Override
    public String getName() {
        return null;
    }

    public Guerrier(String name) {
        this.name = name;
    }

}
