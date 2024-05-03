package Vista;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controlador.Conexion;
import static Controlador.Conexion.getConnection;
import java.awt.event.KeyEvent;

/**
 *
 * @author felip
 */
public class VentanaInventario1 extends javax.swing.JFrame {

    /**
     * Creates new form ventana1
     */
    public Conexion conexi = new Conexion();
    public PreparedStatement ps;
    public ResultSet rs;
    public DefaultTableModel dft;
    int contador;
    int resultado = 0;

    public VentanaInventario1() {
        initComponents();
        limpiar();
        this.setLocation(300, 200);
        //this.setAlwaysOnTop(true);
        mostrarTabla();
        seleccionarTabla();
    }

    public void mostrarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        rs = Conexion.getTabla("select *from producto");
        //se asignan los nombre de la columna
        modelo.setColumnIdentifiers(new Object[]{
            "id", "Nombre producto", "Descripción", "Cantidad existencia", "Precio unidad"
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
        bBuscar = new javax.swing.JButton();
        buscador = new javax.swing.JComboBox<>();
        cBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(236, 226, 198));
        jPanel1.setPreferredSize(new java.awt.Dimension(1068, 532));

        botonSalir.setBackground(new java.awt.Color(112, 80, 48));
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

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario (3).png"))); // NOI18N
        jLabel1.setText("Productos");

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre producto:");

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
        jLabel6.setText("Precio unidad: $");

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
        cPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPrecioKeyTyped(evt);
            }
        });

        cID.setEditable(false);
        cID.setBackground(new java.awt.Color(255, 255, 255));
        cID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cID.setBorder(null);
        cID.setEnabled(true);
        cID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cIDActionPerformed(evt);
            }
        });

        cNombreProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cNombreProducto.setBorder(null);
        cNombreProducto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cNombreProductoMouseMoved(evt);
            }
        });
        cNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombreProductoKeyTyped(evt);
            }
        });

        cDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cDescripcion.setBorder(null);
        cDescripcion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cDescripcionMouseMoved(evt);
            }
        });
        cDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cDescripcionKeyTyped(evt);
            }
        });

        bLimpiar.setBackground(new java.awt.Color(112, 80, 48));
        bLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        bLimpiar.setText("Limpiar");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
            }
        });

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
        cExistencia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cExistencia1KeyTyped(evt);
            }
        });

        bBuscar.setBackground(new java.awt.Color(112, 80, 48));
        bBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bBuscar.setForeground(new java.awt.Color(255, 255, 255));
        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        buscador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id", "Cantidad existencia", "Precio unidad" }));
        buscador.setSelectedItem(null);
        buscador.setBorder(null);

        cBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cBuscar.setBorder(null);
        cBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBuscarActionPerformed(evt);
            }
        });
        cBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cBuscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(42, 42, 42)
                                .addComponent(cID, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cExistencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(326, 326, 326)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(525, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonSalir)
                            .addComponent(jLabel1))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3))
                            .addComponent(cID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(cNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(cDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cExistencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(cPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(bLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 446));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyTyped
        // TODO add your handling code here:
        char key = evt.getKeyChar();
        if(!Character.isDigit(key)){
            evt.consume();
        }
        if (cPrecio.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_cBuscarKeyTyped

    private void cBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBuscarActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo1 = new DefaultTableModel();
        Connection conexion = null;
        modelo1.setColumnIdentifiers(new Object[]{
            "id", "Nombre producto", "Descripción", "Cantidad existencia", "Precio unidad"
        });
        String donde = buscador.getSelectedItem().toString();
        switch (donde) {
            case "id":
            try {
                conexion = conexi.getConnection();
                ps = conexion.prepareStatement("select *from producto where id_producto=?");
                ps.setString(1, cBuscar.getText());
                rs = ps.executeQuery();
                while (rs.next()) {
                    modelo1.addRow(new Object[]{
                        rs.getString("id_producto"),
                        rs.getString("nombre_producto"),
                        rs.getString("descripcion"),
                        rs.getString("cantidad_existencia"),
                        rs.getString("precio_unidad"),});

            }
            tablaUsuarios.setModel(modelo1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        break;

        case "Nombre producto":
        try {
            conexion = conexi.getConnection();
            ps = conexion.prepareStatement("select *from producto where nombre_producto=?");
            ps.setString(1, cBuscar.getText());
            rs = ps.executeQuery();
            while (rs.next()) {
                modelo1.addRow(new Object[]{
                    rs.getString("id_producto"),
                    rs.getString("nombre_producto"),
                    rs.getString("descripcion"),
                    rs.getString("cantidad_existencia"),
                    rs.getString("precio_unidad"),});

        }
        tablaUsuarios.setModel(modelo1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        break;

        case "Descripción":
        try {
            conexion = conexi.getConnection();
            ps = conexion.prepareStatement("select *from producto where descripcion=?");
            ps.setString(1, cBuscar.getText());
            rs = ps.executeQuery();
            while (rs.next()) {
                modelo1.addRow(new Object[]{
                    rs.getString("id_producto"),
                    rs.getString("nombre_producto"),
                    rs.getString("descripcion"),
                    rs.getString("cantidad_existencia"),
                    rs.getString("precio_unidad"),});

        }
        tablaUsuarios.setModel(modelo1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        break;

        case "Cantidad existencia":
        try {
            conexion = conexi.getConnection();
            ps = conexion.prepareStatement("select *from producto where cantidad_existencia=?");
            ps.setString(1, cBuscar.getText());
            rs = ps.executeQuery();
            while (rs.next()) {
                modelo1.addRow(new Object[]{
                    rs.getString("id_producto"),
                    rs.getString("nombre_producto"),
                    rs.getString("descripcion"),
                    rs.getString("cantidad_existencia"),
                    rs.getString("precio_unidad"),});

        }
        tablaUsuarios.setModel(modelo1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        break;

        case "Precio unidad":
        try {
            conexion = conexi.getConnection();
            ps = conexion.prepareStatement("select *from producto where precio_unidad=?");
            ps.setString(1, cBuscar.getText());
            rs = ps.executeQuery();
            while (rs.next()) {
                modelo1.addRow(new Object[]{
                    rs.getString("id_producto"),
                    rs.getString("nombre_producto"),
                    rs.getString("descripcion"),
                    rs.getString("cantidad_existencia"),
                    rs.getString("precio_unidad"),});

        }
        tablaUsuarios.setModel(modelo1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        break;

        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void cExistencia1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cExistencia1KeyTyped
        if (cExistencia1.getText().length() >= 4) {
            evt.consume();
        } // TODO add your handling code here:

        char key = evt.getKeyChar();
        if (!Character.isDigit(key)) {
            evt.consume();
        }
    }//GEN-LAST:event_cExistencia1KeyTyped

    private void cExistencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cExistencia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cExistencia1ActionPerformed

    private void cExistencia1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cExistencia1MouseMoved
        // TODO add your handling code here:
        cExistencia1.setToolTipText("Campo Obligatorio");
    }//GEN-LAST:event_cExistencia1MouseMoved

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
        tablaUsuarios.setRowSelectionAllowed(false);
   
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void cDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cDescripcionKeyTyped
        if (cDescripcion.getText().length() >= 50) {
            evt.consume();
        }

    }//GEN-LAST:event_cDescripcionKeyTyped

    private void cDescripcionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cDescripcionMouseMoved
        // TODO add your handling code here:
        cDescripcion.setToolTipText("Campo Obligatorio");
    }//GEN-LAST:event_cDescripcionMouseMoved

    private void cNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreProductoKeyTyped
        if (cNombreProducto.getText().length() >= 30) {
            evt.consume();
        }
        char key = evt.getKeyChar();

        if (!Character.isLetter(key) && !(key == KeyEvent.VK_SPACE)
            && !(key == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }

    }//GEN-LAST:event_cNombreProductoKeyTyped

    private void cNombreProductoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cNombreProductoMouseMoved
        // TODO add your handling code here:
        cNombreProducto.setToolTipText("Campo Obligatorio");
    }//GEN-LAST:event_cNombreProductoMouseMoved

    private void cIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cIDActionPerformed

    private void cPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPrecioKeyTyped
        char key = evt.getKeyChar();
        if (cPrecio.getText().length() >= 5) {
            evt.consume();
        } // TODO add your handling code here:

        if (validateFloat(key)) {
            getToolkit().beep();
            evt.consume();
        }
        try {
            Double.parseDouble(cPrecio.getText() + key);
        } catch (NumberFormatException ex) {
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_cPrecioKeyTyped

    private void cPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPrecioActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_cPrecioActionPerformed

    private void cPrecioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cPrecioMouseMoved
        // TODO add your handling code here:
        cPrecio.setToolTipText("Campo Obligatorio");
    }//GEN-LAST:event_cPrecioMouseMoved

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_botonSalirActionPerformed
    
    public boolean validateFloat(char key) {
        //Método modificado, para que acepte primero un número y después un punto
        return (Character.isLetter(key) || String.valueOf(key).trim().isEmpty());
    }

    public void limpiar() {
        cID.setText("");
        buscador.setSelectedItem(null);
        cBuscar.setText("");
        cNombreProducto.setText("");
        cDescripcion.setText("");
        cExistencia1.setText("");
        cPrecio.setText("");
        mostrarTabla();

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
            java.util.logging.Logger.getLogger(VentanaInventario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInventario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInventario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInventario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VentanaInventario1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> buscador;
    private javax.swing.JTextField cBuscar;
    private javax.swing.JTextField cDescripcion;
    private javax.swing.JTextField cExistencia1;
    private javax.swing.JTextField cID;
    private javax.swing.JTextField cNombreProducto;
    private javax.swing.JTextField cPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}