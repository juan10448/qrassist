/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVo;

public class documentoVo {
    private String  idTipoDOc, descripcion;

    public documentoVo(String idTipoDOc, String descripcion) {
        this.idTipoDOc = idTipoDOc;
        this.descripcion = descripcion;
    }

    public documentoVo() {
    }

    public String getIdTipoDOc() {
        return idTipoDOc;
    }

    public void setIdTipoDOc(String idTipoDOc) {
        this.idTipoDOc = idTipoDOc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
