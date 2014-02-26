/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package covoiturage.gui;

import covoiturage.dao.vehiculeDAO;
import covoiturage.entities.membre;
import covoiturage.entities.vehicule;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Bilel
 */
public class membre_modifier_vehicule extends javax.swing.JFrame {

    /**
     * Creates new form membre_modifier_vehicule
     */
    int id_membre;
    public membre_modifier_vehicule() {
        initComponents();
    }



    public  membre_modifier_vehicule(int i) {
        initComponents();
       this.id_membre=i;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBoxMusique = new javax.swing.JCheckBox();
        jCheckBoxClimatisation = new javax.swing.JCheckBox();
        jCheckBoxFumeur = new javax.swing.JCheckBox();
        jTextFieldMarque = new javax.swing.JTextField();
        jTextFieldModele = new javax.swing.JTextField();
        jRadioButtonBleu = new javax.swing.JRadioButton();
        jRadioButtonRouge = new javax.swing.JRadioButton();
        jRadioButtonVert = new javax.swing.JRadioButton();
        jRadioButtonJaune = new javax.swing.JRadioButton();
        jRadioButtonGris = new javax.swing.JRadioButton();
        jRadioButtonBlanc = new javax.swing.JRadioButton();
        jRadioButtonNoir = new javax.swing.JRadioButton();
        jRadioButtonViolet = new javax.swing.JRadioButton();
        jRadioButtonRose = new javax.swing.JRadioButton();
        jComboBoxNbPlaces = new javax.swing.JComboBox();
        jButtonModifierVehicule = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Marque : ");

        jLabel2.setText("Modele :");

        jLabel3.setText("Annee :");

        jLabel4.setText("Nombre de places :");

        jLabel5.setText("Couleur :");

        jLabel6.setText("Confort :");

        jCheckBoxMusique.setText("Musique");

        jCheckBoxClimatisation.setText("Climatisation");

        jCheckBoxFumeur.setText("Fumeur");

        buttonGroup1.add(jRadioButtonBleu);
        jRadioButtonBleu.setSelected(true);
        jRadioButtonBleu.setText("Bleu");

        buttonGroup1.add(jRadioButtonRouge);
        jRadioButtonRouge.setText("Rouge");

        buttonGroup1.add(jRadioButtonVert);
        jRadioButtonVert.setText("Vert");

        buttonGroup1.add(jRadioButtonJaune);
        jRadioButtonJaune.setText("Jaune/Or");

        buttonGroup1.add(jRadioButtonGris);
        jRadioButtonGris.setText("Gris/Argent");

        buttonGroup1.add(jRadioButtonBlanc);
        jRadioButtonBlanc.setText("Blanc");

        buttonGroup1.add(jRadioButtonNoir);
        jRadioButtonNoir.setText("Noir");

        buttonGroup1.add(jRadioButtonViolet);
        jRadioButtonViolet.setText("Violet");

        buttonGroup1.add(jRadioButtonRose);
        jRadioButtonRose.setText("Rose");

        jComboBoxNbPlaces.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        jButtonModifierVehicule.setText("Modifier le Vehicule");
        jButtonModifierVehicule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifierVehiculeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonBleu)
                                    .addComponent(jRadioButtonVert)
                                    .addComponent(jRadioButtonGris))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonRouge)
                                    .addComponent(jRadioButtonJaune)
                                    .addComponent(jRadioButtonBlanc))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonRose)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButtonViolet)
                                            .addComponent(jRadioButtonNoir))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldModele, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldMarque, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(474, 474, 474))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(53, 53, 53)
                                .addComponent(jComboBoxNbPlaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(92, 92, 92)
                                .addComponent(jCheckBoxMusique)))
                        .addGap(53, 53, 53)
                        .addComponent(jCheckBoxClimatisation)
                        .addGap(51, 51, 51)
                        .addComponent(jCheckBoxFumeur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                        .addComponent(jButtonModifierVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldMarque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldModele, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButtonBleu)
                    .addComponent(jRadioButtonRouge)
                    .addComponent(jRadioButtonNoir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonVert)
                    .addComponent(jRadioButtonJaune)
                    .addComponent(jRadioButtonViolet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonGris)
                    .addComponent(jRadioButtonBlanc)
                    .addComponent(jRadioButtonRose))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxNbPlaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCheckBoxMusique)
                    .addComponent(jCheckBoxClimatisation)
                    .addComponent(jCheckBoxFumeur)
                    .addComponent(jButtonModifierVehicule))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModifierVehiculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifierVehiculeActionPerformed
        // TODO add your handling code here:
        int climatisation;
        int fumeur;
        int musique;
        String couleur = null;
        vehicule v = new vehicule();
        v.setMembre(id_membre);
        v.setMarque(jTextFieldMarque.getText());
        v.setModele(jTextFieldModele.getText());
//        v.setAnnee(jYearChooser1.getYear());
        v.setNombrePlace(jComboBoxNbPlaces.getSelectedIndex());
        if(jCheckBoxClimatisation.isSelected()){
             climatisation=1;
        }
        else{ climatisation =0; }
        v.setClimatisation(climatisation);
        if (jCheckBoxFumeur.isSelected()) {
            fumeur = 1;
        }
        else{fumeur = 0;}
        v.setFumeur(fumeur);
        if (jCheckBoxMusique.isSelected()) {
            musique = 1;
        }
        else{musique = 0;}
        v.setMusique(musique);
            if (jRadioButtonBlanc.isSelected()) {couleur ="Blanc";}
            if (jRadioButtonBleu.isSelected()) {couleur ="Bleu";}
            if (jRadioButtonGris.isSelected()) {couleur ="Gris/Argent";}
            if (jRadioButtonJaune.isSelected()) {couleur ="Jaune/or";}
            if (jRadioButtonNoir.isSelected()) {couleur ="Noir";}
            if (jRadioButtonRose.isSelected()) {couleur ="Rose";}
            if (jRadioButtonRouge.isSelected()) {couleur ="Rouge";}
            if (jRadioButtonVert.isSelected()) {couleur ="Vert";}
            if (jRadioButtonViolet.isSelected()) {couleur ="Violet";}
        v.setCouleur(couleur);
        vehiculeDAO vehicule= new vehiculeDAO();
        vehicule.updateMembre(v);
            
        
        
        
        
    }//GEN-LAST:event_jButtonModifierVehiculeActionPerformed

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
            java.util.logging.Logger.getLogger(membre_modifier_vehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(membre_modifier_vehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(membre_modifier_vehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(membre_modifier_vehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new membre_modifier_vehicule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonModifierVehicule;
    private javax.swing.JCheckBox jCheckBoxClimatisation;
    private javax.swing.JCheckBox jCheckBoxFumeur;
    private javax.swing.JCheckBox jCheckBoxMusique;
    private javax.swing.JComboBox jComboBoxNbPlaces;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButtonBlanc;
    private javax.swing.JRadioButton jRadioButtonBleu;
    private javax.swing.JRadioButton jRadioButtonGris;
    private javax.swing.JRadioButton jRadioButtonJaune;
    private javax.swing.JRadioButton jRadioButtonNoir;
    private javax.swing.JRadioButton jRadioButtonRose;
    private javax.swing.JRadioButton jRadioButtonRouge;
    private javax.swing.JRadioButton jRadioButtonVert;
    private javax.swing.JRadioButton jRadioButtonViolet;
    private javax.swing.JTextField jTextFieldMarque;
    private javax.swing.JTextField jTextFieldModele;
    // End of variables declaration//GEN-END:variables
}
