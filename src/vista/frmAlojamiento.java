/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.CtrAlojamiento;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *GRUPO ALOJAMIENTO
 * @author Luis Fernando
 */
public class frmAlojamiento extends javax.swing.JFrame {

    /**
     * Creates new form frmAlojamiento
     */
    
    CtrAlojamiento Alojamientov1 = new CtrAlojamiento();
    
    
    public frmAlojamiento() {
        initComponents();
        Alojamientov1.interfaz_detalle_huesped_alojamiento();
        Alojamientov1.tamaño_tabla_huesped_alojamiento();
        Alojamientov1.Cambio_de_fecha_llegada();
        Alojamientov1.Cambio_de_fecha_salida();
        Alojamientov1.inhabilitar();
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtidAlojamiento = new javax.swing.JTextField();
        btnConsultarCodigoResreva = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTitular = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtidReserva = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFechaLLegada = new com.toedter.calendar.JDateChooser();
        txtfechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_Detalle_Huesped = new javax.swing.JTable();
        idRegistrar_Alojamiento = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtCantDias = new javax.swing.JTextField();
        btnBuscarReserva = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Reserva :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtidAlojamiento.setEditable(false);
        getContentPane().add(txtidAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 40, -1));

        btnConsultarCodigoResreva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Consultar Reserva.png"))); // NOI18N
        btnConsultarCodigoResreva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCodigoResrevaActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultarCodigoResreva, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 30, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("ALOJAMIENTO");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Titular :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        getContentPane().add(txtTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Codigo  :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        txtidReserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidReservaKeyTyped(evt);
            }
        });
        getContentPane().add(txtidReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 160, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("F. llegada:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));
        getContentPane().add(txtFechaLLegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 160, -1));
        getContentPane().add(txtfechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("F. Salida:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Acompañantes :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jScrollPane1.setViewportView(TB_Detalle_Huesped);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 640, 140));

        idRegistrar_Alojamiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idRegistrar_Alojamiento.setText("Registrar");
        idRegistrar_Alojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idRegistrar_AlojamientoActionPerformed(evt);
            }
        });
        getContentPane().add(idRegistrar_Alojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 130, -1));

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 120, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Cerrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 120, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Cant. Dias:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));
        getContentPane().add(txtCantDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 160, -1));

        btnBuscarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar Reserva.png"))); // NOI18N
        btnBuscarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarReservaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 30, -1));

        setSize(new java.awt.Dimension(676, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarCodigoResrevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCodigoResrevaActionPerformed
        
        Alojamientov1.VCTextoIdR(txtidReserva.getText());
        try {
            // TODO add your handling code here:
            Alojamientov1.Limpiar_Tabla_huesped_alojamiento();
            Alojamientov1.Conusltar_Reserva();
        } catch (ParseException ex) {
            Logger.getLogger(frmAlojamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConsultarCodigoResrevaActionPerformed

    private void btnBuscarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReservaActionPerformed
        // TODO add your handling code here:
        frmBuscarReserva  buscar = new frmBuscarReserva();
        buscar.show();
    }//GEN-LAST:event_btnBuscarReservaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
         System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void idRegistrar_AlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idRegistrar_AlojamientoActionPerformed
        // TODO add your handling code here:
        Alojamientov1.Registrar_alojamiento();
    }//GEN-LAST:event_idRegistrar_AlojamientoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        Alojamientov1.limpiar();
        Alojamientov1.inhabilitar();
        Alojamientov1.Limpiar_Tabla_huesped_alojamiento();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtidReservaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidReservaKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar))
        {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numero");
        }
        
    }//GEN-LAST:event_txtidReservaKeyTyped

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
            java.util.logging.Logger.getLogger(frmAlojamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAlojamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAlojamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAlojamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAlojamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TB_Detalle_Huesped;
    private javax.swing.JButton btnBuscarReserva;
    private javax.swing.JButton btnConsultarCodigoResreva;
    public static javax.swing.JButton btnLimpiar;
    public static javax.swing.JButton idRegistrar_Alojamiento;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txtCantDias;
    public static com.toedter.calendar.JDateChooser txtFechaLLegada;
    public static javax.swing.JTextField txtTitular;
    public static com.toedter.calendar.JDateChooser txtfechaSalida;
    public static javax.swing.JTextField txtidAlojamiento;
    public static javax.swing.JTextField txtidReserva;
    // End of variables declaration//GEN-END:variables
}
