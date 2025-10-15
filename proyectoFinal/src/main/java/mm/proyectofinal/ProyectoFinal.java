/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package mm.proyectofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Estudiante
 */
public class ProyectoFinal {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Parametros
        String url = "jdbc:mysql://localhost:3306/proyecto";
        String usuario = "root";
        String contra = "";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contra);
            System.out.println("Conexion Realizada!!!");
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }

    }
}
