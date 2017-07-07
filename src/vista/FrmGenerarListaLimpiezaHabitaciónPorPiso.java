/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JComboBox;

import javax.swing.JTextField;

/**
 *
 * @author windows
 */
public class FrmGenerarListaLimpiezaHabitaciónPorPiso extends javax.swing.JFrame {
 
    
        
    public FrmGenerarListaLimpiezaHabitaciónPorPiso() {
        initComponents();
        this.setLocationRelativeTo(null);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        cboPiso = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablalistaLH = new javax.swing.JTable();
        btnGuardarlh = new javax.swing.JButton();
        btnConsultarEmpleado = new javax.swing.JButton();
        btnCancelarLH = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcodSupe = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombreSuper = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generar Lista de Limpieza de Habitaciones por piso");
        setBackground(new java.awt.Color(255, 102, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboPiso.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.add(cboPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 80, 158, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("N° PISO:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 82, 75, 15));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("LISTA DE HABITACIONES POR LIMPIAR ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 132, -1, -1));

        TablalistaLH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° HABITACIÓN", "TIPO", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(TablalistaLH);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 153, 491, 106));

        btnGuardarlh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardarlh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        btnGuardarlh.setText("GUARDAR");
        btnGuardarlh.setName("GUARDAR"); // NOI18N
        btnGuardarlh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarlhActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarlh, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 424, 148, -1));

        btnConsultarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConsultarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuestion.png"))); // NOI18N
        btnConsultarEmpleado.setText("CONSULTAR");
        btnConsultarEmpleado.setName("CONSULTAR"); // NOI18N
        jPanel1.add(btnConsultarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 303, 149, -1));

        btnCancelarLH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelarLH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelarMantenimiento.png"))); // NOI18N
        btnCancelarLH.setText("CANCELAR");
        btnCancelarLH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarLHActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarLH, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 424, 134, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/room.png"))); // NOI18N
        jLabel7.setText("LISTA DE LIMPIEZA DE HABITACIONES POR PISO ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 11, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("DATOS SUPERVISOR DE PISO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 282, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Codigo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 315, -1, -1));
        jPanel1.add(txtcodSupe, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 313, 125, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Nombre y Apellidos:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 376, -1, -1));
        jPanel1.add(txtNombreSuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 374, 289, -1));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 270, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarlhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarlhActionPerformed
       // JOptionPane.showMessageDialog(null, "Se registro exitosamente");
        txtNombreSuper.setText("");
        txtcodSupe.setText("");
        
        
       
    }//GEN-LAST:event_btnGuardarlhActionPerformed

    private void btnCancelarLHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarLHActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnCancelarLHActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGenerarListaLimpiezaHabitaciónPorPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGenerarListaLimpiezaHabitaciónPorPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGenerarListaLimpiezaHabitaciónPorPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGenerarListaLimpiezaHabitaciónPorPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGenerarListaLimpiezaHabitaciónPorPiso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablalistaLH;
    public javax.swing.JButton btnCancelarLH;
    public javax.swing.JButton btnConsultarEmpleado;
    public javax.swing.JButton btnGuardarlh;
    public javax.swing.JComboBox cboPiso;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtNombreSuper;
    public javax.swing.JTextField txtcodSupe;
    // End of variables declaration//GEN-END:variables

    public JTextField getNombreSuper() {
        return txtNombreSuper;
    }

    public void setNombreSuper(JTextField NombreSuper) {
        this.txtNombreSuper = NombreSuper;
    }

 
    public JComboBox getCbmPiso() {
        return cboPiso;
    }

    public void setCbmPiso(JComboBox cbmPiso) {
        this.cboPiso = cbmPiso;
    }

    public JTextField getCodSupe() {
        return txtcodSupe;
    }

    public void setCodSupe(JTextField codSupe) {
        this.txtcodSupe = codSupe;
    }

}
