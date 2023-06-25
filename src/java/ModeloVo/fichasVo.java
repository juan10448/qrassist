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
public class fichasVo {
    private String idFicha, idFor, nomFor, feIni, feFin;  
    
    public fichasVo() {
    }

    public fichasVo(String idFicha, String idFor, String nomfor, String feIni, String feFin) {
        this.idFicha = idFicha;
        this.idFor = idFor;
        this.nomFor = nomfor;
        this.feIni = feIni;
        this.feFin = feFin;
    }
    
    public fichasVo(String idFicha, String idFor, String feIni, String feFin) {
        this.idFicha = idFicha;
        this.idFor = idFor;
        this.feIni = feIni;
        this.feFin = feFin;
    }

    public String getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(String idFicha) {
        this.idFicha = idFicha;
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

    public String getFeIni() {
        return feIni;
    }

    public void setFeIni(String feIni) {
        this.feIni = feIni;
    }

    public String getFeFin() {
        return feFin;
    }

    public void setFeFin(String feFin) {
        this.feFin = feFin;
    }

   

    

    
   
    
}
