/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Image;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import Controlador.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Vista.VentanaPuntoVenta;
import javax.swing.JTextField;

/**
 *
 * @author felip
 */
public class VentaP extends javax.swing.JDialog {

    /**
     * Creates new form VentaP
     */
    public Conexion conexi = new Conexion();
    public PreparedStatement ps, ps2;
    public ResultSet rs;
    VentanaPuntoVenta ventaPunto =  new VentanaPuntoVenta();
    String cantidadExistencias;
    String idProducto;
    JTable tablaUsuario = new JTable();
    String resultado = ventaPunto.getTxtVender();

    public VentaP(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setLocation(680, 370);
        initComponents();
        ventaPunto.mostrarTabla();
    }

    public void setcCantidad(JTextField cCantidad) {
        this.cCantidad = cCantidad;
    }

    public VentaP() {
        
    }

    public JTable getTablaUsuario() {
        return tablaUsuario;
    }

    public void setTablaUsuario(JTable tablaUsuario) {
        this.tablaUsuario = tablaUsuario;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getCantidadExistencias() {
        return cantidadExistencias;
    }
    
    public String getCantidad(){
        return cCantidad.getText();
    }

    public void setCantidadExistencias(String cantidadExistencias) {
        this.cantidadExistencias = cantidadExistencias;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cCantidad = new javax.swing.JTextField();
        bListo = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setBackground(new java.awt.Color(119, 83, 49));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("  Confirmar Venta");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(114, 114, 114));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cCantidad.setBackground(new java.awt.Color(153, 153, 153));
        cCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cCantidad.setForeground(new java.awt.Color(255, 255, 255));
        cCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cCantidad.setToolTipText("");
        cCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCantidadActionPerformed(evt);
            }
        });
        cCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(cCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 220, 29));

        bListo.setBackground(new java.awt.Color(51, 51, 51));
        bListo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        bListo.setForeground(new java.awt.Color(255, 255, 255));
        bListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cheque.png"))); // NOI18N
        bListo.setText("Listo");
        bListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListoActionPerformed(evt);
            }
        });
        jPanel1.add(bListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        bSalir.setBackground(new java.awt.Color(51, 51, 51));
        bSalir.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        bSalir.setForeground(new java.awt.Color(255, 255, 255));
        bSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prohibicion.png"))); // NOI18N
        bSalir.setText("Cerrar");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        jPanel1.add(bSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 60, 30));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoActionPerformed
        // TODO add your handling code here:

        int resultado = 0;
        String cajaID;
        int resultado2 = 0;
        int cantidadR;
        double precioF;
        double totalP;
        int fTotal = 0;
        int totalC = 0;
        int ingresarNuevosDatos = 0;
        Connection conexion = null;
        try {

            conexion = conexi.getConnection();
            ps = conexion.prepareStatement("select * from producto where id_producto=?");
            ps.setString(1, getIdProducto());
            rs = ps.executeQuery();

            if (rs.next()) {

                String id = rs.getString("id_producto");
                String nombre = rs.getString("nombre_producto");
                String precio = rs.getString("precio_unidad");
                String cantidad = rs.getString("cantidad_existencia");
                precioF = Double.parseDouble(precio);
                cantidadR = Integer.parseInt(cCantidad.getText());
                totalC = Integer.parseInt(cantidad);
                totalP = cantidadR * precioF;
                if ((totalC > cantidadR) || (totalC == cantidadR)) {

                    fTotal = totalC - cantidadR;
                    try {
                        ps = conexion.prepareStatement("update producto set cantidad_existencia=? where id_producto=?");
                        ps.setString(1, Integer.toString(fTotal));
                        ps.setString(2, getIdProducto());
                        resultado = ps.executeUpdate();
                        mostrarTabla();
                        JOptionPane.showMessageDialog(null, "Venta realizada correctamente");

                        LocalDate fechaActual = LocalDate.now();
                        java.sql.Date fechaSQL = java.sql.Date.valueOf(fechaActual);

                        ps2 = conexion.prepareStatement("insert into venta(nombre_producto,cantidad,precio,fecha)values(?,?,?,?)");
                        ps2.setString(1, nombre);
                        ps2.setString(2, cCantidad.getText());
                        ps2.setString(3, Double.toString(totalP));
                        ps2.setDate(4, fechaSQL);

                        resultado2 = ps2.executeUpdate();
                        
                        this.setVisible(false);

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad de producto no es suficiente");

                }
            } else {
                if (getIdProducto().equals("")) {
                    JOptionPane.showMessageDialog(null, "No selecciono un producto");

                }
            }
            conexion.close();
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "No ingreso la cantidad a vender");

        }
        cCantidad.setText(String.valueOf(resultado));

    }//GEN-LAST:event_bListoActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_bSalirActionPerformed

    private void cCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCantidadActionPerformed
        // TODO add your handling code here:
        cCantidad.setText(resultado);
    }//GEN-LAST:event_cCantidadActionPerformed
     public int getCantidadValue() {
        try {
            return Integer.parseInt(cCantidad.getText());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return -1;
        }
    }

    private void cCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cCantidadKeyTyped

        char key = evt.getKeyChar();
        if (!Character.isDigit(key)) {
            evt.consume();
        }
        
        
        try {
            if (cCantidad.getText().length() >= 4) {
                evt.consume();
          

            } // TODO add your handling code here:

        } catch (Exception e) {
        }


    }//GEN-LAST:event_cCantidadKeyTyped

    public void advertencia() {
        VentanaPuntoVenta cExistencia1 = new VentanaPuntoVenta();
        int existencia = Integer.parseInt(cExistencia1.getTextFieldText());
        System.out.println(existencia);
        String advertencia = "Cantidad insuficiente";
        int inventario = Integer.parseInt(cCantidad.getText());
        if (inventario > existencia) {
            JOptionPane.showMessageDialog(null, "insuficiente");
            //advLabel.setText("" + advertencia);
        }
    }

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
            java.util.logging.Logger.getLogger(VentaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentaP dialog = new VentaP(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public void mostrarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        rs = Conexion.getTabla("select *from producto");
        //se asignan los nombre de la columna
        modelo.setColumnIdentifiers(new Object[]{
            "id", "Nombre producto", "Descripción", "Cantidad existencia", "Precio Unidad"
        });

        try {
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString("id_producto"), rs.getString("nombre_producto"), rs.getString("descripcion"), rs.getInt("cantidad_existencia"), rs.getFloat("precio_unidad")
                });

            }
            tablaUsuario.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //seleccionarTabla();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bListo;
    private javax.swing.JButton bSalir;
    public javax.swing.JTextField cCantidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
