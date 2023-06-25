/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import ModeloVo.documentoVo;
import Util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class documentoDao extends ConexionBD {
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    private boolean operacion = false;
    private String sql;
    private String idTipoDOc="", descripcion="";
    
    
    public documentoDao(){}
    
    public documentoDao(documentoVo docVo)
    {
        super();
      try {
          //conectar BD
         conexion = this.obteneConexion();
          //traer los datos del VO al DAO
         idTipoDOc= docVo.getIdTipoDOc();  
         descripcion= docVo.getDescripcion();     

      } catch (Exception e) {
          Logger.getLogger(documentoDao.class.getName()).log(Level.SEVERE, null,e);     
      }
    }
    
    
     public ArrayList<documentoVo> DespregarDocumento ( ){
       
          ArrayList<documentoVo> Desplegar = new ArrayList<>();
         try {
             conexion = this.obteneConexion();
             sql="select * from documento";
             puente =  conexion.prepareStatement(sql);
             mensajero = puente.executeQuery();
              while (mensajero.next()) {   
                 documentoVo docVo = new documentoVo(mensajero.getString(1), mensajero.getString(2));
                 Desplegar.add(docVo);
            }
         } catch (Exception e) {
             Logger.getLogger(documentoVo.class.getName()).log(Level.SEVERE, null,e);                   
         }finally{
                try {
                    this.cerrarConexion();
                } catch (Exception e) {
                    Logger.getLogger(documentoVo.class.getName()).log(Level.SEVERE, null,e);             
                } 
                return Desplegar;
                }
    }
     
    
}
