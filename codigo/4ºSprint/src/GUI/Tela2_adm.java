/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import dao.UsuarioDAO;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Login;

/**
 *
 * @author Aluno
 */
public class Tela2_adm extends javax.swing.JFrame {

    /**
     * Creates new form Tela2
     */
    public Tela2_adm() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtExibirSenha = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        roxo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        btnSenha = new javax.swing.JCheckBox();
        botaoEntrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(530, 530));

        txtExibirSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtExibirSenha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(68, 18, 69));
        jLabel4.setText("Insira sua senha:");
        txtExibirSenha.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 300, 30));

        roxo.setBackground(new java.awt.Color(255, 255, 255));
        roxo.setMaximumSize(new java.awt.Dimension(800, 900));
        roxo.setMinimumSize(new java.awt.Dimension(1200, 400));
        roxo.setPreferredSize(new java.awt.Dimension(500, 900));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carrinho.png"))); // NOI18N

        javax.swing.GroupLayout roxoLayout = new javax.swing.GroupLayout(roxo);
        roxo.setLayout(roxoLayout);
        roxoLayout.setHorizontalGroup(
            roxoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roxoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(494, Short.MAX_VALUE))
        );
        roxoLayout.setVerticalGroup(
            roxoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roxoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        txtExibirSenha.add(roxo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 800, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(180, 870));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );

        txtExibirSenha.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 870));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        txtExibirSenha.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 530, 50));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/220 × 116.png"))); // NOI18N
        txtExibirSenha.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(68, 18, 69));
        jLabel3.setText("Senha Administrador");
        txtExibirSenha.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 62, 21));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Voltar");
        jButton1.setPreferredSize(new java.awt.Dimension(126, 41));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        txtExibirSenha.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 150, 40));

        txtSenha.setBackground(new java.awt.Color(204, 204, 204));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtExibirSenha.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 410, 40));

        btnSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSenhaActionPerformed(evt);
            }
        });
        txtExibirSenha.add(btnSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        botaoEntrar.setBackground(new java.awt.Color(255, 62, 0));
        botaoEntrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        botaoEntrar.setForeground(new java.awt.Color(255, 255, 255));
        botaoEntrar.setText("Entrar");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });
        txtExibirSenha.add(botaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 150, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        txtExibirSenha.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        getContentPane().add(txtExibirSenha, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tela1 tela2 = new Tela1();
        tela2.setVisible(true); //abri a pagina se o login for correto

        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        try {
            String senha;

            senha = txtSenha.getText();

            Login objlogin = new Login();
            objlogin.setSenha(senha);

            UsuarioDAO objlogindao = new UsuarioDAO();
            ResultSet rslogindao = objlogindao.autenticacaoUsuario(objlogin);

            if (rslogindao.next()) {
                //chamar tela que eu quero abrir
                Tela4_adm tela4 = new Tela4_adm();
                tela4.setVisible(true); //abri a pagina se o login for correto

                dispose(); //fecha a tela de login
            } else {
                //enviar mensagem dizendo erro
                JOptionPane.showMessageDialog(null, "Usuario ou senha incorreta");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FRMLoginGUI" + erro);

        }

    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSenhaActionPerformed
        if (btnSenha.isSelected()) {
            txtSenha.setEchoChar((char)0); //password = JPasswordField
        } else {
            txtSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_btnSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(Tela2_adm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela2_adm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela2_adm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela2_adm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela2_adm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JCheckBox btnSenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel roxo;
    private javax.swing.JPanel txtExibirSenha;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
