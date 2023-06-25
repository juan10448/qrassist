/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import ModeloVo.fichasVo;
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
public class fichasDao extends ConexionBD implements CRUD  {

    public fichasDao() {
    }

    
    
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    private boolean operacion = false;
    private String sql;
    private String idFicha="", idFor="", nomFor="", feIni="", feFin="";
    
   public fichasDao(fichasVo ficVo) {

        super();
        try {
            conexion = this.obteneConexion();
            idFicha = ficVo.getIdFicha();
            idFor = ficVo.getIdFor();
            nomFor = ficVo.getNomFor();
            feIni = ficVo.getFeIni();
            feFin = ficVo.getFeFin();
   
        } catch (Exception e) {
            Logger.getLogger(fichasVo.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agregar() {
        try 
        {
            sql = "insert into fichas (idFicha, idFor,  feIni, feFin ) values (?, ?, ?, ?)";
            puente = conexion.prepareStatement(sql);
             puente.setString(1, idFicha);
            puente.setString(2, idFor);
            puente.setString(3, feIni);
            puente.setString(4,feFin);
            puente.executeUpdate();
            operacion = true ;
        } catch (Exception e)
        {
            Logger.getLogger (fichasDao.class.getName()).log(Level.SEVERE,null,e);

        }finally{
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(fichasDao.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return operacion;}

    @Override
    public boolean actualizar() {
        try 
        {
            sql = "update fichas set idFor=?, feIni=?, feFin=? where idFicha=?";
            puente = conexion.prepareStatement(sql);
             puente.setString(1, idFor);
            puente.setString(2, feIni);
            puente.setString(3, feFin);
            puente.setString(4, idFicha);
            puente.executeUpdate();
            operacion = true;
     
        } catch (Exception e)
        {
             Logger.getLogger(fichasDao.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(fichasDao.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return operacion; }

    @Override
    public boolean eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
     public fichasVo consultarFicha(String id){
         fichasVo ficVo = null;
         try {
             conexion = this.obteneConexion();
             sql="select * from fichas where idFicha = ?";
             puente =  conexion.prepareStatement(sql);
             puente.setString(1, id);
             mensajero = puente.executeQuery();
             while(mensajero.next()){
                 ficVo = new fichasVo(id, mensajero.getString(2), mensajero.getString(3), mensajero.getString(4));
             }  
         } catch (Exception e) {
             Logger.getLogger(fichasVo.class.getName()).log(Level.SEVERE, null,e);                   
         }finally{
                try {
                    this.cerrarConexion();
                } catch (Exception e) {
                    Logger.getLogger(fichasVo.class.getName()).log(Level.SEVERE, null,e);             
                } 
                return ficVo;
                  } 
    }
     
   public ArrayList<fichasVo> Listar ( ){
       
          ArrayList<fichasVo> ListarFichas = new ArrayList<>();
         try {
             conexion = this.obteneConexion();
             sql="select * from vista_fichas";
             puente =  conexion.prepareStatement(sql);
             mensajero = puente.executeQuery();
              while (mensajero.next()) {                
                fichasVo  ficVo = new fichasVo(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5));
                ListarFichas.add(ficVo);           
            }
         } catch (Exception e) {
             Logger.getLogger(fichasVo.class.getName()).log(Level.SEVERE, null,e);                   
         }finally{
                try {
                    this.cerrarConexion();
                } catch (Exception e) {
                    Logger.getLogger(fichasVo.class.getName()).log(Level.SEVERE, null,e);             
                } 
                return ListarFichas;
                }
    }
    
}  
