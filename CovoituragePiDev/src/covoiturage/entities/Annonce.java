/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package covoiturage.entities;

/**
 *
 * @author Bilel
 */
public class Annonce {
    private int id;
    private String ville_depart;
    private String ville_arrivee;
    private String date_trajet;
    private String duree_estimee;
    private float distance;
    private float longitude_depart;
    private float latitude_depart;
    private float longitude_arrivee;
    private float latitude_arrivee;
    private membre membre;

    public membre getMembre() {
        return membre;
    }

    public void setMembre(membre membre) {
        this.membre = membre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVille_depart() {
        return ville_depart;
    }

    public void setVille_depart(String ville_depart) {
        this.ville_depart = ville_depart;
    }

    public String getVille_arrivee() {
        return ville_arrivee;
    }

    public void setVille_arrivee(String ville_arrivee) {
        this.ville_arrivee = ville_arrivee;
    }

    public String getDate_trajet() {
        return date_trajet;
    }

    public void setDate_trajet(String date_trajet) {
        this.date_trajet = date_trajet;
    }

    public String getDuree_estimee() {
        return duree_estimee;
    }

    public void setDuree_estimee(String duree_estimee) {
        this.duree_estimee = duree_estimee;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getLongitude_depart() {
        return longitude_depart;
    }

    public void setLongitude_depart(float longitude_depart) {
        this.longitude_depart = longitude_depart;
    }

    public float getLatitude_depart() {
        return latitude_depart;
    }

    public void setLatitude_depart(float latitude_depart) {
        this.latitude_depart = latitude_depart;
    }

    public float getLongitude_arrivee() {
        return longitude_arrivee;
    }

    public void setLongitude_arrivee(float longitude_arrivee) {
        this.longitude_arrivee = longitude_arrivee;
    }

    public float getLatitude_arrivee() {
        return latitude_arrivee;
    }

    public void setLatitude_arrivee(float latitude_arrivee) {
        this.latitude_arrivee = latitude_arrivee;
    }
    
    
}
