/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package covoiturage.entities;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Reclamation {
   
    private int idReclamation;
    private String dateReclamation;
    private String sujetReclamation;
    private String contenuReclamation;

    public int getIdReclamation() {
        return idReclamation;
    }

    public String getDateReclamation() {
        return dateReclamation;
    }

    public String getSujet_reclamation() {
        return sujetReclamation;
    }

    public String getContenuReclamation() {
        return contenuReclamation;
    }

    public void setIdReclamation(int idReclamation) {
        this.idReclamation = idReclamation;
    }

    public void setDateReclamation(String dateReclamation) {
        this.dateReclamation = dateReclamation;
    }

    public void setSujet_reclamation(String sujet_reclamation) {
        this.sujetReclamation = sujet_reclamation;
    }

    public void setContenuReclamation(String contenuReclamation) {
        this.contenuReclamation = contenuReclamation;
    }
    
}
