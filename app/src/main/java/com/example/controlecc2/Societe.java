package com.example.controlecc2;

import java.io.Serializable;

public class Societe implements Serializable {
    private int id;
    private String Nom;
    private String Secteur;
    private int NbEmploye;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        this.Nom = nom;
    }

    public String getSecteur() {
        return Secteur;
    }

    public void setSecteur(String secteur) {
        this.Secteur = secteur;
    }

    public int getNbEmploye() {
        return NbEmploye;
    }

    public void setNbEmploye(int nbEmploye) {
        this.NbEmploye = nbEmploye;
    }

    public Societe() {
    }

    public Societe(int id, String nom, String secteur, int nbEmploye) {
        this.id = id;
        this.Nom = nom;
        this.Secteur = secteur;
        this.NbEmploye = nbEmploye;
    }

    public Societe(String nom, String secteur, int nbEmploye) {
        this.Nom = nom;
        this.Secteur = secteur;
        this.NbEmploye = nbEmploye;
    }

}



