/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prollrcto12;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;       
        
        
/**
 *
 * @author ALUMNO
 */
public class conexion {
    Connection conectar=null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/bodegal","root","");
            
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
        
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}
