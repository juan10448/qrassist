/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import ModeloVo.formacionVo;
import Util.CRUD;
import Util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juans
 */
public class formacionDao extends ConexionBD implements CRUD  {
   
       
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    private boolean operacion = false;
    private String sql;
    private String idFor="", nomFor="";

    public formacionDao() {
    }
    
    
   public formacionDao(formacionVo forVo) {
        super();
        try {
            conexion = this.obteneConexion();
            idFor = forVo.getIdFor();
            nomFor = forVo.getNomFor();  
        } catch (Exception e) {
            Logger.getLogger(formacionVo.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    @Override
    public boolean agregar() {
        try 
        {
            sql = "insert into formacion (nomFor) values (?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, nomFor);
            puente.executeUpdate();
            operacion = true ;
        } catch (Exception e)
        {
            Logger.getLogger (formacionDao.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(formacionDao.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return operacion;}    
    
    
    @Override
    public boolean actualizar() {     
    try {
     sql = "update formacion set nomFor=? where idFor=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, nomFor);
            puente.setString(2, idFor);
            puente.executeUpdate();
            operacion = true;
     
        } catch (Exception e)
        {
             Logger.getLogger(formacionDao.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(formacionDao.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return operacion; }

    @Override
    public boolean eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public formacionVo consultarPorFormacion(String id){
         formacionVo forVo = null;
         try {
             conexion = this.obteneConexion();
             sql="select * from formacion where idFor = ?";
             puente =  conexion.prepareStatement(sql);
             puente.setString(1, id);
             mensajero = puente.executeQuery();
             while(mensajero.next()){
                 forVo = new formacionVo(id, mensajero.getString(2));
             }  
         } catch (Exception e) {
             Logger.getLogger(formacionVo.class.getName()).log(Level.SEVERE, null,e);                   
         }finally{
                try {
                    this.cerrarConexion();
                } catch (Exception e) {
                    Logger.getLogger(formacionVo.class.getName()).log(Level.SEVERE, null,e);             
                } 
                return forVo;
                  } 
    }
     
   public ArrayList<formacionVo> Listar ( ){
       
         ArrayList<formacionVo> ListarFormacion = new ArrayList<>();
         try {
             conexion = this.obteneConexion();
             sql="select * from formacion";
             puente =  conexion.prepareStatement(sql);
             mensajero = puente.executeQuery();
              while (mensajero.next()) {                
                formacionVo  nomFor = new formacionVo(mensajero.getString(1), mensajero.getString(2));
                ListarFormacion.add(nomFor);           
            }
         } catch (Exception e) {
             Logger.getLogger(formacionVo.class.getName()).log(Level.SEVERE, null,e);                   
         }finally{
                try {
                    this.cerrarConexion();
                } catch (Exception e) {
                    Logger.getLogger(formacionVo.class.getName()).log(Level.SEVERE, null,e);             
                } 
                return ListarFormacion;
                }
    }
 }  



   

    
     
     
    

