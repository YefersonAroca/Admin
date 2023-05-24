/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author yefer
 */
public class Conexion {
    Connection conectar = null;
    String user="postgres";
    String pass="root"; 
    String bd="ModeloConjunto";
    String ip="localhost";
    String puerto="5432"; 
    String cadena="jdbc:postgresql://"+ip+":"+puerto+"/"+bd;
    
    public  Connection establecerConexion(){
        try {
            Class.forName("org.postgresql.Driver");
            conectar=DriverManager.getConnection(cadena,user,pass);
              JOptionPane.showMessageDialog(null, "exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error: "+e.toString());
        }
        
    return conectar;
    }  
    }
    

