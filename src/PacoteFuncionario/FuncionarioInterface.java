/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteFuncionario;

/**
 *
 * @author MaryBeds
 */
public class FuncionarioInterface extends javax.swing.JFrame {

    /**
     * Creates new form FuncionarioInterface
     */

    private boolean isSocios = true;
    private boolean isCadastrarSocios = false;
    private boolean isChales = false;
    private boolean isCadastrarChales = false;
    private boolean isAutorizarSocio = false;
    private boolean isDetalheSocio = false;
    private boolean isEntradaSaida = false;

    SociosView socioFrame = new SociosView();
    CadastroSocioView cadastroSocioFrame = new CadastroSocioView();
    ChalesView chalesFrame = new ChalesView();
    CadastroChalesView cadastroChaleFrame = new CadastroChalesView();
    AutorizarSocioView autorizarFrame = new AutorizarSocioView();
    DetalheSocioView detalheSocioFrame = new DetalheSocioView();
    EntradaSaidaView entradaSaidaFrame = new EntradaSaidaView();

    public FuncionarioInterface() {
        initComponents();

        DesktopMenu.add(socioFrame);
        socioFrame.setVisible(true);
        socioFrame.setUI(null);

        DesktopMenu.add(cadastroSocioFrame);
        cadastroSocioFrame.setVisible(false);
        cadastroSocioFrame.setUI(null);

        DesktopMenu.add(chalesFrame);
        chalesFrame.setVisible(false);
        chalesFrame.setUI(null);

        DesktopMenu.add(cadastroChaleFrame);
        cadastroChaleFrame.setVisible(false);
        cadastroChaleFrame.setUI(null);
        
        DesktopMenu.add(autorizarFrame);
        autorizarFrame.setVisible(false);
        autorizarFrame.setUI(null);
        
        DesktopMenu.add(entradaSaidaFrame);
        entradaSaidaFrame.setVisible(false);
        entradaSaidaFrame.setUI(null);
        
//        DesktopMenu.add(detalheSocioFrame);
//        detalheSocioFrame.setVisible(false);
//        detalheSocioFrame.setUI(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        CadastrarSocioPressed = new javax.swing.JButton();
        SociosPressed = new javax.swing.JButton();
        ChalesPressed = new javax.swing.JButton();
        CadastrarChalesPressed = new javax.swing.JButton();
        RegistrarInOut = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        AutorizarSocioPressed = new javax.swing.JButton();
        DesktopMenu = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(158, 189, 83));

