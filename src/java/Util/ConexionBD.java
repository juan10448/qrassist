   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author juans
 */
public class ConexionBD {
    
  private String driver,user,password,urlBd,port,nameDB;
  private Connection conexion;
  
public ConexionBD()
{
        driver="com.mysql.jdbc.Driver";
        user="root";
        password="";
        nameDB="qrassist";
        port="3306";
        urlBd="jdbc:mysql://localhost:" + port+ "/" +nameDB; 
      
       
        try {
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(urlBd, user, password);
            System.out.println("¡Conexion OK!");
        } catch (Exception e) {
            System.out.println("Error al conectarse" + e.toString());
        }      
    }
    
    public Connection obteneConexion(){
        
        return conexion;
    }
    public Connection cerrarConexion() throws SQLException{
        
        conexion.close();
        conexion = null;
        return conexion;
    }
    
    public static void main(String[] args) {
        new ConexionBD();
    }
}

    
    

