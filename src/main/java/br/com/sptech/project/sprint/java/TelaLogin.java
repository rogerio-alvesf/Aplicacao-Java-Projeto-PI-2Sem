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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblInformacaoMaquina = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("LOGIN PARA ARMAZENAR INFORMAÇÕES DA MÁQUINA");

        txtNumeracaoMaquina.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeracaoMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeracaoMaquinaActionPerformed(evt);
            }
        });

        txtSenhaMaquina.setBackground(new java.awt.Color(255, 255, 255));

        label2.setName(""); // NOI18N
        label2.setText("Nº da máquina:");

        label3.setName(""); // NOI18N
        label3.setText("Senha:");

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo-1.png"))); // NOI18N

        lblInformacaoMaquina.setColumns(20);
        lblInformacaoMaquina.setRows(5);
        lblInformacaoMaquina.setEnabled(false);
        jScrollPane1.setViewportView(lblInformacaoMaquina);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(550, 550, 550)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(660, 660, 660)
                        .addComponent(txtNumeracaoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(660, 660, 660)
                        .addComponent(txtSenhaMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(620, 620, 620)
                        .addComponent(btnAcessarMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txtNumeracaoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(txtSenhaMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnAcessarMaquina))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        label1.getAccessibleContext().setAccessibleName("LOGAR PARA ARMAZENAR INFORMAÇÕES DA MÁQUINA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel1;
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
