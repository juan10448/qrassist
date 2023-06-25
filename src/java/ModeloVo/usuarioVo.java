/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVo;


public class usuarioVo {
    
private String  numDoc, nomUsu, apeUsu, pass, mail, direc, telefo,  idTipoDoc, idTipoRol, descripcionTipoDoc, nomRol, estado;

    public usuarioVo() {
    }

    public usuarioVo(String numDoc, String nomUsu, String apeUsu, String pass, String mail, String direc, String telefo, String idTipoDoc, String idTipoRol, String descripcionTipoDoc, String nomRol, String estado) {
        this.numDoc = numDoc;
        this.nomUsu = nomUsu;
        this.apeUsu = apeUsu;
        this.pass = pass;
        this.mail = mail;
        this.direc = direc;
        this.telefo = telefo;
        this.idTipoDoc = idTipoDoc;
        this.idTipoRol = idTipoRol;
        this.descripcionTipoDoc = descripcionTipoDoc;
        this.nomRol = nomRol;
        this.estado = estado;
    }

    

    public usuarioVo(String numDoc, String nomUsu, String apeUsu, String pass, String mail, String direc, String telefo, String idTipoDoc, String idTipoRol, String estado) {
        this.numDoc = numDoc;
        this.nomUsu = nomUsu;
        this.apeUsu = apeUsu;
        this.pass = pass;
        this.mail = mail;
        this.direc = direc;
        this.telefo = telefo;
        this.idTipoDoc = idTipoDoc;
        this.idTipoRol = idTipoRol;
        this.estado = estado;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getNomUsu() {
        return nomUsu;
    }

    public void setNomUsu(String nomUsu) {
        this.nomUsu = nomUsu;
    }

    public String getApeUsu() {
        return apeUsu;
    }

    public void setApeUsu(String apeUsu) {
        this.apeUsu = apeUsu;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getTelefo() {
        return telefo;
    }

    public void setTelefo(String telefo) {
        this.telefo = telefo;
    }

    public String getIdTipoDoc() {
        return idTipoDoc;
    }

    public void setIdTipoDoc(String idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    public String getIdTipoRol() {
        return idTipoRol;
    }

    public void setIdTipoRol(String idTipoRol) {
        this.idTipoRol = idTipoRol;
    }

    public String getDescripcionTipoDoc() {
        return descripcionTipoDoc;
    }

    public void setDescripcionTipoDoc(String descripcionTipoDoc) {
        this.descripcionTipoDoc = descripcionTipoDoc;
    }

    public String getNomRol() {
        return nomRol;
    }

    public void setNomRol(String nomRol) {
        this.nomRol = nomRol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    

}
