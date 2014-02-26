/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package covoiturage.dao;

import covoiturage.entities.Annonce;
import covoiturage.util.MyConnection1;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Bilel
 */
public class AnnonceDAO {
    public void insertMembre(Annonce annonce) {

        String requete = "insert into annonce (ville_depart,ville_arrivee,date_trajet,duree_estimee,distance,longitude_depart,latitude_depart,longitude_arrivee,latitude_arrivee,id_membre) values (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection1.getInstance().prepareStatement(requete);
            ps.setString(1, annonce.getVille_depart());
            ps.setString(2, annonce.getVille_arrivee());
            ps.setString(3, annonce.getDate_trajet());
            ps.setString(4, annonce.getDuree_estimee());
            ps.setFloat(5, annonce.getDistance());
            ps.setFloat(6, annonce.getLongitude_depart());
            ps.setFloat(7, annonce.getLatitude_depart());
            ps.setFloat(8, annonce.getLongitude_arrivee());
            ps.setFloat(9, annonce.getLatitude_arrivee());
            ps.setInt(10, annonce.getMembre().getId());

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }
}
