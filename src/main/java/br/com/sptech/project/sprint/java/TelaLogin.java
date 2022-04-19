package br.com.sptech.project.sprint.java;

import static br.com.sptech.project.sprint.java.App.ColetarDados;
import java.util.Scanner;
import models.Login;

public class TelaLogin extends javax.swing.JFrame {
    
    Maquina maquinaAcessada = new Maquina();
    
    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        txtNumeracaoMaquina = new javax.swing.JTextField();
        txtSenhaMaquina = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        btnAcessarMaquina = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblInformacaoMaquina = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("LOGIN PARA ARMAZENAR INFORMAÇÕES DA MÁQUINA");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 61, -1, -1));
        label1.getAccessibleContext().setAccessibleName("LOGAR PARA ARMAZENAR INFORMAÇÕES DA MÁQUINA");

        txtNumeracaoMaquina.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeracaoMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeracaoMaquinaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumeracaoMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 111, 130, -1));

        txtSenhaMaquina.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtSenhaMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 153, 130, -1));

        label2.setName(""); // NOI18N
        label2.setText("Nº da máquina:");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 116, -1, -1));

        label3.setName(""); // NOI18N
        label3.setText("Senha:");
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 158, -1, -1));

        btnAcessarMaquina.setBackground(new java.awt.Color(76, 136, 171));
        btnAcessarMaquina.setForeground(new java.awt.Color(0, 0, 0));
        btnAcessarMaquina.setText("Acessar");
        btnAcessarMaquina.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAcessarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAcessarMaquina.setHideActionText(true);
        btnAcessarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarMaquinaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAcessarMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 201, 74, -1));

        lblInformacaoMaquina.setColumns(20);
        lblInformacaoMaquina.setRows(5);
        lblInformacaoMaquina.setEnabled(false);
        jScrollPane1.setViewportView(lblInformacaoMaquina);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 235, 280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeracaoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeracaoMaquinaActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeracaoMaquinaActionPerformed

    private void btnAcessarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarMaquinaActionPerformed
        // TODO add your handling code here:

        Integer leitorNumeracaoMaquina = Integer.valueOf(txtNumeracaoMaquina.getText());
        String leitorSenhaMaquina = txtSenhaMaquina.getText();
        Maquina maquinaAcessada = new Maquina();

        lblInformacaoMaquina.setText("Logar máquina para gerar coletar i"
                + "\nQual a numeração da máquina:");

        Integer numeracaoMaquinaDigitado = leitorNumeracaoMaquina;

        maquinaAcessada.setNumeracaoMaquina(numeracaoMaquinaDigitado);

        while (maquinaAcessada.validarNumeracao(numeracaoMaquinaDigitado) == false) {
            lblInformacaoMaquina.setText("Númeração da máquina está inválida. Dígite "
                    + "uma numeração de máquina válida:");
            numeracaoMaquinaDigitado = leitorNumeracaoMaquina;
            maquinaAcessada.setNumeracaoMaquina(numeracaoMaquinaDigitado);
        }

        lblInformacaoMaquina.setText("Qual a senha de acesso da máquina:");
        String senhaMaquinaDigitado = leitorSenhaMaquina;

        maquinaAcessada.setSenhaAcessoMaquina(senhaMaquinaDigitado);

        while (maquinaAcessada.validarSenha(senhaMaquinaDigitado) == false) {
            lblInformacaoMaquina.setText("Senha da máquina está inválida. Dígite uma "
                    + "senha de máquina válida:");
            senhaMaquinaDigitado = leitorSenhaMaquina;
            maquinaAcessada.setSenhaAcessoMaquina(senhaMaquinaDigitado);
        }

        Boolean respostaLogin = Login.realizarLogin(
                numeracaoMaquinaDigitado,
                senhaMaquinaDigitado);

        if (respostaLogin) {
            lblInformacaoMaquina.setText(String.format("Máquina %s está logada.",
                    maquinaAcessada.getNumeracaoMaquina()));
            ColetarDados(numeracaoMaquinaDigitado);
        }else {
            lblInformacaoMaquina.setText("Computador não exite!!!");
        }
    }//GEN-LAST:event_btnAcessarMaquinaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                TelaLogin telaLogin = new TelaLogin();
                telaLogin.setExtendedState(6);
                telaLogin.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessarMaquina;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JTextArea lblInformacaoMaquina;
    private javax.swing.JTextField txtNumeracaoMaquina;
    private javax.swing.JTextField txtSenhaMaquina;
    // End of variables declaration//GEN-END:variables
}
