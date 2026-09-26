/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author edinh
 */
public class Conexion {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=TiendaDB;encrypt=true;trustServerCertificate=true;";
    private static final String USUARIO = "Edin"; // usuario de SQL Server
    private static final String CONTRASENA = "2026"; // contraseña de SQL Server
    public static Connection conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("¡Conexión exitosa a SQL Server!");
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
        }
        return con;
    }
}    
