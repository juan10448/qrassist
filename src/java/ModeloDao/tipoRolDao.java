/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import ModeloVo.tipoRolVo;
import Util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class tipoRolDao extends ConexionBD {
     
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    private boolean operacion = false;
    private String sql;
    
    private String idTipoRol="", nomRol="";
    
    
    public  tipoRolDao (){}
    
    
     public tipoRolDao(tipoRolVo rolVo)
    {
        super();
        try {
        //conectar BD
        conexion = this.obteneConexion();
        //traer los datos del VO al DAO
        idTipoRol = rolVo.getIdTipoRol();
        nomRol = rolVo.getNomRol();
        
        } catch (Exception e) {
        Logger.getLogger(tipoRolVo.class.getName()).log(Level.SEVERE, null,e);
        }
    }
     
     
     public ArrayList<tipoRolVo> DespregarRol (){
       
          ArrayList<tipoRolVo> Desplegar = new ArrayList<>();
         try {
             conexion = this.obteneConexion();
             sql="select * from tiporoles";
             puente =  conexion.prepareStatement(sql);
             mensajero = puente.executeQuery();
              while (mensajero.next()) {   
                 tipoRolVo rolVo = new tipoRolVo(mensajero.getString(1), mensajero.getString(2));
                 Desplegar.add(rolVo);
            }
         } catch (Exception e) {
             Logger.getLogger(tipoRolVo.class.getName()).log(Level.SEVERE, null,e);                   
         }finally{
                try {
                    this.cerrarConexion();
                } catch (Exception e) {
                    Logger.getLogger(tipoRolVo.class.getName()).log(Level.SEVERE, null,e);             
                } 
                
                }return Desplegar;
    }
    
}
