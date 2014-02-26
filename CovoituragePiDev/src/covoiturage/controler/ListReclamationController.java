/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package covoiturage.controler;

import covoiturage.dao.ReclamationDAO;
import covoiturage.entities.Reclamation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USER
 */
public class ListReclamationController extends AbstractTableModel {

    String[] headers = {"ID", "Date Réclamation", "Sujet", "Contenu"};
    List<Reclamation> listReclamation = new ArrayList<Reclamation>();

    
    public ListReclamationController() {
        ReclamationDAO reclamationDAO = new ReclamationDAO();
        listReclamation = reclamationDAO.DisplayAllReclamation();
    }
    
    @Override
    public int getRowCount() {
        return listReclamation.size();
    }

    @Override
    public int getColumnCount() {
        return headers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listReclamation.get(rowIndex).getIdReclamation();
            case 1:
                return listReclamation.get(rowIndex).getDateReclamation();
            case 2:
                return listReclamation.get(rowIndex).getSujet_reclamation();
            case 3:
                return listReclamation.get(rowIndex).getContenuReclamation();
            default:
                return null;
    }                
}
    public String getColumnName(int column) {
        return headers[column]; //To change body of generated methods, choose Tools | Templates.
    }
}
   
