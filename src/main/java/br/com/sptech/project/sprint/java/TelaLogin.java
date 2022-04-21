package br.com.sptech.project.sprint.java;

import static br.com.sptech.project.sprint.java.App.ColetarDados;
import java.awt.Color;
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

        btnAcessarMaquina.setBackground(new java.awt.Color(49, 179, 205));
        btnAcessarMaquina.setForeground(new java.awt.Color(0, 0, 0));
        btnAcessarMaquina.setText("ACESSAR");
        btnAcessarMaquina.setBorder(null);
        btnAcessarMaquina.setBorderPainted(false);
        btnAcessarMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAcessarMaquina.setHideActionText(true);
        btnAcessarMaquina.setMinimumSize(new java.awt.Dimension(100, 32));
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
                .addGap(400, 400, 400)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtNumeracaoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(txtSenhaMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAcessarMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeracaoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenhaMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnAcessarMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        label1.getAccessibleContext().setAccessibleName("LOGAR PARA ARMAZENAR INFORMAÇÕES DA MÁQUINA");

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

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
            lblInformacaoMaquina.setText(String.format("Máquina %s está logado.",
                    maquinaAcessada.getNumeracaoMaquina()));
            ColetarDados(numeracaoMaquinaDigitado);
            btnAcessarMaquina.setEnabled(false);
            btnAcessarMaquina.setBackground(Color.GRAY);
            
        }else {
            lblInformacaoMaquina.setText("Computador não está cadastrado.");
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
