/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package covoiturage.dao;

import covoiturage.entities.Reclamation;
import covoiturage.entities.Trajet;
import covoiturage.util.MyConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class TrajetDAO {
    
    public List<Trajet> DisplayTrajet(){


        List<Trajet> listeTrajet = new ArrayList<Trajet>();

        String requete = "select longitude_depart latitude_depart longitude_arrive latitude_arrive from trajet";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            //ReclamationDAO reclamationDAO = new ReclamationDAO();
            while(resultat.next()){
                Trajet trajet =new Trajet();
                trajet.setLatitudeArrive(resultat.getFloat(1));
                trajet.setLatitudeDepart(resultat.getFloat(2));
                trajet.setLogitudeArrive(resultat.getFloat(3));
                trajet.setLogitudeDepart(resultat.getFloat(4));

                listeTrajet.add(trajet);
            }
            return listeTrajet;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des réclamations "+ex.getMessage());
            return null;
        }
    }
}