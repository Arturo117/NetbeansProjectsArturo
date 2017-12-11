/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.*;
import java.text.SimpleDateFormat;
/**
 *
 * @author cipri
 */
public class JFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    ControllerReports controller = new ControllerReports();
    public JFrame() {
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

        ExecuteReport = new javax.swing.JButton();
        txtParameter = new javax.swing.JTextField();
        SendParameter = new javax.swing.JButton();
        ExecuteQuery = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        SendParameterToQuery = new javax.swing.JButton();
        ExecuteBarChartReport = new javax.swing.JButton();
        fecha1 = new com.toedter.calendar.JDateChooser();
        fecha2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EnviarFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ExecuteReport.setText("Execute Report");
        ExecuteReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecuteReportActionPerformed(evt);
            }
        });

        SendParameter.setText("Send Parameter");
        SendParameter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendParameterActionPerformed(evt);
            }
        });

        ExecuteQuery.setText("Execute Query");
        ExecuteQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecuteQueryActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        SendParameterToQuery.setText("Send Parameter to Query");
        SendParameterToQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendParameterToQueryActionPerformed(evt);
            }
        });

        ExecuteBarChartReport.setText("Execute BarChartReport");
        ExecuteBarChartReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExecuteBarChartReportActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha de Inicio:");

        jLabel2.setText("Fecha de Termino:");

        EnviarFecha.setText("Enviar");
        EnviarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ExecuteBarChartReport)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(SendParameterToQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtName)
                        .addComponent(ExecuteQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SendParameter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtParameter)
                        .addComponent(ExecuteReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EnviarFecha)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExecuteReport)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtParameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SendParameter)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ExecuteQuery)
                    .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnviarFecha)
                .addGap(1, 1, 1)
                .addComponent(SendParameterToQuery)
                .addGap(18, 18, 18)
                .addComponent(ExecuteBarChartReport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExecuteReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecuteReportActionPerformed
        // TODO add your handling code here:
        controller.executeReport();
        setVisible(true);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_ExecuteReportActionPerformed

    private void SendParameterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendParameterActionPerformed
        // TODO add your handling code here:
        controller.executeReportWithParameters(txtParameter.getText());
    }//GEN-LAST:event_SendParameterActionPerformed

    private void ExecuteQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecuteQueryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExecuteQueryActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        
    }//GEN-LAST:event_txtNameActionPerformed

    private void SendParameterToQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendParameterToQueryActionPerformed
        // TODO add your handling code here:
        controller.executeReportWithSql(txtName.getText());
    }//GEN-LAST:event_SendParameterToQueryActionPerformed

    private void ExecuteBarChartReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExecuteBarChartReportActionPerformed
        controller.executeBarChartReport();
        setVisible(true);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_ExecuteBarChartReportActionPerformed

    private void EnviarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarFechaActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat formatBirthDay = new SimpleDateFormat("yyyy-MM-dd");
        String birthday1 = formatBirthDay.format(fecha1.getDate());
        String birthday2 = formatBirthDay.format(fecha2.getDate());
        System.out.println(birthday1);
        System.out.println(birthday2);
        controller.executeReportWhitRange(birthday1, birthday2);
    }//GEN-LAST:event_EnviarFechaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnviarFecha;
    private javax.swing.JButton ExecuteBarChartReport;
    private javax.swing.JButton ExecuteQuery;
    private javax.swing.JButton ExecuteReport;
    private javax.swing.JButton SendParameter;
    private javax.swing.JButton SendParameterToQuery;
    private com.toedter.calendar.JDateChooser fecha1;
    private com.toedter.calendar.JDateChooser fecha2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtParameter;
    // End of variables declaration//GEN-END:variables
}
