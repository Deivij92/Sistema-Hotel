/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author usuario-pc
 */
public class FrmMantenerRegistroDeLimpiezaDeHabitacion extends javax.swing.JFrame {

    /**
     * Creates new form MantenerRegistroDeLimpiezaDeHabitacion
     */
    public FrmMantenerRegistroDeLimpiezaDeHabitacion() {
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

        jLabel5 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBuscarP = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCodigoEmpleado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtTurno = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbporhacer = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHab = new javax.swing.JTable();
        txtcodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNhabitacion = new javax.swing.JTextField();
        txtDescripcionHabitacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFechaActual = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANTENER REGISTRO DE LIMPIEZA DE HABITACIÓN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("FECHA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 50, 20));

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar.Mantenimiento.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 180, 50));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.Mantenimiento.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 180, 50));

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.mantenimiento.png"))); // NOI18N
        btnModificar.setText("ACTUALIZAR");
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 160, 50));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.Mantenimiento.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 160, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("DATOS DE HABITACIÓN DESOCUPAS ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de limpieza de habitación");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1070, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("DATOS DE PERSONAL DE LIMPIEZA:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 230, -1));

        btnBuscarP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBuscarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.Mantenimiento.png"))); // NOI18N
        btnBuscarP.setText("BUSCAR");
        btnBuscarP.setActionCommand("BUSCARP");
        getContentPane().add(btnBuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 190, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("CÓDIGO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 20));

        txtCodigoEmpleado.setEditable(false);
        getContentPane().add(txtCodigoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 110, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("NOMBRE:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, 20));

        txtNombreEmpleado.setEditable(false);
        getContentPane().add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 380, 30));

        txtTurno.setEditable(false);
        getContentPane().add(txtTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 190, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("TURNO:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, 20));

        tbporhacer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "N° HABITACIÓN", "TIPO HABITACIÓN", "PERSONAL"
            }
        ));
        jScrollPane2.setViewportView(tbporhacer);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 530, 210));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 10, 280));

        tablaHab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NUMERO", "DESCRIPCION", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(tablaHab);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 100));

        txtcodigo.setEditable(false);
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 100, -1));

        jLabel2.setText("Codigo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 60, -1));

        jLabel4.setText("NºHabitacion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        txtNhabitacion.setEditable(false);
        getContentPane().add(txtNhabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 110, -1));

        txtDescripcionHabitacion.setEditable(false);
        getContentPane().add(txtDescripcionHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 340, -1));

        jLabel6.setText("DescripcionH");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("REGISTRO  DE HABITACIONES ASIGNADAS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, -1, -1));

        txtFechaActual.setEditable(false);
        txtFechaActual.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        getContentPane().add(txtFechaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmMantenerRegistroDeLimpiezaDeHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMantenerRegistroDeLimpiezaDeHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMantenerRegistroDeLimpiezaDeHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMantenerRegistroDeLimpiezaDeHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMantenerRegistroDeLimpiezaDeHabitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscarP;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable tablaHab;
    public javax.swing.JTable tbporhacer;
    public javax.swing.JTextField txtCodigoEmpleado;
    public javax.swing.JTextField txtDescripcionHabitacion;
    private javax.swing.JTextField txtFechaActual;
    public javax.swing.JTextField txtNhabitacion;
    public javax.swing.JTextField txtNombreEmpleado;
    public javax.swing.JTextField txtTurno;
    public javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables
    public JTextField getTxtFechaActual() {
        return txtFechaActual;
    }

    public void setTxtFechaActual(JTextField txtFechaActual) {
        this.txtFechaActual = txtFechaActual;
    }
    
}

