/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windows;

import javax.swing.JOptionPane;
import models.Administrateur;
import services.AdministrateurService;


public class RegistreAdmin extends javax.swing.JFrame {

    private final AdministrateurService adminService;
   
    public RegistreAdmin() {
            
            initComponents();
            
            adminService = new AdministrateurService();

            //Pour centrer
            this.setLocationRelativeTo(null);

    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        loginAdmin_txt = new javax.swing.JTextField();
        emailAdmin_txt = new javax.swing.JTextField();
        prenomAdmin_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passeAdmin_txt = new javax.swing.JPasswordField();
        quitterAdmin_txt = new javax.swing.JToggleButton();
        annulerAdmin = new javax.swing.JButton();
        inscrireAdmin_txt = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginAdmin_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAdmin_txtActionPerformed(evt);
            }
        });
        jPanel1.add(loginAdmin_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 143, -1));
        jPanel1.add(emailAdmin_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 143, -1));
        jPanel1.add(prenomAdmin_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 143, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jLabel2.setText("Login");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 113, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jLabel3.setText("Mot de Passe");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 113, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 113, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jLabel6.setText("Prenom");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 113, -1));

        passeAdmin_txt.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jPanel1.add(passeAdmin_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 143, -1));

        quitterAdmin_txt.setBackground(new java.awt.Color(255, 102, 102));
        quitterAdmin_txt.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        quitterAdmin_txt.setText("Quitter");
        quitterAdmin_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitterAdmin_txtMouseClicked(evt);
            }
        });
        jPanel1.add(quitterAdmin_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 34));

        annulerAdmin.setBackground(new java.awt.Color(255, 255, 0));
        annulerAdmin.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        annulerAdmin.setText("Annuler");
        annulerAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerAdminActionPerformed(evt);
            }
        });
        jPanel1.add(annulerAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, 34));

        inscrireAdmin_txt.setBackground(new java.awt.Color(102, 255, 102));
        inscrireAdmin_txt.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        inscrireAdmin_txt.setText("S'INSCRIRE");
        inscrireAdmin_txt.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                inscrireAdmin_txtMouseDragged(evt);
            }
        });
        inscrireAdmin_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inscrireAdmin_txtMouseClicked(evt);
            }
        });
        inscrireAdmin_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscrireAdmin_txtActionPerformed(evt);
            }
        });
        jPanel1.add(inscrireAdmin_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, 34));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 350, 370));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\bmd_tech\\Documents\\HRM\\src\\Image\\admin_homme.png")); // NOI18N
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 470));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel4.setText("NOUVEAU ADMINISTRATEUR");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inscrireAdmin_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscrireAdmin_txtActionPerformed
             // TODO add your handling code here:
        String login = loginAdmin_txt.getText();
        String prenom = prenomAdmin_txt.getText();
        String email = emailAdmin_txt.getText();
        String motDePasse = new String(passeAdmin_txt.getPassword());

        AdministrateurService administrateurService = new AdministrateurService();
        Administrateur administrateur = new Administrateur();
        administrateur.setLogin(login);
        administrateur.setPrenom(prenom);
        administrateur.setEmail(email);
        administrateur.setMotDePasse(motDePasse);

        if (administrateurService.createAdministrateur(administrateur)) {
             // Création réussie
            JOptionPane.showMessageDialog(this, "Nouveau administrateur créé!");
            this.dispose();
            new AdminMainWindow().setVisible(true);
        } else {
            // Création échouée
            JOptionPane.showMessageDialog(this, "Echec de l'inscription !");
        }

    }//GEN-LAST:event_inscrireAdmin_txtActionPerformed

    private void inscrireAdmin_txtMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscrireAdmin_txtMouseDragged
        // Login from show
        new AdminLoginWindow().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inscrireAdmin_txtMouseDragged

    private void inscrireAdmin_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscrireAdmin_txtMouseClicked

    }//GEN-LAST:event_inscrireAdmin_txtMouseClicked

    private void loginAdmin_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAdmin_txtActionPerformed

   
    
    }//GEN-LAST:event_loginAdmin_txtActionPerformed

    private void quitterAdmin_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitterAdmin_txtMouseClicked

        new AdminLoginWindow().setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_quitterAdmin_txtMouseClicked

    private void annulerAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerAdminActionPerformed

        
    }//GEN-LAST:event_annulerAdminActionPerformed

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
            java.util.logging.Logger.getLogger(RegistreAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistreAdmin().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annulerAdmin;
    private javax.swing.JTextField emailAdmin_txt;
    private javax.swing.JButton inscrireAdmin_txt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField loginAdmin_txt;
    private javax.swing.JPasswordField passeAdmin_txt;
    private javax.swing.JTextField prenomAdmin_txt;
    private javax.swing.JToggleButton quitterAdmin_txt;
    // End of variables declaration//GEN-END:variables
 
}
