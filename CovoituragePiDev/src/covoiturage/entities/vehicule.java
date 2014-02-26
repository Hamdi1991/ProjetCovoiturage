/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package covoiturage.entities;

import java.util.Date;

/**
 *
 * @author Bilel
 */
public class vehicule {
    private int id;
    private String marque;
    private String modele;
    private int annee;
    private int nombrePlace;
    private String couleur;
    private int musique;
    private int climatisation;
    private int fumeur;
    private int membre;

    public vehicule() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getNombrePlace() {
        return nombrePlace;
    }

    public void setNombrePlace(int nombrePlace) {
        this.nombrePlace = nombrePlace;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getMusique() {
        return musique;
    }

    public void setMusique(int musique) {
        this.musique = musique;
    }

    public int getClimatisation() {
        return climatisation;
    }

    public void setClimatisation(int climatisation) {
        this.climatisation = climatisation;
    }

    public int getFumeur() {
        return fumeur;
    }

    public void setFumeur(int fumeur) {
        this.fumeur = fumeur;
    }

    public int getMembre() {
        return membre;
    }

    public void setMembre(int membre) {
        this.membre = membre;
    }

  
    
    
}
