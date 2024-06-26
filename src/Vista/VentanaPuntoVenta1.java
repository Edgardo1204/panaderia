package Vista;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Controlador.Conexion;
import static Controlador.Conexion.getConnection;
import Modelo.Producto;
import java.awt.event.*;
import java.time.LocalDate;
import javax.swing.event.*;

/**
 *
 * @author felip
 */
public class VentanaPuntoVenta1 extends javax.swing.JFrame {

    /**
     * Creates new form ventana1
     */
    public Conexion conexi = new Conexion();
    public PreparedStatement pss;
    public ResultSet rs;
    public DefaultTableModel dft;
    public PreparedStatement ps, ps2;
    String idProducto;
    int contador;
    int resultado = 0;
    Producto producto;
    VentaP ventanita;

    public VentanaPuntoVenta1() {
        initComponents();
        this.setLocation(330, 165);
        //this.setAlwaysOnTop(true);
        mostrarTabla();
        seleccionarTabla();
    }

    // other methods and fields...
    public String getTextFieldText() {
        return cExistencia1.getText();
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
            tablaUsuarios.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //seleccionarTabla();
    }

    public String getIdProducto() {
        return idProducto;
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
        botonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        bVender = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cPrecio = new javax.swing.JTextField();
        cID = new javax.swing.JTextField();
        cNombreProducto = new javax.swing.JTextField();
        cDescripcion = new javax.swing.JTextField();
        bLimpiar = new javax.swing.JButton();
        cExistencia1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtFactura = new javax.swing.JTextArea();
        lbladv = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtvender = new javax.swing.JTextField();
        lbltotal1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1068, 532));

        botonSalir.setBackground(new java.awt.Color(255, 102, 0));
        botonSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setToolTipText("");

        tablaUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaUsuarios.setAutoscrolls(false);
        tablaUsuarios.setRowSelectionAllowed(false);
        tablaUsuarios.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tablaUsuarios.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaUsuarios);

        bVender.setBackground(new java.awt.Color(255, 102, 0));
        bVender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bVender.setForeground(new java.awt.Color(255, 255, 255));
        bVender.setText("Vender");
        bVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVenderActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/punto-de-venta.png"))); // NOI18N
        jLabel1.setText("Punto de venta");

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecciona un producto de la tabla");

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("id:");

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Descripción:");

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Cantidad existencia:");

        jLabel6.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Precio unidad:");

        cPrecio.setEditable(false);
        cPrecio.setBackground(new java.awt.Color(255, 255, 255));
        cPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cPrecio.setBorder(null);
        cPrecio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cPrecioMouseMoved(evt);
            }
        });
        cPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPrecioActionPerformed(evt);
            }
        });

        cID.setEditable(false);
        cID.setBackground(new java.awt.Color(255, 255, 255));
        cID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cID.setBorder(null);
        cID.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cIDMouseMoved(evt);
            }
        });
        cID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cIDActionPerformed(evt);
            }
        });

        cNombreProducto.setEditable(false);
        cNombreProducto.setBackground(new java.awt.Color(255, 255, 255));
        cNombreProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cNombreProducto.setBorder(null);
        cNombreProducto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cNombreProductoMouseMoved(evt);
            }
        });
        cNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNombreProductoActionPerformed(evt);
            }
        });
        cNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombreProductoKeyTyped(evt);
            }
        });

        cDescripcion.setEditable(false);
        cDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        cDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cDescripcion.setBorder(null);
        cDescripcion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cDescripcionMouseMoved(evt);
            }
        });

        bLimpiar.setBackground(new java.awt.Color(255, 102, 0));
        bLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        bLimpiar.setText("Limpiar");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
            }
        });

        cExistencia1.setEditable(false);
        cExistencia1.setBackground(new java.awt.Color(255, 255, 255));
        cExistencia1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cExistencia1.setBorder(null);
        cExistencia1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cExistencia1MouseMoved(evt);
            }
        });
        cExistencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cExistencia1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Nombre producto:");

        txtFactura.setColumns(20);
        txtFactura.setRows(5);
        txtFactura.setText("Producto\t\tPrecio\t\tCantidad");
        jScrollPane2.setViewportView(txtFactura);

        lbladv.setFont(new java.awt.Font("Sitka Banner", 1, 12)); // NOI18N
        lbladv.setForeground(new java.awt.Color(255, 0, 0));
        lbladv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtvender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtvender.setBorder(null);
        txtvender.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtvenderMouseMoved(evt);
            }
        });
        txtvender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvenderActionPerformed(evt);
            }
        });

        lbltotal1.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        lbltotal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltotal1.setText("Total: $");

        jLabel10.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Cantidad a vender:");

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Nueva Factura");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(450, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtvender, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cExistencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(cPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(219, 219, 219)
                                .addComponent(botonSalir))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(596, 596, 596)
                        .addComponent(lbladv, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(548, 548, 548)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(bLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(570, 570, 570)
                        .addComponent(bVender, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(112, 112, 112)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cID, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonSalir)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cExistencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtvender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(lbladv, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bVender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel9)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbltotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(166, 166, 166)
                            .addComponent(jButton1))))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 534));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txtFactura.setText("");
        total = 0;
        txtFactura.setText("Producto" + "\t\tPrecio" + "\t\tCantidad");
        lbltotal1.setText("Total: $"+total);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtvenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvenderActionPerformed

    private void txtvenderMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtvenderMouseMoved
        // TODO add your handling code here:
        txtvender.setToolTipText("Campo Obligatorio");
    }//GEN-LAST:event_txtvenderMouseMoved

    private void cExistencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cExistencia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cExistencia1ActionPerformed

    private void cExistencia1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cExistencia1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_cExistencia1MouseMoved

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void cDescripcionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cDescripcionMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_cDescripcionMouseMoved

    private void cNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreProductoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreProductoKeyTyped

    private void cNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreProductoActionPerformed

    private void cNombreProductoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cNombreProductoMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreProductoMouseMoved

    private void cIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cIDActionPerformed

    private void cIDMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cIDMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_cIDMouseMoved

    private void cPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cPrecioActionPerformed

    private void cPrecioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cPrecioMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_cPrecioMouseMoved

    private void bVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVenderActionPerformed
        // TODO add your handling code here:
        ventanita = new VentaP(null, true);
        ventanita.setCantidadExistencias(cExistencia1.getText());
        ventanita.setIdProducto(cID.getText());
        ventanita.setTablaUsuario(tablaUsuarios);
        ventanita.setVisible(true);

        double precio = Double.parseDouble(cPrecio.getText());
        double cant = Double.parseDouble(txtvender.getText());
        double multi;

        multi = precio * cant;
        if (Integer.parseInt(txtvender.getText()) < Integer.parseInt(cExistencia1.getText())) {
            txtFactura.setText("Producto" + "\t\tPrecio" + "\t\tCantidad");
            txtFactura.setText(txtFactura.getText() + "\n" + cNombreProducto.getText() + "\t\t$" + cPrecio.getText() + "\t\t" + txtvender.getText());
            lbladv.setText("");

            total += multi;  // suma el producto al total existente
            lbltotal1.setText("Total: $" + total);
        } else {
            lbladv.setText("Cantidad Insuficiente");
        }
    }//GEN-LAST:event_bVenderActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_botonSalirActionPerformed

    public String getTxtVender() {
        return txtvender.getText();
    }


    private double total = 0;

    public void limpiar() {
        cID.setText("");
        cNombreProducto.setText("");
        cDescripcion.setText("");
        cExistencia1.setText("");
        cPrecio.setText("");
        txtvender.setText("");
        //txtFactura.setText("");
    }

    private void seleccionarTabla() {
        tablaUsuarios.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                limpiar();
                int row = tablaUsuarios.rowAtPoint(e.getPoint());
                cID.setText(tablaUsuarios.getValueAt(row, 0).toString());
                cNombreProducto.setText(tablaUsuarios.getValueAt(row, 1).toString());
                cDescripcion.setText(tablaUsuarios.getValueAt(row, 2).toString());
                cExistencia1.setText(tablaUsuarios.getValueAt(row, 3).toString());
                cPrecio.setText(tablaUsuarios.getValueAt(row, 4).toString());
            }
        });

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
            java.util.logging.Logger.getLogger(VentanaPuntoVenta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPuntoVenta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPuntoVenta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPuntoVenta1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new VentanaPuntoVenta1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLimpiar;
    public javax.swing.JButton bVender;
    private javax.swing.JButton botonSalir;
    public javax.swing.JTextField cDescripcion;
    public javax.swing.JTextField cExistencia1;
    public javax.swing.JTextField cID;
    public javax.swing.JTextField cNombreProducto;
    public javax.swing.JTextField cPrecio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbladv;
    private javax.swing.JLabel lbltotal1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextArea txtFactura;
    public javax.swing.JTextField txtvender;
    // End of variables declaration//GEN-END:variables
}
