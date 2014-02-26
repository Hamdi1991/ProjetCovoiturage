/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package covoiturage.dao;

import covoiturage.entities.vehicule;
import covoiturage.util.MyConnection1;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bilel
 */
public class vehiculeDAO {
    
    
    
        public List<vehicule> DisplayAllVehicules (){


        List<vehicule> listedepots = new ArrayList<vehicule>();

        String requete = "select * from vehicule,membre where membre.id=vedicule.id_membre";
        try {
           Statement statement = MyConnection1.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                vehicule vehicule =new vehicule();
                vehicule.setMarque(resultat.getString(1));
                vehicule.setModele(resultat.getString(2));
                vehicule.setAnnee(resultat.getInt(3));
                vehicule.setNombrePlace(resultat.getInt(4));
                vehicule.setCouleur(resultat.getString(5));
                vehicule.setMusique(resultat.getInt(6));
                vehicule.setClimatisation(resultat.getInt(7));
                vehicule.setFumeur(resultat.getInt(8));
               // ps.setInt(3,st.getDepot().getId_dep() );
                
            }
            return listedepots;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }
        
    public void insertVehicule(vehicule v){
           // DepotDAO depdao=new DepotDAO();

         String requete = "insert into vehicule (marque,modele,annee,nombre_places,couleur,musique,climatisation,fumeur,id_membre) values (?,?,?,?,?,?,?,?,?)";
        try { //dep=depdao.findDepotById(st.getDepot().getId_dep());
            PreparedStatement ps = MyConnection1.getInstance().prepareStatement(requete);
            ps.setString(1, v.getMarque());
            ps.setString(2, v.getModele());
            ps.setInt(3, v.getAnnee());
            ps.setInt(4, v.getNombrePlace());
            ps.setString(5, v.getCouleur());
            ps.setInt(6,v.getMusique() );
            ps.setInt(7,v.getClimatisation());
            ps.setInt(8,v.getFumeur());
            ps.setInt(9,v.getMembre());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
            public void updateMembre(vehicule v){
        String requete = "update vehicule set marque=?, modele=?, annee=?, nombre_places=?, couleur=?, musique=?, climatisation=?, fumeur=? where id_membre=?";
        try {
            PreparedStatement ps = MyConnection1.getInstance().prepareStatement(requete);
            ps.setString(1, v.getMarque());
            ps.setString(2, v.getModele());
            ps.setInt(3, v.getAnnee());
            ps.setInt(4, v.getNombrePlace());
            ps.setString(5, v.getCouleur());
            ps.setInt(6,v.getMusique());
            ps.setInt(7, v.getClimatisation());
            ps.setInt(8, v.getFumeur());
            ps.setInt(9, v.getMembre());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }

    }
            
            
            
        public vehicule findVediculeById(int id){

        String requete = "select * from vehicule where id_membre=?";
        
        try{
        PreparedStatement ps = MyConnection1.getInstance().prepareStatement(requete);
        ps.setInt(1, id);
        ResultSet resultat = ps.executeQuery();
        vehiculeDAO vDAO = new vehiculeDAO();
        vehicule vehicule = new vehicule();
        while (resultat.next()){

            
            vehicule.setMarque(resultat.getString(2));
            vehicule.setModele(resultat.getString(3));
            vehicule.setAnnee(resultat.getInt(4));
            vehicule.setNombrePlace(resultat.getInt(5));
            vehicule.setCouleur(resultat.getString(6));
            vehicule.setMusique(resultat.getInt(7));
            vehicule.setClimatisation(resultat.getInt(8));
            vehicule.setFumeur(resultat.getInt(9));
            
        }
        return vehicule;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
        }
    
}
