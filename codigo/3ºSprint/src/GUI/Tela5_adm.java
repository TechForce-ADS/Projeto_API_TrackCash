/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Aluno
 */



import dao.UsuarioDAO;
import factory.ConnectionFactory;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.CanaisDTO;


public class Tela5_adm extends javax.swing.JFrame {

    /**
     * Creates new form Tela5
     */
    public Tela5_adm() {
        initComponents();
        
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rosa = new javax.swing.JPanel();
        verde = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        azul = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCanal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtAutentica = new javax.swing.JComboBox<>();
        txtTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(530, 530));
        setPreferredSize(new java.awt.Dimension(1600, 800));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        rosa.setBackground(new java.awt.Color(255, 255, 255));
        rosa.setLayout(new java.awt.BorderLayout());

        verde.setBackground(new java.awt.Color(255, 255, 255));
        verde.setMinimumSize(new java.awt.Dimension(100, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/220 × 116.png"))); // NOI18N

        javax.swing.GroupLayout verdeLayout = new javax.swing.GroupLayout(verde);
        verde.setLayout(verdeLayout);
        verdeLayout.setHorizontalGroup(
            verdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verdeLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1)
                .addContainerGap(1052, Short.MAX_VALUE))
        );
        verdeLayout.setVerticalGroup(
            verdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verdeLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32))
        );

        rosa.add(verde, java.awt.BorderLayout.PAGE_START);

        azul.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(68, 18, 69));
        jLabel2.setText("Cadastro de");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 62, 0));
        jLabel3.setText("Canais");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(45, 18, 75));
        jLabel4.setText("Canal");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 18, 75));
        jLabel5.setText("Tipo de Canais");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(45, 18, 75));
        jLabel6.setText("Padrão de Autentificação");

        txtCanal.setBackground(new java.awt.Color(204, 204, 204));
        txtCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCanalActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 62, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 62, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtAutentica.setBackground(new java.awt.Color(204, 204, 204));
        txtAutentica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuário/ senha", "Token" }));

        txtTipo.setBackground(new java.awt.Color(204, 204, 204));
        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plataforma/ ERP", "Marketplace", "Meio de pagamento" }));
        txtTipo.setToolTipText("");
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout azulLayout = new javax.swing.GroupLayout(azul);
        azul.setLayout(azulLayout);
        azulLayout.setHorizontalGroup(
            azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azulLayout.createSequentialGroup()
                .addGroup(azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(azulLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(azulLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(azulLayout.createSequentialGroup()
                                .addGroup(azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(azulLayout.createSequentialGroup()
                                        .addGroup(azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(txtCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(138, 138, 138)
                                        .addGroup(azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))))
                                .addGroup(azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(azulLayout.createSequentialGroup()
                                        .addGap(232, 232, 232)
                                        .addComponent(jButton2))
                                    .addGroup(azulLayout.createSequentialGroup()
                                        .addGap(129, 129, 129)
                                        .addComponent(txtAutentica, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        azulLayout.setVerticalGroup(
            azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azulLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(118, 118, 118)
                .addGroup(azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutentica, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, azulLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, azulLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(53, 53, 53))))
        );

        rosa.add(azul, java.awt.BorderLayout.CENTER);

        getContentPane().add(rosa);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCanalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCanalActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         String canalamd, tipoadm, autentica;

        canalamd = txtCanal.getText();
        tipoadm = txtTipo.getSelectedItem().toString();
        autentica = txtAutentica.getSelectedItem().toString();

        CanaisDTO objCanaisDTO = new CanaisDTO();
        objCanaisDTO.setCanalamd(canalamd);
        objCanaisDTO.setTipoadm(tipoadm);
        objCanaisDTO.setAutentica(autentica);

        UsuarioDAO objCanalDAO = new UsuarioDAO();
        objCanalDAO.cadastrarCanaladm(objCanaisDTO);

        JOptionPane.showMessageDialog(null, "Cadastro feito!");

        Tela6_adm objhomeadmgui = new Tela6_adm();
        objhomeadmgui.setVisible(true); //abri a pagina se o login for correto

        dispose(); //abri a pagina se o login for correto

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tela4_adm tela2 = new Tela4_adm();
        tela2.setVisible(true); //abri a pagina se o login for correto

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela5_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela5_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela5_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela5_adm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela5_adm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel azul;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel rosa;
    private javax.swing.JComboBox<String> txtAutentica;
    private javax.swing.JTextField txtCanal;
    private javax.swing.JComboBox<String> txtTipo;
    private javax.swing.JPanel verde;
    // End of variables declaration//GEN-END:variables
}
