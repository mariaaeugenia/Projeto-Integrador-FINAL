/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteFuncionario;

import Classes.Chale;
import com.senai.projetointegrador.persistencia.ChalePersistencia;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author MaryBeds
 */
public class ReservarChale extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReservarChale
     */
    
 
    public ReservarChale() {
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

        jPanel1 = new javax.swing.JPanel();
        VoltarPressed = new javax.swing.JButton();
        voltarLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        statusLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numeroChale = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        socioComboBox = new javax.swing.JComboBox<>();
        ReservarPressed = new javax.swing.JButton();
        ExcluirPressed = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dataTxtField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        VoltarPressed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        VoltarPressed.setBorderPainted(false);
        VoltarPressed.setContentAreaFilled(false);
        VoltarPressed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarPressedActionPerformed(evt);
            }
        });

        voltarLbl.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        voltarLbl.setForeground(new java.awt.Color(158, 189, 83));
        voltarLbl.setText("VOLTAR");

        jLabel2.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("STATUS:");

        statusLbl.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        statusLbl.setForeground(new java.awt.Color(153, 153, 153));
        statusLbl.setText("LIVRE");

        jLabel3.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("SÓCIO:");

        numeroChale.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        numeroChale.setForeground(new java.awt.Color(153, 153, 153));
        numeroChale.setText("1234312");

        jLabel4.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("DESCRIÇÃO:");

        descricao.setColumns(20);
        descricao.setRows(5);
        descricao.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(descricao);

        jLabel5.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("NÚMERO:");

        socioComboBox.setBackground(new java.awt.Color(255, 255, 255));
        socioComboBox.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        socioComboBox.setForeground(new java.awt.Color(153, 153, 153));
        socioComboBox.setMaximumRowCount(100);

        ReservarPressed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Reservar.png"))); // NOI18N
        ReservarPressed.setBorderPainted(false);
        ReservarPressed.setContentAreaFilled(false);
        ReservarPressed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarPressedActionPerformed(evt);
            }
        });

        ExcluirPressed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Excluir.png"))); // NOI18N
        ExcluirPressed.setBorderPainted(false);
        ExcluirPressed.setContentAreaFilled(false);
        ExcluirPressed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirPressedActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("DATA DA RESERVA:");

        dataTxtField.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        dataTxtField.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(VoltarPressed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(voltarLbl)
                        .addGap(163, 163, 163)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusLbl)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 106, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(socioComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)
                                    .addComponent(numeroChale, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(dataTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(120, 120, 120))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ReservarPressed, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(ExcluirPressed, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VoltarPressed)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(voltarLbl)
                            .addComponent(jLabel2)
                            .addComponent(statusLbl))))
                .addGap(149, 149, 149)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroChale)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(socioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dataTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ReservarPressed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExcluirPressed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarPressedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarPressedActionPerformed
        // TODO add your handling code here:
        ChalesView chalesFrame = new ChalesView();
        chalesFrame.setVisible(false);
    }//GEN-LAST:event_VoltarPressedActionPerformed

    private void ReservarPressedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarPressedActionPerformed
        // TODO add your handling code here:
        try {
            String socio = (String)socioComboBox.getSelectedItem();
            int socioSelecionado = socioComboBox.getSelectedIndex();
            String status = "LIVRE";
            String dataReserva = dataTxtField.getText();
            int numChale = Integer.parseInt(numeroChale.getText());
            Chale objeto = new Chale(dataReserva, socioSelecionado, numChale);
            
            // enviar para o banco de dados
            ChalePersistencia objetoPesistencia = new ChalePersistencia();
            objetoPesistencia.incluir(objeto);
         
            
        } catch (NumberFormatException | SQLException erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_ReservarPressedActionPerformed

    private void ExcluirPressedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirPressedActionPerformed
        // TODO add your handling code here:
        try {
            int numero = Integer.parseInt(numeroChale.getText());
            // enviar para o banco de dados
            ChalePersistencia objetoPesistencia = new ChalePersistencia();
            objetoPesistencia.excluir(numero);
            ChalesView chalesFrame = new ChalesView();
            chalesFrame.setVisible(false);

        } catch (NumberFormatException | SQLException erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        }
    }//GEN-LAST:event_ExcluirPressedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExcluirPressed;
    private javax.swing.JButton ReservarPressed;
    private javax.swing.JButton VoltarPressed;
    private javax.swing.JTextField dataTxtField;
    private javax.swing.JTextArea descricao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel numeroChale;
    private javax.swing.JComboBox<String> socioComboBox;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JLabel voltarLbl;
    // End of variables declaration//GEN-END:variables
}
