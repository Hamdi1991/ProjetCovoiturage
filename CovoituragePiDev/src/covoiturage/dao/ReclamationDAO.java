/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package covoiturage.dao;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import covoiturage.entities.Reclamation;
import covoiturage.util.MyConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class ReclamationDAO {
    
    public List<Reclamation> DisplayAllReclamation(){


        List<Reclamation> listereclamation = new ArrayList<Reclamation>();

        String requete = "select * from reclamation";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            //ReclamationDAO reclamationDAO = new ReclamationDAO();
            while(resultat.next()){
                Reclamation reclamation =new Reclamation();
                reclamation.setIdReclamation(resultat.getInt(1));
                reclamation.setDateReclamation(resultat.getString(2));
                reclamation.setSujet_reclamation(resultat.getString(3));
                reclamation.setContenuReclamation(resultat.getString(4));

                listereclamation.add(reclamation);
            }
            return listereclamation;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des réclamations "+ex.getMessage());
            return null;
        }
    }
    
    public void deleteReclamation(int num){

          String requete = "delete from reclamation where id=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, num);
            ps.executeUpdate();
            //System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
    
    public void insertReclamation(Reclamation reclamation){
           // DepotDAO depdao=new DepotDAO();

         String requete = "insert into reclamation (date_reclamation,sujet,contenu) values (?,?,?)";
        try { //dep=depdao.findDepotById(reclamation.getDepot().getId_dep());
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, (String) reclamation.getDateReclamation());
            ps.setString(2, reclamation.getSujet_reclamation());
            ps.setString(3,reclamation.getContenuReclamation());
            ps.executeUpdate();
            
            //.showConfirmDialog(null, "Votre réclamation à était envoyer avec succé!","OK", JOptionPane.OK_OPTION);
            //System.out.println("Ajout effectuée avec succès");
           //int p = JOptionPane.showMessageDialog(0, "Votre réclamation à était envoyer", "Confirmation", JOptionPane.OK_OPTION);
            JFrame frame = new JFrame("Show Message Dialog");
            JOptionPane.showMessageDialog(frame,"Votre rélamation à était envoyer");
            //System.out.println(p);
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
}
