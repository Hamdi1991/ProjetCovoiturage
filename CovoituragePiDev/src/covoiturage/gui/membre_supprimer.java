/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package covoiturage.gui;

import covoiturage.controler.ListMembreMailController;
import covoiturage.controler.ListMembreNomController;
import covoiturage.controler.supprimer_membre_controler;
import covoiturage.dao.membreDAO;
import covoiturage.entities.membre;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Bilel
 */
public class membre_supprimer extends javax.swing.JFrame {

    /**
     * Creates new form membre_supprimer
     */

    public membre_supprimer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnValiderMembre = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButtonSupprimerMembre = new javax.swing.JButton();
        jButtonModifierMembre = new javax.swing.JButton();
        jButtonAjouterMembre = new javax.swing.JButton();
        jButtonInfo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new supprimer_membre_controler());
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Rechercher Par :");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Nom");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Adresse mail");

        jLabel2.setText("Mot clé :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btnValiderMembre.setText("valider");
        btnValiderMembre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderMembreActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("All");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(153, 153, 153)
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(btnValiderMembre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValiderMembre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButtonSupprimerMembre.setText("Supprimer Membre");
        jButtonSupprimerMembre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprimerMembreActionPerformed(evt);
            }
        });

        jButtonModifierMembre.setText("Modifier Membre");
        jButtonModifierMembre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifierMembreActionPerformed(evt);
            }
        });

        jButtonAjouterMembre.setText("Ajouter Nouveau");
        jButtonAjouterMembre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjouterMembreActionPerformed(evt);
            }
        });

        jButtonInfo.setText("Voir info");
        jButtonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSupprimerMembre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonModifierMembre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAjouterMembre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButtonSupprimerMembre)
                .addGap(18, 18, 18)
                .addComponent(jButtonModifierMembre)
                .addGap(18, 18, 18)
                .addComponent(jButtonAjouterMembre)
                .addGap(18, 18, 18)
                .addComponent(jButtonInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Membre", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1123, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Reclamations", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1123, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Statistiques", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1123, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Forum", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1123, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("FAQ", jPanel4);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1123, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Messages", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSupprimerMembreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprimerMembreActionPerformed
        // TODO add your handling code here:
          
            
        if (jTable1.getSelectedRow()<0){
            
            JOptionPane.showMessageDialog(this, "Aucun Membre Séléctionné Pour Suppression");
        }
        else{
        int j = JOptionPane.showConfirmDialog(this, "Etes Vous sur de vouloir supprimer ce membre?");
        if (j==0) {
        int i= (int) jTable1.getValueAt(jTable1.getSelectedRow(),0 );
        membre m = new membre();
        m.setId(i);
        membreDAO membreDAO = new membreDAO();
        membreDAO.supprimerMembre(i);
        }
        }
        
        dispose();
        membre_supprimer s = new membre_supprimer();
        s.show();
        
        
    }//GEN-LAST:event_jButtonSupprimerMembreActionPerformed

    private void jButtonModifierMembreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierMembreActionPerformed
            try    {
                int id,num_telephone,evaluation;
                id=(int) jTable1.getValueAt(jTable1.getSelectedRow(),0);
                Date date_naissance,date_inscription;
                String nom,prenom,adresse,mail,password;
                nom =(String) jTable1.getValueAt(jTable1.getSelectedRow(),1 );
                prenom =(String) jTable1.getValueAt(jTable1.getSelectedRow(),2 );
                adresse =(String) jTable1.getValueAt(jTable1.getSelectedRow(),3 );
                date_naissance = (Date) jTable1.getValueAt(jTable1.getSelectedRow(),4 );
                date_inscription = (Date) jTable1.getValueAt(jTable1.getSelectedRow(),5 );
                num_telephone =(int) jTable1.getValueAt(jTable1.getSelectedRow(),6 );
                mail = (String) jTable1.getValueAt(jTable1.getSelectedRow(),7 );
                evaluation = (int) jTable1.getValueAt(jTable1.getSelectedRow(),8 );
                //password = (String) jTable1.getValueAt(jTable1.getSelectedRow(),9 );
                hide();
                membre_modifier m = new membre_modifier(id,nom,prenom,adresse,date_naissance,date_inscription,num_telephone,mail,evaluation);
                m.show();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Aucun Membre Séléctionné Pour Modification");
            }
        
    }//GEN-LAST:event_jButtonModifierMembreActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonAjouterMembreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjouterMembreActionPerformed
        // TODO add your handling code here:
        hide();
        membre_ajouter m = new membre_ajouter();
        m.show();
    }//GEN-LAST:event_jButtonAjouterMembreActionPerformed

    private void btnValiderMembreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderMembreActionPerformed
            if(jRadioButton1.isSelected()){
            jTable1.setModel(new ListMembreNomController(jTextField1.getText()));
            }
            if(jRadioButton2.isSelected()){
                jTable1.setModel(new ListMembreMailController(jTextField1.getText()));
            }
            if(jRadioButton3.isSelected()){
                jTable1.setModel(new supprimer_membre_controler());
            }
                

        
    }//GEN-LAST:event_btnValiderMembreActionPerformed

    private void jButtonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfoActionPerformed
        
                int id,num_telephone,evaluation;
                id=(int) jTable1.getValueAt(jTable1.getSelectedRow(),0);
                Date date_naissance,date_inscription;
                String nom,prenom,adresse,mail,password;
                nom =(String) jTable1.getValueAt(jTable1.getSelectedRow(),1 );
                prenom =(String) jTable1.getValueAt(jTable1.getSelectedRow(),2 );
                adresse =(String) jTable1.getValueAt(jTable1.getSelectedRow(),3 );
                date_naissance = (Date) jTable1.getValueAt(jTable1.getSelectedRow(),4 );
                date_inscription = (Date) jTable1.getValueAt(jTable1.getSelectedRow(),5 );
                num_telephone =(int) jTable1.getValueAt(jTable1.getSelectedRow(),6 );
                mail = (String) jTable1.getValueAt(jTable1.getSelectedRow(),7 );
                evaluation = (int) jTable1.getValueAt(jTable1.getSelectedRow(),8 );
                MembreInfo membreInfo = new MembreInfo(id,nom,prenom,adresse,date_naissance,date_inscription,num_telephone,mail,evaluation);
                membreInfo.setVisible(true);
    }//GEN-LAST:event_jButtonInfoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(membre_supprimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(membre_supprimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(membre_supprimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(membre_supprimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new membre_supprimer().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnValiderMembre;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAjouterMembre;
    private javax.swing.JButton jButtonInfo;
    private javax.swing.JButton jButtonModifierMembre;
    private javax.swing.JButton jButtonSupprimerMembre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}