        CadastrarSocioPressed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Funcionario/CadastrarSocio.png"))); // NOI18N
        CadastrarSocioPressed.setBorderPainted(false);
        CadastrarSocioPressed.setContentAreaFilled(false);
        CadastrarSocioPressed.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Funcionario/CadastrarSocioPressed.png"))); // NOI18N
        CadastrarSocioPressed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarSocioPressedActionPerformed(evt);
            }
        });

        SociosPressed.setBackground(new java.awt.Color(158, 189, 83));
        SociosPressed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Funcionario/Socios.png"))); // NOI18N
        SociosPressed.setBorderPainted(false);
        SociosPressed.setContentAreaFilled(false);
        SociosPressed.setSelected(true);
        SociosPressed.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Funcionario/SociosPresed.png"))); // NOI18N
        SociosPressed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SociosPressedActionPerformed(evt);
            }
        });

        ChalesPressed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Funcionario/Chales.png"))); // NOI18N
        ChalesPressed.setBorderPainted(false);
        ChalesPressed.setContentAreaFilled(false);
        ChalesPressed.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Funcionario/ChalesPressed.png"))); // NOI18N
        ChalesPressed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChalesPressedActionPerformed(evt);
            }
        });

        CadastrarChalesPressed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Funcionario/CadastrarChales.png"))); // NOI18N
        CadastrarChalesPressed.setBorderPainted(false);
        CadastrarChalesPressed.setContentAreaFilled(false);
        CadastrarChalesPressed.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Funcionario/CadastrarChalesPressed.png"))); // NOI18N
        CadastrarChalesPressed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarChalesPressedActionPerformed(evt);
            }
        });

        RegistrarInOut.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        RegistrarInOut.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarInOut.setText("Registrar Entrada/Saída");
        RegistrarInOut.setBorderPainted(false);
        RegistrarInOut.setContentAreaFilled(false);
        RegistrarInOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarInOutActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Sair");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);

        AutorizarSocioPressed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Diretor/AutorizarSocio.png"))); // NOI18N
        AutorizarSocioPressed.setBorderPainted(false);
        AutorizarSocioPressed.setContentAreaFilled(false);
        AutorizarSocioPressed.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Diretor/AutorizarSocioPressed.png"))); // NOI18N
        AutorizarSocioPressed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorizarSocioPressedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SociosPressed))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(RegistrarInOut))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AutorizarSocioPressed))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CadastrarSocioPressed))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CadastrarChalesPressed))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ChalesPressed)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(142, 142, 142))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegistrarInOut)
                .addGap(132, 132, 132)
                .addComponent(SociosPressed)
                .addGap(18, 18, 18)
                .addComponent(AutorizarSocioPressed)
                .addGap(18, 18, 18)
                .addComponent(CadastrarSocioPressed)
                .addGap(18, 18, 18)
                .addComponent(CadastrarChalesPressed)
                .addGap(18, 18, 18)
                .addComponent(ChalesPressed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(17, 17, 17))
        );

        DesktopMenu.setBackground(new java.awt.Color(255, 255, 255));
        DesktopMenu.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        DesktopMenu.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DesktopMenu))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DesktopMenu)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SociosPressedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SociosPressedActionPerformed
        // TODO add your handling code here:
        if (isSocios) {
            isSocios = false;
            SociosPressed.setSelected(false);
            socioFrame.setVisible(false);

        } else {

            isSocios = true;
            isCadastrarSocios = false;
            isChales = false;
            isCadastrarChales = false;
            isAutorizarSocio = false;
            isDetalheSocio = false;
            isEntradaSaida = false;

            SociosPressed.setSelected(true);
            CadastrarSocioPressed.setSelected(false);
            ChalesPressed.setSelected(false);
            CadastrarChalesPressed.setSelected(false);
            AutorizarSocioPressed.setSelected(false);
            RegistrarInOut.setSelected(false);

            socioFrame.setVisible(true);
            cadastroSocioFrame.setVisible(false);
            chalesFrame.setVisible(false);
            cadastroChaleFrame.setVisible(false);
            autorizarFrame.setVisible(false);
            entradaSaidaFrame.setVisible(false);

        }
    }//GEN-LAST:event_SociosPressedActionPerformed

    private void CadastrarSocioPressedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarSocioPressedActionPerformed
        // TODO add your handling code here:
        if (isCadastrarSocios) {
            isCadastrarSocios = false;
            CadastrarSocioPressed.setSelected(false);
            cadastroSocioFrame.setVisible(false);

        } else {

            isCadastrarSocios = true;
            isSocios = false;
            isChales = false;
            isCadastrarChales = false;
            isAutorizarSocio = false;
            isDetalheSocio = false;
            isEntradaSaida = false;

            CadastrarSocioPressed.setSelected(true);
            SociosPressed.setSelected(false);
            ChalesPressed.setSelected(false);
            CadastrarChalesPressed.setSelected(false);
            AutorizarSocioPressed.setSelected(false);
            RegistrarInOut.setSelected(false);
            
            cadastroSocioFrame.setVisible(true);
            socioFrame.setVisible(false);
            chalesFrame.setVisible(false);
            cadastroChaleFrame.setVisible(false);
            autorizarFrame.setVisible(false);
            detalheSocioFrame.setVisible(false);
            entradaSaidaFrame.setVisible(false);

        }
    }//GEN-LAST:event_CadastrarSocioPressedActionPerformed

    private void ChalesPressedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChalesPressedActionPerformed
        // TODO add your handling code here:
        if (isChales) {
            isChales = false;
            ChalesPressed.setSelected(false);
            chalesFrame.setVisible(false);

        } else {

            isChales = true;
            isSocios = false;
            isCadastrarSocios = false;
            isCadastrarChales = false;
            isAutorizarSocio = false;
            isDetalheSocio = false;
            isEntradaSaida = false;

            ChalesPressed.setSelected(true);
            CadastrarSocioPressed.setSelected(false);
            SociosPressed.setSelected(false);
            CadastrarChalesPressed.setSelected(false);
            AutorizarSocioPressed.setSelected(false);
            RegistrarInOut.setSelected(false);
            
            chalesFrame.setVisible(true);
            cadastroSocioFrame.setVisible(false);
            socioFrame.setVisible(false);
            cadastroSocioFrame.setVisible(false);
            autorizarFrame.setVisible(false);
            detalheSocioFrame.setVisible(false);
            entradaSaidaFrame.setVisible(false);

        }
    }//GEN-LAST:event_ChalesPressedActionPerformed

    private void CadastrarChalesPressedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarChalesPressedActionPerformed
        // TODO add your handling code here:
        if (isCadastrarChales) {
            isCadastrarChales = false;
            CadastrarChalesPressed.setSelected(false);
            chalesFrame.setVisible(false);

        } else {

            isCadastrarChales = true;
            isSocios = false;
            isCadastrarSocios = false;
            isChales = false;
            isAutorizarSocio = false;
            isDetalheSocio = false;
            isEntradaSaida = false;

            CadastrarChalesPressed.setSelected(true);
            CadastrarSocioPressed.setSelected(false);
            SociosPressed.setSelected(false);
            ChalesPressed.setSelected(false);
            AutorizarSocioPressed.setSelected(false);
            RegistrarInOut.setSelected(false);

            cadastroChaleFrame.setVisible(true);
            cadastroSocioFrame.setVisible(false);
            socioFrame.setVisible(false);
            chalesFrame.setVisible(false);
            autorizarFrame.setVisible(false);
            detalheSocioFrame.setVisible(false);
            entradaSaidaFrame.setVisible(false);

        }
    }//GEN-LAST:event_CadastrarChalesPressedActionPerformed

    private void AutorizarSocioPressedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorizarSocioPressedActionPerformed
        // TODO add your handling code here:
        if (isAutorizarSocio) {
            isAutorizarSocio = false;
            AutorizarSocioPressed.setSelected(false);
            autorizarFrame.setVisible(false);

        } else {

            isAutorizarSocio = true;
            isCadastrarChales = false;
            isSocios = false;
            isCadastrarSocios = false;
            isChales = false;
            isDetalheSocio = false;
            isEntradaSaida = false;
            

            AutorizarSocioPressed.setSelected(true);
            CadastrarChalesPressed.setSelected(false);
            CadastrarSocioPressed.setSelected(false);
            SociosPressed.setSelected(false);
            ChalesPressed.setSelected(false);
            RegistrarInOut.setSelected(false);
            entradaSaidaFrame.setVisible(false);

            autorizarFrame.setVisible(true);
            cadastroChaleFrame.setVisible(false);
            cadastroSocioFrame.setVisible(false);
            socioFrame.setVisible(false);
            chalesFrame.setVisible(false);
            detalheSocioFrame.setVisible(false);

        }
    }//GEN-LAST:event_AutorizarSocioPressedActionPerformed

    private void RegistrarInOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarInOutActionPerformed
        // TODO add your handling code here:
        
        if (isEntradaSaida) {
            isEntradaSaida = false;
            RegistrarInOut.setSelected(false);
            entradaSaidaFrame.setVisible(false);

        } else {
            
            entradaSaidaFrame = new EntradaSaidaView();
            DesktopMenu.add(entradaSaidaFrame);
            entradaSaidaFrame.setVisible(false);
            entradaSaidaFrame.setUI(null);
        
            isEntradaSaida = true;
            isAutorizarSocio = false;
            isCadastrarChales = false;
            isSocios = false;
            isCadastrarSocios = false;
            isChales = false;
            isDetalheSocio = false;
            
            RegistrarInOut.setSelected(true);
            AutorizarSocioPressed.setSelected(false);
            CadastrarChalesPressed.setSelected(false);
            CadastrarSocioPressed.setSelected(false);
            SociosPressed.setSelected(false);
            ChalesPressed.setSelected(false);

            autorizarFrame.setVisible(false);
            cadastroChaleFrame.setVisible(false);
            cadastroSocioFrame.setVisible(false);
            socioFrame.setVisible(false);
            chalesFrame.setVisible(false);
            detalheSocioFrame.setVisible(false);

        }
    }//GEN-LAST:event_RegistrarInOutActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionarioInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AutorizarSocioPressed;
    private javax.swing.JButton CadastrarChalesPressed;
    private javax.swing.JButton CadastrarSocioPressed;
    private javax.swing.JButton ChalesPressed;
    private javax.swing.JDesktopPane DesktopMenu;
    private javax.swing.JButton RegistrarInOut;
    private javax.swing.JButton SociosPressed;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
