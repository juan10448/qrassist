/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import ModeloVo.usuarioVo;
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
public class usuarioDao extends ConexionBD implements CRUD {

    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    private boolean operacion = false;
    private String sql;
    private String numDoc = "", nomUsu = "", apeUsu = "", pass = "", mail = "", direc = "", telefo = "", idTipoDoc = "", idtipoRol = "", descripcionTipoDoc = "", nomRol = "", estado = "";

    public usuarioDao() {
    }

    public usuarioDao(usuarioVo usuVo) {
        super();
        try {
            //conectar BD
            conexion = this.obteneConexion();
            //traer los datos del VO al DAO
            numDoc = usuVo.getNumDoc();
            nomUsu = usuVo.getNomUsu();
            apeUsu = usuVo.getApeUsu();
            pass = usuVo.getPass();
            mail = usuVo.getMail();
            direc = usuVo.getDirec();
            telefo = usuVo.getTelefo();
            idTipoDoc = usuVo.getIdTipoDoc();
            idtipoRol = usuVo.getIdTipoRol();
            descripcionTipoDoc = usuVo.getDescripcionTipoDoc();
            nomRol = usuVo.getNomRol();
            estado = usuVo.getEstado();

        } catch (Exception e) {
            Logger.getLogger(usuarioDao.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public boolean agregar() {
        try {
            sql = "insert into usuarios ( nomUsu, apeUsu, numDoc, pass, mail, direc, telefo,  idTipoDoc, idtipoRol, estado) values(?,?,?,?,?,?,?,?,'1','1')";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, nomUsu);
            puente.setString(2, apeUsu);
            puente.setString(3, numDoc);
            puente.setString(4, pass);
            puente.setString(5, mail);
            puente.setString(6, direc);
            puente.setString(7, telefo);
            puente.setString(8, idTipoDoc);
            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(usuarioDao.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(usuarioDao.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    //@ correguir
    @Override
    public boolean eliminar() {
        try {
            sql = "update Usuarios set estado = 'Cancelado' where numDoc = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, numDoc);
            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(usuarioDao.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(usuarioDao.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    @Override
    public boolean actualizar() {
        try {
            sql = "update usuarios set  nomUsu=?, apeUsu=?, pass=?, mail=?, direc=?, telefo=?, idTipoDoc=?, idTipoRol=?, estado=? where numDoc=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, nomUsu);
            puente.setString(2, apeUsu);
            puente.setString(3, pass);
            puente.setString(4, mail);
            puente.setString(5, direc);
            puente.setString(6, telefo);
            puente.setString(7, idTipoDoc);
            puente.setString(8, idtipoRol);
            puente.setString(9, estado);
            puente.setString(10, numDoc);
            puente.executeUpdate();
            operacion = true;

        } catch (Exception e) {
            Logger.getLogger(usuarioDao.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(usuarioDao.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    public boolean iniciarSecion(String usuDoc, String usuPass) {

        try {
            conexion = this.obteneConexion();
            sql = "select * from usuarios where numDoc=? and pass=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, usuDoc);
            puente.setString(2, usuPass);
            mensajero = puente.executeQuery();
            if (mensajero.next()) {
                operacion = true;
            }
        } catch (Exception e) {
            Logger.getLogger(usuarioDao.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(usuarioDao.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    public usuarioVo consultarPorDocumento(String id) {
    usuarioVo usuVO = null;
    try {
        conexion = this.obteneConexion();
        sql = "select * from usuarios where numDoc = ?";
        puente = conexion.prepareStatement(sql);
        puente.setString(1, id);
        mensajero = puente.executeQuery();
        while (mensajero.next()) {
            usuVO = new usuarioVo(id, mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9), mensajero.getString(10));
        }

    } catch (Exception e) {
        Logger.getLogger(usuarioVo.class.getName()).log(Level.SEVERE, null, e);
    } finally {
        try {
            this.cerrarConexion();
        } catch (Exception e) {
            Logger.getLogger(usuarioVo.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    return usuVO;
}


    public ArrayList<usuarioVo> Listar() {

        ArrayList<usuarioVo> ListarUsuarios = new ArrayList<>();
        try {
            conexion = this.obteneConexion();
            sql = "select * from vista_usuarios";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                usuarioVo usuVO = new usuarioVo(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9), mensajero.getString(10), mensajero.getString(11), mensajero.getString(12));
                ListarUsuarios.add(usuVO);
            }
        } catch (Exception e) {
            Logger.getLogger(usuarioVo.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(usuarioVo.class.getName()).log(Level.SEVERE, null, e);
            }
            return ListarUsuarios;
        }
    }
}
