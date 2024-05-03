/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class Conexion {

    public static final String url = "jdbc:mysql://127.0.0.1:3306/panaderia?useTimezone=true&serverTimezone=UTC";
    public static final String usuario = "root";
    public static final String contrasena = "";

    public static Connection getConnection() {
        Connection conexion = null;

        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           conexion =(Connection) DriverManager.getConnection(url, usuario, contrasena);
           System.out.println("Conexion exitosa");
           
           
      
        } catch (Exception ex)
        {
            
            System.err.println("error al hacer la conexion: "+ex);
        }
        return conexion;
    }
    
    public static ResultSet getTabla(String consulta){
        Connection cn= getConnection();
        Statement st;
        ResultSet datos=null;
        
        try{
        st=cn.createStatement();
        datos=st.executeQuery(consulta);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return datos;
    }
}
