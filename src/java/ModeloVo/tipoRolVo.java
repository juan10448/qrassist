/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVo;


public class tipoRolVo {
    private String idTipoRol, nomRol;

    public tipoRolVo() {
    }

    public tipoRolVo(String idTipoRol, String nomRol) {
        this.idTipoRol = idTipoRol;
        this.nomRol = nomRol;
    }

    public String getIdTipoRol() {
        return idTipoRol;
    }

    public void setIdTipoRol(String idTipoRol) {
        this.idTipoRol = idTipoRol;
    }

    public String getNomRol() {
        return nomRol;
    }

    public void setNomRol(String nomRol) {
        this.nomRol = nomRol;
    }
    
    
}
