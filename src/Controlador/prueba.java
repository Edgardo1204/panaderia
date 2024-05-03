/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controlador;

//@author Jesus

public class prueba {
public static void main(String[] args) {
        // Intentar obtener conexión
        java.sql.Connection conn = Conexion.getConnection();
        if (conn != null) {
            System.out.println("La conexión fue establecida exitosamente.");
            // Realizar una consulta para verificar la conexión
            try {
                String consulta = "SELECT * FROM usuario"; // Asegúrate de cambiar "algunatabla" por una tabla real en tu base de datos
                java.sql.ResultSet resultado = Conexion.getTabla(consulta);
                while (resultado.next()) {
                    // Suponiendo que la tabla tiene una columna llamada 'nombre'
                    System.out.println("Nombre: " + resultado.getString("nombre_usuario"));
                }
            } catch (Exception e) {
                System.out.println("Error al realizar consulta: " + e.getMessage());
            }
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }
    }
}
