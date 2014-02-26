/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covoiturage.dao;

import covoiturage.entities.membre;
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
public class membreDAO {

    public void insertMembre(membre membre) {

        String requete = "insert into membre (nom,prenom,adresse,date_naissance,date_inscription,num_telephone,mail,evaluation,password) values (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection1.getInstance().prepareStatement(requete);
            ps.setString(1, membre.getNom());
            ps.setString(2, membre.getPrenom());
            ps.setString(3, membre.getAdresse());
            ps.setDate(4, (Date) membre.getDate_naissance());
            ps.setDate(5, (Date) membre.getDate_inscription());
            ps.setInt(6, membre.getNum_telephone());
            ps.setString(7, membre.getMail());
            ps.setInt(8, membre.getEvaluation());
            ps.setString(9, membre.getPassword());

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }

    public void supprimerMembre(int id) {

        String requete = "delete from membre where id=?";
        try {
            PreparedStatement ps = MyConnection1.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Membre supprimé");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }

    }

    public List<membre> DisplayAllMembre() {

        List<membre> listemembre = new ArrayList<membre>();

        String requete = "select * from membre";
        try {
            Statement statement = MyConnection1.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                membre membre = new membre();
                membre.setId(resultat.getInt(1));
                membre.setNom(resultat.getString(2));
                membre.setPrenom(resultat.getString(3));
                membre.setAdresse(resultat.getString(4));
                membre.setDate_naissance(resultat.getDate(5));
                membre.setDate_inscription(resultat.getDate(6));
                membre.setNum_telephone(resultat.getInt(7));
                membre.setMail(resultat.getString(8));
                membre.setEvaluation(resultat.getInt(9));
                membre.setPassword(resultat.getString(10));

                listemembre.add(membre);
            }
            return listemembre;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;
        }

    }

    public List<membre> findMembreByNom(String nom) {

        String requete = "select * from membre where nom=?";
        List<membre> memList = new ArrayList<membre>();

        try {
            PreparedStatement ps = MyConnection1.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ResultSet resultat = ps.executeQuery();
            membreDAO membreDAO = new membreDAO();
            membre membre = new membre();
            while (resultat.next()) {

                membre.setId(resultat.getInt(1));
                membre.setNom(resultat.getString(2));
                membre.setPrenom(resultat.getString(3));
                membre.setAdresse(resultat.getString(4));
                membre.setDate_naissance(resultat.getDate(5));
                membre.setDate_inscription(resultat.getDate(6));
                membre.setNum_telephone(resultat.getInt(7));
                membre.setMail(resultat.getString(8));
                membre.setEvaluation(resultat.getInt(9));
                membre.setPassword(resultat.getString(10));
                memList.add(membre);
            }
            
            return memList;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }

    }

    public List<membre> findMembreByMail(String mail) {

        String requete = "select * from membre where mail=?";
        List<membre> memList = new ArrayList<membre>();

        try {
            PreparedStatement ps = MyConnection1.getInstance().prepareStatement(requete);
            ps.setString(1, mail);
            ResultSet resultat = ps.executeQuery();
            membreDAO membreDAO = new membreDAO();
            membre membre = new membre();
            while (resultat.next()) {

                membre.setId(resultat.getInt(1));
                membre.setNom(resultat.getString(2));
                membre.setPrenom(resultat.getString(3));
                membre.setAdresse(resultat.getString(4));
                membre.setDate_naissance(resultat.getDate(5));
                membre.setDate_inscription(resultat.getDate(6));
                membre.setNum_telephone(resultat.getInt(7));
                membre.setMail(resultat.getString(8));
                membre.setEvaluation(resultat.getInt(9));
                membre.setPassword(resultat.getString(10));
                memList.add(membre);
            }
            
            return memList;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement" + ex.getMessage());
            return null;
        }

    }

    public void updateMembre(membre m) {
        String requete = "update membre set nom=?, prenom=?, adresse=?, date_naissance=?, date_inscription=?, num_telephone=?, mail=?, evaluation=? where id=?";
        try {
            PreparedStatement ps = MyConnection1.getInstance().prepareStatement(requete);
            ps.setString(1, m.getNom());
            ps.setString(2, m.getPrenom());
            ps.setString(3, m.getAdresse());
            ps.setDate(4, (Date) m.getDate_naissance());
            ps.setDate(5, (Date) m.getDate_inscription());
            ps.setInt(6, m.getNum_telephone());
            ps.setString(7, m.getMail());
            ps.setInt(8, m.getEvaluation());
            ps.setInt(9, m.getId());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }

    }
}
