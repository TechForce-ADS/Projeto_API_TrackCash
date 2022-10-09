/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import dao.UsuarioDAO;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.CanaisDTO;

/**
 *
 * @author debor
 */
public class frmAdicionarCanalGUI extends javax.swing.JFrame {
    
    /**
     * Creates new form adicionar_canal
     */
    public frmAdicionarCanalGUI() {
        initComponents();
        updateCombo();
    }
private void updateCombo(){
     Connection conn;
        ResultSet rs;
        
        String sql = "select * from canaladm";
        conn = new ConnectionFactory().getConnection();
                try{
                     java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                     rs = pstm.executeQuery();
                     while(rs.next()){
                         txtCanal.addItem(rs.getString("canalamd"));
                     }
                } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "CheckBox: " + erro);
        }
}
     /* This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
*/
    @SuppressWarnings("unchecked")
           
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCanal = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        txtTipo = new javax.swing.JComboBox<>();
        btnCadastro1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnCadastro2 = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo_padrao.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("TIPO DE CANAIS");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 160, 20));

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 102, 0));
        txtNome.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 0)));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 290, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("NOME ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 190, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("    ADICIONAR NOVO CANAL");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 102, 0)));
        jLabel3.setMaximumSize(new java.awt.Dimension(242, 43));
        jLabel3.setMinimumSize(new java.awt.Dimension(242, 43));
        jLabel3.setPreferredSize(new java.awt.Dimension(242, 43));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 490, 80));

        txtCanal.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 0)));
        txtCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCanalActionPerformed(evt);
            }
        });
        getContentPane().add(txtCanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 290, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("CANAIS DISPONIVEIS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 210, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 370, -1, -1));

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(51, 0, 51));
        btnVoltar.setText("Voltar");
        btnVoltar.setActionCommand("");
        btnVoltar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 0)));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 120, 40));

        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marketplace", "Meio de Pagamento", "ERP" }));
        txtTipo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 0)));
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 290, 40));

        btnCadastro1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCadastro1.setForeground(new java.awt.Color(51, 0, 51));
        btnCadastro1.setText("Continuar");
        btnCadastro1.setActionCommand("");
        btnCadastro1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 0)));
        btnCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastro1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 610, 120, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo_padrao.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1020, 760));

        btnCadastro2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCadastro2.setForeground(new java.awt.Color(51, 0, 51));
        btnCadastro2.setText("Adicionar");
        btnCadastro2.setActionCommand("");
        btnCadastro2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 0)));
        btnCadastro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastro2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 640, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCanalActionPerformed

    }//GEN-LAST:event_txtCanalActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        frmAnteLoginGUI objfrmantelogingui = new frmAnteLoginGUI();
        objfrmantelogingui.setVisible(true); //abri a pagina se o login for correto
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void btnCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastro1ActionPerformed
        String canal, tipo, nome;
        
       nome = txtNome.getText();
       canal = txtCanal.getSelectedItem().toString();
       tipo = txtTipo.getSelectedItem().toString();
       
       CanaisDTO objCanaisDTO = new CanaisDTO();
       objCanaisDTO.setCanal(canal);
       objCanaisDTO.setTipo(tipo);
       objCanaisDTO.setNome(nome);
        
       if (tipo == "Meio de Pagamento") { 
            frmLoginTokenGUI objloginusergui = new frmLoginTokenGUI(objCanaisDTO);
            objloginusergui.setVisible(true);
            dispose();
          
        } else {                
            frmLoginUserSenhaGUI objloginusergui = new frmLoginUserSenhaGUI(objCanaisDTO);
            objloginusergui.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnCadastro1ActionPerformed

    
    
    
    
    
    
    
    }                                            
    
    
    
    private void btnCadastro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastro2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmAdicionarCanalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdicionarCanalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdicionarCanalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdicionarCanalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdicionarCanalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro1;
    private javax.swing.JButton btnCadastro2;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> txtCanal;
    private javax.swing.JTextField txtNome;
    private javax.swing.JComboBox<String> txtTipo;
    // End of variables declaration//GEN-END:variables
}
