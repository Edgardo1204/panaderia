/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Image;
import java.sql.SQLException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesion
     */
    IniciarSesion inicio = new IniciarSesion();
    VentanaVenta2 venVenta = new VentanaVenta2();
    VentanaInventario venInventario;
    VentanaPuntoVenta venPuntoVenta = new VentanaPuntoVenta();
    VentanaUsuario venUsuario = new VentanaUsuario();
    VentanaProveedor provedor = new VentanaProveedor();
    VentanaInsumos insumo = new VentanaInsumos();

    public MenuPrincipal() throws SQLException {
        this.venInventario = new VentanaInventario();
        initComponents();
        this.setResizable(false);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        centro = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        salirMenuP = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        mostrarCarrito = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonUsuario = new javax.swing.JButton();
        botonProveedores = new javax.swing.JButton();
        botonInventarioInsumos = new javax.swing.JButton();
        botonInventario = new javax.swing.JButton();
        botonPuntoVenta = new javax.swing.JButton();
        botonVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        centro.setBackground(new java.awt.Color(255, 255, 255));
        centro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        centro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 660));

        getContentPane().add(centro, java.awt.BorderLayout.CENTER);

        principal.setBackground(new java.awt.Color(255, 102, 0));
        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Panaderia \"Tata-Cheque\"");
        principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 430, 50));

        salirMenuP.setBackground(new java.awt.Color(204, 204, 204));
        salirMenuP.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        salirMenuP.setForeground(new java.awt.Color(0, 0, 0));
        salirMenuP.setText("Salir");
        salirMenuP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salirMenuP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirMenuPActionPerformed(evt);
            }
        });
        principal.add(salirMenuP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 60, 100, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panaderia (1) (1).png"))); // NOI18N
        principal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 100));

        mostrarCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito-de-compras (3).png"))); // NOI18N
        mostrarCarrito.setContentAreaFilled(false);
        mostrarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCarritoActionPerformed(evt);
            }
        });
        principal.add(mostrarCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADMINISTRADOR");
        principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, -1, -1));

        getContentPane().add(principal, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(6, 1));

        botonUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonUsuario.setForeground(new java.awt.Color(255, 102, 0));
        botonUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panadero.png"))); // NOI18N
        botonUsuario.setText("Registrar usuario");
        botonUsuario.setContentAreaFilled(false);
        botonUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(botonUsuario);

        botonProveedores.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonProveedores.setForeground(new java.awt.Color(255, 102, 0));
        botonProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cartero.png"))); // NOI18N
        botonProveedores.setText("Proveedores");
        botonProveedores.setContentAreaFilled(false);
        botonProveedores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProveedoresActionPerformed(evt);
            }
        });
        jPanel2.add(botonProveedores);

        botonInventarioInsumos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonInventarioInsumos.setForeground(new java.awt.Color(255, 102, 0));
        botonInventarioInsumos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pan-de-molde.png"))); // NOI18N
        botonInventarioInsumos.setText("Inventario de insumos");
        botonInventarioInsumos.setContentAreaFilled(false);
        botonInventarioInsumos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonInventarioInsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInventarioInsumosActionPerformed(evt);
            }
        });
        jPanel2.add(botonInventarioInsumos);

        botonInventario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonInventario.setForeground(new java.awt.Color(255, 102, 0));
        botonInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario (1).png"))); // NOI18N
        botonInventario.setText("Inventario de productos");
        botonInventario.setContentAreaFilled(false);
        botonInventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInventarioActionPerformed(evt);
            }
        });
        jPanel2.add(botonInventario);

        botonPuntoVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonPuntoVenta.setForeground(new java.awt.Color(255, 102, 0));
        botonPuntoVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vendedor.png"))); // NOI18N
        botonPuntoVenta.setText("Punto de venta");
        botonPuntoVenta.setContentAreaFilled(false);
        botonPuntoVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonPuntoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoVentaActionPerformed(evt);
            }
        });
        jPanel2.add(botonPuntoVenta);

        botonVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonVenta.setForeground(new java.awt.Color(255, 102, 0));
        botonVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bienes.png"))); // NOI18N
        botonVenta.setText("Ventas");
        botonVenta.setContentAreaFilled(false);
        botonVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVentaActionPerformed(evt);
            }
        });
        jPanel2.add(botonVenta);

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirMenuPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirMenuPActionPerformed
        this.setVisible(false);
        venVenta.setVisible(false);
        venInventario.setVisible(false);
        venPuntoVenta.setVisible(false);
        venUsuario.setVisible(false);
        inicio.setVisible(true);
    }//GEN-LAST:event_salirMenuPActionPerformed

    private void botonPuntoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoVentaActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        venPuntoVenta.setVisible(false);
        venUsuario.setVisible(false);
        venInventario.setVisible(false);
        venPuntoVenta.mostrarTabla();
        venPuntoVenta.setVisible(true);
    }//GEN-LAST:event_botonPuntoVentaActionPerformed

    private void botonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUsuarioActionPerformed
        venVenta.setVisible(false);
        venInventario.setVisible(false);
        venPuntoVenta.setVisible(false);
        venUsuario.setVisible(true);
    }//GEN-LAST:event_botonUsuarioActionPerformed

    private void botonVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVentaActionPerformed
        // TODO add your handling code here:
        venInventario.setVisible(false);
        venPuntoVenta.setVisible(false);
        venUsuario.setVisible(false);
        venVenta.setVisible(true);
        venVenta.mostrarTabla();
    }//GEN-LAST:event_botonVentaActionPerformed

    private void botonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInventarioActionPerformed
        // TODO add your handling code here:
        venPuntoVenta.setVisible(false);
        venUsuario.setVisible(false);
        venVenta.setVisible(false);
        venInventario.mostrarTabla();
        venInventario.setVisible(true);
    }//GEN-LAST:event_botonInventarioActionPerformed

    private void mostrarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCarritoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mostrarCarritoActionPerformed

    private void botonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProveedoresActionPerformed
        // TODO add your handling code here:
        venVenta.setVisible(false);
        venInventario.setVisible(false);
        venPuntoVenta.setVisible(false);
        venUsuario.setVisible(false);
        provedor.setVisible(true);
    }//GEN-LAST:event_botonProveedoresActionPerformed

    private void botonInventarioInsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInventarioInsumosActionPerformed
        // TODO add your handling code here:
        venVenta.setVisible(false);
        venInventario.setVisible(false);
        venPuntoVenta.setVisible(false);
        venUsuario.setVisible(false);
        provedor.setVisible(false);
        insumo.setVisible(true);
        insumo.mostrarTabla();
        insumo.comboBuscar.removeAllItems();
        insumo.comboBuscar.addItem("Ninguno");
        insumo.mostrarComboProv();
        insumo.limpiar();
    }//GEN-LAST:event_botonInventarioInsumosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MenuPrincipal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInventario;
    private javax.swing.JButton botonInventarioInsumos;
    private javax.swing.JButton botonProveedores;
    private javax.swing.JButton botonPuntoVenta;
    private javax.swing.JButton botonUsuario;
    private javax.swing.JButton botonVenta;
    private javax.swing.JPanel centro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mostrarCarrito;
    private javax.swing.JPanel principal;
    private javax.swing.JButton salirMenuP;
    // End of variables declaration//GEN-END:variables
}