/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVo;

/**
 *
 * @author juans
 */
public class formacionVo  {
     private String idFor, nomFor ;

    public formacionVo() {
    }
    
    public formacionVo(String idFor, String nomFor) {
        this.idFor = idFor;
        this.nomFor = nomFor;
    }

    public formacionVo(formacionVo idFor, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdFor() {
        return idFor;
    }

    public void setIdFor(String idFor) {
        this.idFor = idFor;
    }

    public String getNomFor() {
        return nomFor;
    }

    public void setNomFor(String nomFor) {
        this.nomFor = nomFor;
    }
         
}
