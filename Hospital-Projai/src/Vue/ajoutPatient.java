package Vue;
import Modele.Docteur;
import Modele.Employe;
import Modele.Infirmier;
import Modele.Malade;
import Modele.Personne;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbcv2018.Connexion;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Louis
 */
public class ajoutPatient extends javax.swing.JFrame {

    /**
     * Creates new form ajoutPatient
     */
    public ajoutPatient() {
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

        champNumeroPatient = new javax.swing.JTextField();
        champNom = new javax.swing.JTextField();
        champPrenom = new javax.swing.JTextField();
        champTéléphone = new javax.swing.JTextField();
        champAdresse = new javax.swing.JTextField();
        champMutuelle = new javax.swing.JTextField();
        bouttonAjouterlePatient = new javax.swing.JButton();
        boutonAnnuler = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1026, 660));
        getContentPane().setLayout(null);

        champNumeroPatient.setText("Numero Patient");
        getContentPane().add(champNumeroPatient);
        champNumeroPatient.setBounds(40, 30, 200, 40);

        champNom.setText("Nom");
        champNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champNomActionPerformed(evt);
            }
        });
        getContentPane().add(champNom);
        champNom.setBounds(40, 140, 200, 50);

        champPrenom.setText("Prenom");
        getContentPane().add(champPrenom);
        champPrenom.setBounds(40, 230, 200, 50);

        champTéléphone.setText("Telephone");
        champTéléphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champTéléphoneActionPerformed(evt);
            }
        });
        getContentPane().add(champTéléphone);
        champTéléphone.setBounds(40, 310, 200, 50);

        champAdresse.setText("Adresse");
        champAdresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champAdresseActionPerformed(evt);
            }
        });
        getContentPane().add(champAdresse);
        champAdresse.setBounds(40, 390, 200, 50);

        champMutuelle.setText("Mutuelle");
        getContentPane().add(champMutuelle);
        champMutuelle.setBounds(40, 476, 200, 50);

        bouttonAjouterlePatient.setText("Ajouter le Patient");
        bouttonAjouterlePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouttonAjouterlePatientActionPerformed(evt);
            }
        });
        getContentPane().add(bouttonAjouterlePatient);
        bouttonAjouterlePatient.setBounds(830, 520, 170, 29);

        boutonAnnuler.setText("Annuler");
        boutonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAnnulerActionPerformed(evt);
            }
        });
        getContentPane().add(boutonAnnuler);
        boutonAnnuler.setBounds(870, 570, 93, 29);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText(" Veuillez saisir les informations concernant le patient puis cliquer sur ajouter");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, -10, 780, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vue/medical-free-vector-background-with-heart-monitor.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1030, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void champNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champNomActionPerformed

    private void champTéléphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champTéléphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champTéléphoneActionPerformed

    private void champAdresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champAdresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champAdresseActionPerformed

    private void boutonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAnnulerActionPerformed
     this.setVisible(false);
      new fenetreprincipale().setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_boutonAnnulerActionPerformed

    private void bouttonAjouterlePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouttonAjouterlePatientActionPerformed
        Malade m1;
        m1=new Malade();
        Connexion c1;
        
        
        m1.setNomPersonne(champNom.getText());
        m1.setPrenomPersonne(champPrenom.getText());
        m1.setNumeroPersonne(champNumeroPatient.getText());
        m1.setTelephone(champTéléphone.getText());
        m1.setMutuelle(champMutuelle.getText());
        m1.setAdresse(champAdresse.getText());
        
        m1.afficherInfosMalade();
        
        try {
            c1= new Connexion ("hopital","root","root");
            c1.executeUpdate("INSERT INTO malade\n" +
"VALUES ('7667',\n" +
"'tamere',\n" +
"'lapute',\n" +
"'43 rue Vauvenargues, 78000 Versailles',\n" +
"'01 52 53 23 82',\n" +
"'MNAM')");
        } catch (SQLException ex) {
            Logger.getLogger(ajoutPatient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ajoutPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        new fenetreprincipale().setVisible(true); 
        this.setVisible(false);
               // TODO add your handling code here:
    }//GEN-LAST:event_bouttonAjouterlePatientActionPerformed

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
            java.util.logging.Logger.getLogger(ajoutPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajoutPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajoutPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajoutPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ajoutPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonAnnuler;
    private javax.swing.JButton bouttonAjouterlePatient;
    private javax.swing.JTextField champAdresse;
    private javax.swing.JTextField champMutuelle;
    private javax.swing.JTextField champNom;
    private javax.swing.JTextField champNumeroPatient;
    private javax.swing.JTextField champPrenom;
    private javax.swing.JTextField champTéléphone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
