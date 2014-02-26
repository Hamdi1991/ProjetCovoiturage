/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package covoiturage.controler;

import covoiturage.dao.membreDAO;
import covoiturage.entities.membre;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Bilel
 */
public class supprimer_membre_controler extends AbstractTableModel{
    String[] headers = {"Id", "Nom", "Prénom", "Adresse", "Date de naissance", "Date d'inscription", "Numero de téléphone", "Adresse mail", "evaluation"};
    List<membre> listMembre = new ArrayList<membre>();

    public supprimer_membre_controler() {

        membreDAO membreDAO = new membreDAO();
        listMembre = membreDAO.DisplayAllMembre();
    }

    public int getRowCount() {
        return listMembre.size();
    }

    public int getColumnCount() {
        return headers.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listMembre.get(rowIndex).getId();
            case 1:
                return listMembre.get(rowIndex).getNom();
            case 2:
                return listMembre.get(rowIndex).getPrenom();
            case 3:
                return listMembre.get(rowIndex).getAdresse();
            case 4:
                return listMembre.get(rowIndex).getDate_naissance();
            case 5:
                return listMembre.get(rowIndex).getDate_inscription();
            case 6:
                return listMembre.get(rowIndex).getNum_telephone();
            case 7:
                return listMembre.get(rowIndex).getMail();
            case 8:
                return listMembre.get(rowIndex).getEvaluation();
            default:
                return null;
                
        }
        
    }

        public String getColumnName(int column) {
        return headers[column];
    }
}
